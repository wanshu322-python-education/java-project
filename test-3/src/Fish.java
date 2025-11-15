public class Fish
{
    private String name;
    private double length;

    public Fish (String n, double len)
    {
        name = n;
        length = len;
    }

    public double getLength()
    {
        return length;
    }

    public boolean equals (Fish f1)
    {
        if (f1 == null)
            return false;
        else
            return name.equals(f1.name);
    }
    public static void main(String[] arg)  {
    Fish f1 = new Fish("Trout", 11.75);
    Fish f2 = null;

    System.out.println(f1 == f2);              // #1
    System.out.println(f2 == f1);              // #2
    //System.out.println(f1.getLength() + f2.getLength());   // #3
    System.out.println(f1.equals(f2));         // #4
    //System.out.println(f2.equals(f1));         // #5

    f2 = f1;
    System.out.println(f1 == f2);              // #6


   }
}