public class Cylinder extends Cricle {
    private double height;
    public Cylinder(){
    }

    public Cylinder(double height,double radius, String color) {
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height*this.getArea();
    }
    @Override
    public String toString(){
        return "I am Cylinder "+ this.height + this.getVolume() +super.toString();
    }
}
