/** This is my Code!! My goal is to translate Cartesian and Polar Points
 *CS 312 - Assignment 1
 *@ author Michael Higgins
 * @ Version 1 9/11/2020
 **/
class CartesianPoint extends Pollock{
    private double x= 30;
    private double y = 30;
    public String Rotate(double RotatedBy) {
        x = (x * Math.cos(RotatedBy)) - (y * Math.sin(RotatedBy));
        y = (x * Math.sin(RotatedBy)) + (y * Math.cos(RotatedBy));
        return x+","+y;
    }
    public String Translate(double by_x,double by_y){
        x=x+by_x;
        y=y+by_y;
        return x+","+y;
    }
}
