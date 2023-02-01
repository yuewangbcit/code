package code.inheritance.orderOfInitialization;

/**
 * Demonstrates what happens when we call a method
 * from inside a constructor.
 */
public class Widgets {
    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        new RoundWidget(5);
    }
}

/**
 * A widget can be drawn.
 */
abstract class Widget {
    Widget() {
        System.out.println("Widget() before draw()");
        draw();
        System.out.println("Widget() after draw()");
    }

    abstract void draw();
}

/**
 * A round widget.
 */
class RoundWidget extends Widget {
    private int radius = 1;

    RoundWidget(int r) {
        System.out.println("radius in RoundWidget=" + radius);
        radius = r;
        System.out.println("RoundWidget.RoundWidget(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundWidget.draw(), radius = " + radius);
    }
}


