public class Super {
    
    public static void main(String[] args){
        Engineering e=new Engineering(101, "Pragati", 21, "IILM");
        e.print();
        // e.markattendance();
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
    Student(String name,int age,String college){
        this.name=name;
        this.age=age;
        this.college=college;
    }
}
class Engineering extends Student{
    void print(){
        System.out.println(super.name+","+super.age+","+super.college+","+super.rollno);
        super.markattendance();
    
    }
    Engineering(int rollno,String name,int age,String college){
        //here super is used to call the constructor of parent class
        super(name,age,college);
        this.rollno=rollno;
    }
}