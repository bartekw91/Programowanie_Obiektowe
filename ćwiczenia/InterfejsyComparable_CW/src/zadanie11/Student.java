package zadanie11;

public class Student implements Comparable<Student>{
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

    public String getName()
    {
        return name;
    }

    public double getAverageGrade()
    {
        return averageGrade;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
    @Override
    public int compareTo(Student s)
    {
        if(Double.compare(this.averageGrade, s.averageGrade) == 0)
            return this.yearOfBirth - s.yearOfBirth;
        else
            return Double.compare(s.averageGrade, this.averageGrade);
    }
    @Override
    public String toString()
    {
        return "Imię: " + this.name + ", Średnia: " + this.averageGrade + ", Rok Urodzenia: " + this.yearOfBirth;
    }
}
