package zadanie1;

public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfBirth;

    public Student(){}
    public Student(String imie, double ocenasr, int rokur)
    {
        this.name = imie;
        if(ocenasr < 1.00) this.averageGrade = 1.00;
        else if (ocenasr > 6.00) this.averageGrade = 6.00;
        else this.averageGrade = ocenasr;
        if(rokur > 1950 || rokur < java.time.LocalDate.now().getYear() - 19)
            this.yearOfBirth = rokur;
        else
            throw new IllegalArgumentException("Niepoprawny rok urodzenia!");
    }

    public double getAverageGrade()
    {
        return averageGrade;
    }
    @Override
    public int compareTo(Student s)
    {
        return Double.compare(this.averageGrade, s.averageGrade);
    }
    @Override
    public String toString()
    {
        return "Imię: " + this.name + ", Średnia: " + this.averageGrade + ", Rok Urodzenia: " + this.yearOfBirth;
    }
}
