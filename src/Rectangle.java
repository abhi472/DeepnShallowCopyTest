public class Rectangle implements Cloneable {
    int a;
    String b;

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }




    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Rectangle(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
