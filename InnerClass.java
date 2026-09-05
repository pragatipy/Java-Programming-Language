public class InnerClass{
    public static void main(String[] args){
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        //Outer.Inner inner=new Outer().new Inner() ---------> THIS IS ANOTHER WAY TO CREATE AN OBJECT OF INNER CLASS
        inner.display();

    }
}
class Outer{
    int x=10;
    class Inner{
        void display(){
            int x=20;
            System.out.println("This is an inner class.");
            System.out.println("Inner class variable: "+x);
            System.out.println("Outer class variable: "+Outer.this.x);
        }
    }
}