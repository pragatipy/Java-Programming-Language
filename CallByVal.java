//call by reference which is not call by value
public class CallByVal{
    public static void main(String[] args){
        Random r=new Random(4,5);
        System.out.println(r.i+" "+r.j);
        addTen(r);
        System.out.println(r.i+" "+r.j);
    }
    static void addTen(Random r){
        r.i=r.i+10;
        r.j=r.j+10;

    }
}
class Random{
    int i;
    int j;
    Random(int i, int j){
        this.i=i;
        this.j=j;
    }
}
