/** This is my Code!! My goal is to translate Cartesian and Polar Points
 *CS 312 - Assignment 1
 *@ author Michael Higgins
 * @ Version 1 9/11/2020
 **/
class PolarPoint extends Pollock{
    private double AnglePolarTheta=35;
    private double AngleR=45;

    public String Rotate(double thetaRotate) {
        AnglePolarTheta = AnglePolarTheta + thetaRotate;
        return ""+AnglePolarTheta;
    }
    public String Translate(double by_x, double by_y) {
        //doing the translation from a polar to a cartesian point
        AnglePolarTheta = AngleR * Math.cos(AnglePolarTheta);
        AngleR = AngleR * Math.sin(AngleR);
        //doing the actual translation
        AnglePolarTheta = AnglePolarTheta + by_x;
        AngleR = AngleR + by_y;
        //converting back to a polar point
        AnglePolarTheta = Math.sqrt(Math.pow(AnglePolarTheta, 2) + Math.pow(AngleR, 2));
        AngleR = Math.atan(AnglePolarTheta / AngleR);
        return AnglePolarTheta+","+AngleR;
    }
}
