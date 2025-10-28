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

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public void getLecturerDetails() {
        System.out.println("Name:" + getName());
        System.out.println("ID:" + getId());
        System.out.println("Department:" + getDepartment() + "\n");
    }
}
