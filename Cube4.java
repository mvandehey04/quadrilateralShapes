public class Cube4 extends Box4{

    public Cube4(int l, int w, int h){
        super(l,w,h);
    }

    // return name
    public String getName(){
        return "Cube";
    }

    // string to display when object is printed.
    public String toString()
    {
        return getName() + " - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
