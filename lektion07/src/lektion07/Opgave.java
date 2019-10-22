package lektion07;

import lektion07.figurer.Point;

public class Opgave {
    public static void main(String[] args) {
        System.out.println("Opgave");


        Point pnt1 = new Point(0, 0);
        Point pnt2 = new Point(0, 0);
        System.out.println("X: " + pnt1.getX() + " Y: " + pnt1.getY());
        System.out.println("X: " + pnt2.getX() + " Y: " + pnt2.getY());
        System.out.println(" ");
        tricky(pnt1, pnt2);
        System.out.println("X: " + pnt1.getX() + " Y:" + pnt1.getY());
        System.out.println("X: " + pnt2.getX() + " Y: " + pnt2.getY());

    }

    public static void tricky(Point arg1, Point arg2)
    {
        // ar1 = pnt1, arg2 = pnt2
        arg1.setX(100);
        arg1.setY(100);
        Point temp = arg1;
        arg1 = arg2;
        arg2 = temp;
    }
}
