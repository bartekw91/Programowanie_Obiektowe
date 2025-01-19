@Override
public int hashCode() {
    int result = 17; // Można zacząć od dowolnej liczby niezerowej
    result = 31 * result + age;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
}
