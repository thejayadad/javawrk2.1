import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class School {


    public static void main(String[] args) {
        //STUDENT MANAGEMENT PROGRAM
        //STUDENT HAS F/L NAME - GRADE
        //PROVIDE USER WITH ALL CRUD
        //RETURN ALL

        Scanner scan = new Scanner(System.in);
        List<Student> student = new ArrayList<Student>();
        int num;
        do{


            System.out.println("=================================");
            System.out.println("===WELCOME TO STUDENT DATABASE====");
            System.out.println("=Please Selection A Number Below =");
            System.out.println("0. Exit");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. See All Students");
            System.out.println("4. Update Students");
            System.out.println("5. Search Student");
            System.out.println("CHOICE: ");
            num = scan.nextInt();

            switch(num){
                case 1:
                    System.out.println("Please enter First Name");
                    String fName = scan.next();
                    System.out.println("Please enter Last Name");
                    String lName = scan.next();
                    System.out.println("Please enter Major");
                    String mjr = scan.next();
                    System.out.println("Plese enter Academic Year");
                    int yr = scan.nextInt();
                    System.out.println("Please enter Student Id");
                    int sdId = scan.nextInt();

                    student.add(new Student(fName, lName, mjr, yr, sdId));
                    break;

                case 2:
                    boolean found = false;
                    System.out.println("Please enter the Student ID to be removed ");
                    int studentIDNum = scan.nextInt();
                    System.out.println("=================================");
                    Iterator <Student> i = student.iterator();
                    i = student.iterator();
                    while(i.hasNext()){
                        Student s = i.next();
                        if(s.getStudentId() == studentIDNum){
                            found = true;
                            System.out.println("Student Removed");
                            i.remove();
                        }
                        System.out.println("=================================");
                        if(!found){
                            System.out.println("Student Id not found");
                        } else {
                            System.out.println(" ");
                        }

                    }
                    break;
                case 3:
                System.out.println("");
                System.out.println("");
                System.out.println("");

                System.out.println("=================================");
                i = student.iterator();
                while(i.hasNext()){
                    Student s = i.next();
                    System.out.println(s);
                }
                System.out.println("=================================");
                break;

                case 4:
                    found = false;
                    System.out.println("Please enter Student Id to update");
                    studentIDNum = scan.nextInt();
                    System.out.println("=================================");
                    ListIterator<Student>st = student.listIterator();
                    while(st.hasNext()){
                        Student v = st.next();
                        if(v.getStudentId() == studentIDNum){
                            System.out.println(" ");
                            System.out.println("Please enter First Name");
                            String fnm = scan.next();
                            System.out.println("Please enter Last Name");
                            String lnm = scan.next();
                            System.out.println("Please enter major ");
                            String majr = scan.next();
                            System.out.println("Please enter Academic Year");
                            int yer = scan.nextInt();
                            System.out.println("Please enter Student Id");
                            int ssID = scan.nextInt();

                            st.set(new Student(fnm, lnm, majr, yer, ssID));
                            found = true;

                        }
                        System.out.println("=================================");
                        if(!found){
                            System.out.println("Student ID not found");
                        } else {
                            System.out.println(" ");
                        }
                    }

                    break;

                    case 5:
                        found = false;
                        System.out.println("Please enter Student ID to look up");
                        studentIDNum = scan.nextInt();
                        System.out.println("=================================");
                        i = student.iterator();
                        while(i.hasNext()){
                            Student s = i.next();
                            if(s.getStudentId() == studentIDNum){
                                found = true;
                                System.out.println("Student Found");
                                System.out.println(s);
                            }
                            System.out.println("=================================");

                            if(!found){
                                System.out.println("Studnt ID not found");
                            }

                        }

                        break;





            }


        } while(num != 0);


}
}