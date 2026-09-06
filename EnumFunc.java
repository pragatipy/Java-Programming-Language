public class EnumFunc{
    public static void main(String []agrs){
        Direction[] d= Direction.values();
        for(Direction dir:d){
            System.out.println(dir.name());
        }
        Direction d1=Direction.valueOf("NORTH");
        System.out.println(d1.name());
        System.out.println(d1.ordinal());
    }

}
//values()---> use to iterate the constants of enum
//name()---> use to get the name of enum constant
//valueOf()---> use to get the enum constant of specified name
//ordinal()---> use to get the position of enum constant in enum declaration---> kind of indexing
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