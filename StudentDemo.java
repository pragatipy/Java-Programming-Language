public class StudentDemo{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Pragati";
        s1.age=21;
        s1.college="IILM";
        s1.rollno=101;
        s2.name="Ananya";
        s2.age=22;
        s2.college="IILM";
        s2.rollno=102;
        s1.markattendance();
        s2.markattendance();
        s1.print();
        s2.print();
    }
}
class Student{
    String name;
    int age;
    String college;
    int rollno;

    void markattendance(){
        System.out.println("Attendance marked by"+" "+name);
    }
    void print(){
        System.out.println(name+" "+age+" "+college+" "+rollno);
    }
}
