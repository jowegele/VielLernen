package VielLernen;

class Point {
    private double z = 0.0;
    double x, y;
    void clear(){
        x = z;
        y = z;
    }
    void clean(){
        x = z;
        y = z;
    }
    void MultiplyByTwo(){
        x = x*2;
        y = y*2;
    }
    void interchange(){
        x=y+x;
        y=x-y;
        x=x-y;
    }

    static Point origin;
    static {
        origin = new Point();

    }
    double Vektorprodukt(){
        double xdiff = x;
        double ydiff = y;
        return Math.sqrt(xdiff * xdiff + ydiff + ydiff);
    }
    double distance(Point that){
        double xdiff = x - that.x;
        double ydiff = y - that.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }
}
