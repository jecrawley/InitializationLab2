package crawley.james.InitializationLab2;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class InitializationLab2 {

    public static void main (String[] args) {

        ColorfulThing red = new ColorfulThing(Color.RED);
        ColorfulThing green = new ColorfulThing(Color.GREEN);
        ColorfulThing blue = new ColorfulThing(Color.BLUE);

        ThingContainer colors = new ThingContainer(2);

        System.out.println("Adding red.");
        colors.add(red);
        System.out.println("Printing contents");
        colors.printThings();
        System.out.println("Adding green.");
        colors.add(green);
        System.out.println("Printing contents");
        colors.printThings();
        System.out.println("Trying to add blue.");
        colors.add(blue);
        System.out.println("Printing contents.");
        colors.printThings();
        System.out.println("Popping container.");
        colors.pop();
        System.out.println("Printing contents.");
        colors.printThings();
        System.out.println("Adding green.");
        colors.add(green);
        System.out.println("Removing red object.");
        colors.remove(red);
        System.out.println("Printing contents.");
        colors.printThings();
        System.out.println("Adding blue.");
        colors.add(blue);
        System.out.println("Printing contents.");
        colors.printThings();
        System.out.println("Removing blue color.");
        colors.remove(blue.getColor());
        System.out.println("Printing contents.");
        colors.printThings();
        System.out.println("Removing blue color from container with no blue colored object.");
        colors.remove(blue.getColor());
        System.out.println("Removing red object from container with no red object.");
        colors.remove(red);
        System.out.println("Popping container.");
        colors.pop();
        System.out.println("Popping empty container.");
        colors.pop();

    }
}
