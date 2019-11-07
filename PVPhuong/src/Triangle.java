public class Triangle extends Shape {
    private float a = 1.0f, b = 1.0f, c = 1.0f;

    public Triangle() {
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, float a, float b, float c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public double getArea() {
        double temp;
        temp = (a + b + c) / 2;
        return Math.sqrt(temp * (temp - a) * (temp - b) * (temp - c));
    }

    public double getPremiter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "A Triangle with three edge : " + a + " , " + b + " , " + c + " \nThe area is : " + getArea() + " \nThe Perimeter is : " + getPremiter();
    }
}
