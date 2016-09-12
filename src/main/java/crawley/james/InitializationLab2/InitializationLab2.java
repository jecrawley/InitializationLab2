package crawley.james.InitializationLab2;

import java.util.Random;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class InitializationLab2 {

    public static void main (String[] args) {

        ColorfulThing red = new ColorfulThing(Color.RED);
        ColorfulThing green = new ColorfulThing(Color.GREEN);
        ColorfulThing blue = new ColorfulThing(Color.BLUE);
        ColorfulThing cyan = new ColorfulThing(Color.CYAN);
        ColorfulThing magenta = new ColorfulThing(Color.MAGENTA);
        ColorfulThing yellow = new ColorfulThing(Color.YELLOW);

        ColorfulThing[] primaryAndSecondaryColors = {red, green, blue, cyan, magenta, yellow};

        ThingContainer colors0 = new ThingContainer(5);
        ThingContainer colors1 = new ThingContainer(4);
        ThingContainer colors2 = new ThingContainer(3);
        ThingContainer colors3 = new ThingContainer(3);
        ThingContainer colors4 = new ThingContainer(primaryAndSecondaryColors);

        Random random = new Random();

        //Part 1
        System.out.println("Part 1 Tests \n");

        for (int i = 0; i < 5; i++) {
            int randColor0 = random.nextInt(6);
            int randColor1 = random.nextInt(6);
            int randColor2 = random.nextInt(6);

            colors0.add(primaryAndSecondaryColors[randColor0]);
            colors1.add(primaryAndSecondaryColors[randColor1]);
            colors2.add(primaryAndSecondaryColors[randColor2]);

        }

        System.out.println("Things in colors0");
        colors0.printThings();
        System.out.println("Thins in colors1");
        colors1.printThings();
        System.out.println("Things in colors2");
        colors2.printThings();

        System.out.println("-----------\n");
        System.out.println("-----------");

        System.out.println("Part 2 Tests \n");

        //Part 2
        System.out.println("Adding red to empty ThingContainer initialized with int for size.");
        colors3.add(red);
        System.out.println("Printing contents");
        colors3.printThings();
        System.out.println("Adding green.");
        colors3.add(green);
        System.out.println("Printing contents");
        colors3.printThings();
        System.out.println("Trying to add blue.");
        colors3.add(blue);
        System.out.println("Printing contents.");
        colors3.printThings();
        System.out.println("Popping container.");
        colors3.pop();
        System.out.println("Printing contents.");
        colors3.printThings();
        System.out.println("Adding green.");
        colors3.add(green);
        System.out.println("Removing red object.");
        colors3.remove(red);
        System.out.println("Printing contents.");
        colors3.printThings();
        System.out.println("Adding blue.");
        colors3.add(blue);
        System.out.println("Printing contents.");
        colors3.printThings();
        System.out.println("Removing blue color.");
        colors3.remove(blue.getColor());
        System.out.println("Printing contents.");
        colors3.printThings();
        System.out.println("Removing blue color from container with no blue colored object.");
        colors3.remove(blue.getColor());
        System.out.println("Removing red object from container with no red object.");
        colors3.remove(red);
        System.out.println("Popping container.");
        colors3.pop();
        System.out.println("Popping empty container.");
        colors3.pop();

        System.out.println("-----------\n");
        System.out.println("-----------");

        System.out.println("Part 3 Tests \n");

        //Part 3
        System.out.println("Printing contents of ThingContainer initialized with array.");
        colors4.printThings();
        System.out.println("Trying to add yellow.");
        colors4.add(yellow);
        System.out.println("Popping container.");
        colors4.pop();
        System.out.println("Adding yellow.");
        colors4.add(yellow);




    }
}
