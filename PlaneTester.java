public class PlaneTester {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        Plane p2 = new Plane("Chicago");

        System.out.println("p1 current: " + p1.getCurrentLocation());
        System.out.println("p2 current: " + p2.getCurrentLocation());

        p1.setNext("New York");
        p1.fly();
        System.out.println("p1 after flying: " + p1.getCurrentLocation());
    }
}
