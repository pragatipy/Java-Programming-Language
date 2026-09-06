public class Enum{
    public static void main(String []args){
        Direction d1=Direction.NORTH;
        System.out.println(d1);
        System.out.println(d1.getDegree());
        Direction d2=Direction.SOUTH;
        System.out.println(d2);
        System.out.println(d2.getDegree());
    }

}
enum Direction{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);
    private int degree;
    Direction(int degree){
        this.degree=degree;
    }
    public int getDegree(){
        return this.degree;
    }
}