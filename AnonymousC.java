public class AnonymousC{
    public static void main(String[] args){
        Person p=new Person(){
            String name="Pragati";
            @Override
            void introduce(){
                System.out.println("I am an anonymous class.");
                greet();
            }
            void greet(){
                System.out.println("Hello "+name);
            }
            
            
        };
        p.introduce();

    }
}
class Person{
    void introduce(){
        System.out.println("I am a person.");
    }
}