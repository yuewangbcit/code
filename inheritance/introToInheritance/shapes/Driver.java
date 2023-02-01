package code.inheritance.introToInheritance.shapes;

public class Driver {

    public static void main(String[] args) {
        Cube myCube = new Cube(8);
        Sphere mySphere = new Sphere(2.7);

        System.out.println(myCube);

        Shape shape = myCube;
        Shape anotherShape = mySphere;
        System.out.println(shape);

        Shape myOtherCube = new Cube(9);

        Cube myAlias = (Cube) myOtherCube;
    }
}
