/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Madeline Vande Hey
 * @version 04/12/22
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // return name
    public String getName(){
        return "Box";
    }

    // equality check, compares box to cube4
    public String equalCheck(Box4 s){
        if(s.getLength() == getLength() && s.getWidth() == getWidth() && s.getHeight() == getHeight()){
            return getName() + " " + getLength() + " X " + getWidth() + " X " + getHeight() + " IS the same as " + s.getName() + " " + getLength() + " X " + getWidth() + " X " + getHeight();
        }
        else return getName() + " " + getLength() + " X " + getWidth() + " X " + getHeight() + " is NOT the same as " + s.getName() + " " + s.getLength() + " X " + s.getLength() + " X " + s.getHeight();
    }

    // string to display when object is printed.
    public String toString()
    {
        return getName() + " - " + getLength() + " X " + getWidth() + " X " + height;
    }
}
