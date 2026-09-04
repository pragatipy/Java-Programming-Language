public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.print();
        s2.print();

        s1.markattendance();
        s2.markattendance();
    }
}

class Student {
    String name;
    int age;
    String college;
    int rollno;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        college = "Unknown";
        rollno = 0;
    }
    // Parameterized constructor
    // Student(String n, int a, String c, int r) {
    //     name = n;
    //     age = a;
    //     college = c;
    //     rollno = r;
    // }

    void markattendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + " " + age + " " + college + " " + rollno);
    }
}