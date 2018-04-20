import java.util.ArrayList;

public class DeepCopyClass extends ShallowCopyClass{

    public DeepCopyClass(int a, String b) {
        super(a, b);
    }

    @Override
    protected DeepCopyClass clone() throws CloneNotSupportedException {
        DeepCopyClass deepCopyClass = null;

        deepCopyClass = (DeepCopyClass) super.clone();
        deepCopyClass.setStrings(new ArrayList<>(super.getStrings()));

        return deepCopyClass;
    }
}
