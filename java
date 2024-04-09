import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    private String name;
    private int RollNo;
    private Double marks;
    
    public Student(String name, int rollNo, Double marks) {
        this.name = name;
        RollNo = rollNo;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return RollNo;
    }
    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }
    public Double getMarks() {
        return marks;
    }
    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", RollNo=" + RollNo + ", marks=" + marks + "]";
    }

}
public class Demo {

  public static void main(String[] args) {
 
    ArrayList<Student>studentslist = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\n school management system");
        System.out.println("1.enter the student list");
        System.out.println("2.update students marks");
        System.out.println("3.Display all students");
        System.out.println("4.exit..");
        System.out.println("choice the number");
        int choice = scanner.nextInt();
  
        switch (choice) {
            case 1:
                 System.out.println("enter the student name");
                 scanner.nextLine();
                 String name = scanner.nextLine();
                 System.out.println("enter the rollno");
                 int RollNo = scanner.nextInt();
                 System.out.println("enter the marks ");
                 Double marks = scanner.nextDouble();
                 Student student = new Student(name, RollNo, marks);
                 studentslist.add(student);  
                 System.out.println("students added sucessfully");              
                break;
                case 2:
                if(studentslist.isEmpty())
                {
                    System.out.println("students not founded");
                }
                else
                {
                    System.out.println("enter the rollno to updated");
                    int rollToupdate = scanner.nextInt();
                    boolean found = false;
                    for(Student stu:studentslist)
                    {
                        if(stu.getRollNo() == rollToupdate)
                        {
                            System.out.println("enter the new marks");
                            double newmarks = scanner.nextDouble();
                            stu.setMarks(newmarks);
                            System.out.println("mark updated suceffuly");
                            found = true;
                        }
                        
                    }
                    if(!found)
                    {
                        System.out.println("student roll number "+rollToupdate+"not founded");
                    }
                }
                 break;
                 case 3:
                    if(studentslist.isEmpty())
                    {
                        System.out.println("no students to display");
                    }
                    else
                    {
                        System.out.println("students list: ");
                        for(Student stu:studentslist)
                        {
                            System.out.println(stu);
                        }
                    }
                 break;
          case 4:
          {
               System.out.println("Exiting...");
               scanner.close();
               System.exit(0);
          }
                break;
                default:
                System.out.println("Invalid choice plese try again later");
        }
    }
  }  
}
