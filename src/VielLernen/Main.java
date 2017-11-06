package VielLernen;

class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World \n");
        Point lowerLeft = new Point();
        Point lowerRight = new Point();

        lowerLeft.x = 243.34;
        lowerLeft.y = 32;

        System.out.println("lowerLeft x value is " + lowerLeft.x);

        lowerRight.x = 34;
        lowerRight.y = 52.2;

        System.out.println("\nlowerRight.x is " + lowerRight.x + " and lowerRight.y is " + lowerRight.y);
        lowerRight.interchange();
        System.out.println("\nlowerRight.x is " + lowerRight.x + " and lowerRight.y is " + lowerRight.y);
             lowerRight.MultiplyByTwo();
        System.out.println("\nlowerRight.x is " + lowerRight.x + " and lowerRight.y is " + lowerRight.y);

        double d; //Variable d
        d = lowerRight.distance(lowerLeft);
        System.out.println("\ndistance between lowerRight & lowerLeft: " + d);

        d = lowerRight.Vektorprodukt();
        System.out.println("\nVektorprodukt of lowerRight: " + d);

        lowerLeft.clear();
        System.out.println("\nlowerLeft x value after applying the methode clear() is " + lowerLeft.x);

        lowerRight.clean();
        System.out.println("\nlowerRight x value after applying the methode clean(): " + lowerRight.x);

        System.out.println("\norigin is a static field: " + Point.origin.x +" / " + Point.origin.y + " Oh year! ");
    }
}
