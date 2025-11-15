

class Thing {
    private int id;
    private static int nextId = 1;

    public Thing() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}


public class ConsoleProgram {
    public static void main(String[] args) {

        Thing t1 = new Thing();
        Thing t2 = new Thing();
        Thing t3 = new Thing();

        System.out.println(t2.getId());
    }
}