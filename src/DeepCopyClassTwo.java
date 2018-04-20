import java.util.ArrayList;

public class DeepCopyClassTwo implements Cloneable {
    private int a;
    private String b;
    private ArrayList<String> strings;

    public DeepCopyClassTwo(int a, String b) {
        this.a = a;
        this.b = b;
        this.strings = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected DeepCopyClassTwo clone() throws CloneNotSupportedException {
        DeepCopyClassTwo deepCopyClassTwo = null;
        deepCopyClassTwo = (DeepCopyClassTwo) super.clone();
        deepCopyClassTwo.strings = new ArrayList<>(strings);
        return deepCopyClassTwo;
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

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public void addList(String val) {
        strings.add(val);
    }
}
