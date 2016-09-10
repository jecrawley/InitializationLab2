package crawley.james.InitializationLab2;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class ThingContainer {

    int size;
    private ColorfulThing[] colorfulThings;
    private int index = 0;
    //private int poppedIndex;

    public ThingContainer (int size) {
        this.size = size;
        colorfulThings = new ColorfulThing[size];
    }

    public ThingContainer (ColorfulThing[] colorfulThings) {

    }

    public void add (ColorfulThing color) {

        try {

            colorfulThings[index] = color;
            index++;

        } catch (IndexOutOfBoundsException e) {

            System.out.println("ThingContainer is full.");

        }

    }

    public void printThings () {

        for (int i = 0; i < index; i++) {
            System.out.println(colorfulThings[i].getColor().name());
        }

    }

    public ColorfulThing getThing (int index) {

        return colorfulThings[index];

    }

    public ColorfulThing pop () {
        ColorfulThing poppedValue;

        if (!(isEmpty())) {
            poppedValue = colorfulThings[--index];
            colorfulThings[index] = null;
        } else {
            System.out.println("ThingContainer is empty.");
            poppedValue = null;
        }

        return poppedValue;
    }

    public ColorfulThing remove (Color color) {

        ColorfulThing popped = null;

        checkIfContainerIsEmpty();

        for (int i = 0; i < index; i++) {
            if (colorfulThings[i].getColor().equals(color)) {
                popped = colorfulThings[i];
                colorfulThings[i] = null;
                shiftArray(i);
            }
        }

        if (popped == null) {
            System.out.println("No such object in ThingContainer has this color.");
        }

        return popped;

    }

    public ColorfulThing remove (ColorfulThing colorfulThing) {
        ColorfulThing popped = null;

        checkIfContainerIsEmpty();

        for (int i = 0; i < index; i++) {
            if (colorfulThings[i].equals(colorfulThing)) {
                popped = colorfulThings[i];
                colorfulThings[i] = null;
                shiftArray(i);
            }
        }

        if (popped == null) {
            System.out.println("No such object in ThingContainer.");
        }

        return popped;
    }

    public void shiftArray (int poppedIndex) {
        for (int i = poppedIndex; i < index - 1; i++) {
            colorfulThings[i] = colorfulThings[i+1];
        }
        colorfulThings[index - 1] = null;
        index--;

    }

    public boolean isEmpty() {

        if (index == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void checkIfContainerIsEmpty () {

        if (isEmpty()) {
            System.out.println("ThingContainer is empty.");
        }
    }

}
