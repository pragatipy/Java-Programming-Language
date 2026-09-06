public class Enum2{
    public static void main(String []args){
        Direction d1=Direction.NORTH;
        d1.move();
        Direction d2=Direction.SOUTH;
        d2.move();
        Direction d3=Direction.EAST;
        d3.move();
        Direction d4=Direction.WEST;
        d4.move();
    }

}
enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("Moving North");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("Moving South");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Moving East");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Moving West");
        }
    };
    public abstract void move ();
}