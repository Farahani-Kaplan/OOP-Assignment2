public class Main {
    public static void main(String[] args) {
        System.out.println("***** Shape Management Application ******");
        //Test coordinates class
        Coordinates point1 = new Coordinates(10, 20);
        System.out.println(point1.display());
        //Test Rectangle class
        Rectangle r1 = new Rectangle(point1, 10, 20);
        System.out.println(r1.display());
    }
}