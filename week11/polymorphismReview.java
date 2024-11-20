package week11;

public class PolymorphismReview {


  /* Task
 * You are building a geometry application
 * Create a class "Geometry"  with the following overloaded method:
 * a) double calculateArea(double radius) -
 * This method should calculate and return the area of circle with the given radius
 * b) double calculateArea(double length, double width) -
 * This method should calculate and return the area of rectangle with the given length and width
 * c) double calculateArea(double base, double height, boolean type) -
 * This method should calculate and return the area of a triangle with 
 * the given base and height
 * Make an object of Geometry and run all overloaded calculateArea
 */
class Geometry{
    double calculateArea(double radius){
        return 3.14*radius*radius;
    }
    double calculateArea(double length, double width){
        return length*width;
    }
    double calculateArea(double base, double height, boolean type){
        return 0.5*base*height;
    }
}}