import University.Lecturer;

public class AccessLecturer {
    public static void main(String[] args) {
        Lecturer l1 = new Lecturer("Norman", "CS");
        Lecturer l2 = new Lecturer("Lilyan", "IT");
        Lecturer l3 = new Lecturer("Daniel", "SE");

        System.out.println("\n---Lecturers List---");
        l1.getLecturerDetails();
        l2.getLecturerDetails();
        l3.getLecturerDetails();
    }
}
