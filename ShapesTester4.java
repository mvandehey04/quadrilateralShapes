/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Madeline Vande Hey
 * @version 04/12/22
 */

import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        //shapes
        Rectangle4 one = new Rectangle4(5, 20);
        Box4 two = new Box4(4, 10, 5);
        Cube4 three = new Cube4(3,8,7);
        Square four = new Square(2,2);
        Rhombus five = new Rhombus(3,3);
        Rhombus six = new Rhombus(2,2);
        Box4 seven = new Box4(3,8,7);
        Cube4 eight = new Cube4(4,4,4);
        Box4 nine = new Box4(4,4,4);

        // arraylist
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        // add shapes to arraylist
        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        shapes.add(six);
        shapes.add(seven);

        System.out.println("My Shapes:\n");

        // print shapes
        for(Rectangle4 rect: shapes)
        {
        	showEffectBoth(rect);
        }

        // check for equality statements
        System.out.println("\nTest for Equality:\n");
        System.out.println(one.equalCheck(four));
        System.out.println(four.equalCheck(five));
        System.out.println(two.equalCheck(three));
        System.out.println(four.equalCheck(six));
        System.out.println(seven.equalCheck(three));
        System.out.println(six.equalCheck(four));
        System.out.println(eight.equalCheck(nine));
    }

    public static void showEffectBoth(Rectangle4 r){
        System.out.println(r.toString());
    }

}
