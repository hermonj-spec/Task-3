package University;

public class Lecturer {
    private static int counter = 200;
    int id;
    String Name, Department;

    {
        id = ++counter;
    }

    public Lecturer(String Name, String Department) {
        this.Name = Name;
        this.Department = Department;
        System.out.println("Account created for: " + Name + "  " + "Department: " + Department);
    }
}
