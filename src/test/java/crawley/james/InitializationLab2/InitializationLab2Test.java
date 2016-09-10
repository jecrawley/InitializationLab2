package crawley.james.InitializationLab2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class InitializationLab2Test {

    ColorfulThing red = new ColorfulThing(Color.RED);
    ColorfulThing green = new ColorfulThing(Color.GREEN);
    ColorfulThing blue = new ColorfulThing(Color.BLUE);

    @Test
    public void addThingTest () {
        ThingContainer colors = new ThingContainer(3);

        colors.add(red);
        Assert.assertEquals("The color should be red.", Color.RED, colors.getThing(0).getColor());

        colors.add(green);
        Assert.assertEquals("The color should be green.", Color.GREEN, colors.getThing(1).getColor());

        colors.add(blue);
        Assert.assertEquals("The color should be blue.", Color.BLUE, colors.getThing(2).getColor());
    }

    @Test
    public void popTest () {
        ThingContainer colors = new ThingContainer(3);
        ColorfulThing[] addedColors = {red, green, blue };
        ColorfulThing popped;

        addMore(addedColors, colors);
        popped = colors.pop();
        Assert.assertEquals("The popped value should be blue.", blue, popped);

    }

    @Test
    public void removeColorTest () {
        ThingContainer colors = new ThingContainer(3);
        ColorfulThing[] addedColors = {red, green, blue };
        ColorfulThing popped;

        addMore(addedColors, colors);
        popped = colors.remove(green.getColor());
        Assert.assertEquals("The popped value should be green.", green ,popped);
    }

    @Test
    public void removeColorfulThingTest () {
        ThingContainer colors = new ThingContainer(3);
        ColorfulThing[] addedColors = {red, green, blue };
        ColorfulThing popped;

        addMore(addedColors, colors);
        popped = colors.remove(red);
        Assert.assertEquals("The popped value should be red.", red ,popped);
    }


    public void addMore (ColorfulThing[] colorfulThings, ThingContainer things) {

        for(int i = 0; i < colorfulThings.length; i++) {
            things.add(colorfulThings[i]);
        }

    }

}
