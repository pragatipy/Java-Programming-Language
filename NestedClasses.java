public class NestedClasses{
    public static void main(String[] args){
        Outer outer=new Outer();
        Outer.Inner inner=new Outer.Inner();
        inner.display(outer);

    }
}
//static class can be accessed without creating an instance of the outer class. It can access only static members of the outer class. Non-static inner class can access both static and non-static members of the outer class.
class Outer{
    static int outerVar=10;
    int y=1;
    static class Inner{
        void display(Outer outer){
            System.out.println("This is an inner class.");
            System.out.println("Outer class variable: "+outerVar);
            System.out.println("Outer class variable y: "+outer.y);
        }
    }
}
