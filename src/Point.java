public class Point {
    
}

private final double x;
private final double y;

public static final Point ORIGIN = new Point (0,0);

public Point(double x, double y) {
    this.x=x;
    this.y=y;

public double getX() {
    return this.x;
}
public double getY(){
    return this.y;
}

Point a= new Point (3,4);
Point b= new Point(1,2);

System.out.println (a.getX()); //3.0
System.out.println(b.getY()); //2.0

System.out.println(Point.ORIGIN.getX()); //0.0


}
