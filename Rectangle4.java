
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Madeline Vande Hey
 * @version 04/12/22
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // constructor for objects of class Rectangle
    public Rectangle4(int l, int w){
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength(){
        return length;
    }

    // return the width
    public int getWidth(){
        return width;
    }

    // return name
    public String getName(){
        return "Rectangle";
    }

    // equality check, compares rect to square and rhombus
    public String equalCheck(Square s){
        if(s.getLength() == length && s.getLength() == width){
            return getName() + " " + length + " X " + width + " IS the same as " + s.getName() + " " + getLength() + " X " + getLength();
        }
        else return getName() + " " + length + " X " + width + " is NOT the same as " + s.getName() + " " + s.getLength() + " X " + s.getWidth();
    }

    // string to display when object is printed.
    public String toString()
    {
        return getName() + " - " + length + " X " + width;
    }
}
