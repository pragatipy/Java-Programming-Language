public class Autoboxing {
    public static void main(String[] args) {
        int num = 10; // primitive int
        Integer obj = num; // autoboxing: converting primitive to wrapper class
        System.out.println("Autoboxed Integer: " + obj);

       // Integer obj2 = new Integer(20); // creating an Integer object
       Integer obj2 = 20; // autoboxing: converting primitive to wrapper class
        int num2 = obj2; // unboxing: converting wrapper class to primitive
        System.out.println("Unboxed int: " + num2);
    }
}
