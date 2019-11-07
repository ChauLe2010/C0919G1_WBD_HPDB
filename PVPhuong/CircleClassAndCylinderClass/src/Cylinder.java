public class Cylinder extends Cricle {
    private double height ;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString(){
        return "A Cylinder with radius = "+ getRadius()+" and height = "+ getHeight() +" \n The volume = " + getVolume();
    }
}
