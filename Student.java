public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int year;
    private int studentId;



    public Student(String firstName, String lastName, String major, int year, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.studentId = studentId;
    }

    @Override
    public String toString(){
        String studentInfo = "";
        studentInfo = "First Name: " + firstName + " | Last Name: " + lastName + " | Major: " + major + " | Year: " + year + " | Student Id: " + studentId;
        return studentInfo;
    }
    public int getStudentId(){
        return this.studentId;
    }

}
