package javaprogramme;

/*You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.

 */
public class P16_Point {
    //Instance variable
    int x, y;

    //Constructor
    public P16_Point() {

    }

    //Constructor with parameter
    public P16_Point(int x, int y) {

        this.x = x;
        this.y = y;

    }

    //Instance method with return type
    public int getX() {

        return x;
    }

    //Instance method with return type
    public int getY() {

        return y;
    }

    //Instance method with parameter
    public void setX(int x) {

        this.x = x;

    }

    // //Instance method with parameter
    public void setY(int y) {

        this.y = y;
    }

    //Instance method with return type
    public double distance() {

        return  Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y)); //distance between (0,0)to(x,y)

    }

    //Instance method with return type with parameters
    public double distance(int x1, int y1) {

        return  Math.sqrt((x1 - x) * (x1- x) + (y1 - y) * (y1- y)); //distance between this point (x1,y1)to(x,y)

    }

    //Instance method with return type with parameters
    public double distance(double x1, double y1) {

        return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)); //distance between this point (x1,y1)to(x,y)

    }

    //Main Method
    public static void main(String[] args) {

        P16_Point first = new P16_Point(6, 5);  //create object //give parameters to constructor
        P16_Point second = new P16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance()); //call method
        System.out.println("distance(3,1)= " + first.distance(second.x, second.y)); //call method
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        P16_Point point = new P16_Point();  //create object
        System.out.println("distance()= " + point.distance());  //call method


    }
}

