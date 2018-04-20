public class CheckJava {

    public static void main(String[] args) {
        Rectangle rectangle;
        Rectangle copy = null;
        ShallowCopyClass shallowCopyClass = new ShallowCopyClass(10, "shallow");
        DeepCopyClass deepCopyClass = new DeepCopyClass(11, "deep");
        DeepCopyClassTwo deepCopyClassTwo = new DeepCopyClassTwo(13, "deep2");
        DeepCopyClassTwo deepCopyClassTwo1 = null;
        ShallowCopyClass shallowCopy = null;
        DeepCopyClass deepCopy = null;
        rectangle = new Rectangle(1, "one");

        shallowCopyClass.addList("some");
        shallowCopyClass.addList("where");
        shallowCopyClass.addList("beyond");

        deepCopyClass.addList("some");
        deepCopyClass.addList("where");
        deepCopyClass.addList("beyond");

        deepCopyClassTwo.addList("some");
        deepCopyClassTwo.addList("where");
        deepCopyClassTwo.addList("beyond");



        try {
            copy = rectangle.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            shallowCopy = (ShallowCopyClass) shallowCopyClass.clone();
            deepCopy =  deepCopyClass.clone();
            deepCopyClassTwo1 = deepCopyClassTwo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        shallowCopy.addList("the rainbow");
        deepCopy.addList("i'll see you");
        deepCopyClassTwo1.addList("yo");



        System.out.println(copy.getB());

        copy.setB("two");

        System.out.println(copy.getB());
        System.out.println(rectangle.getB());
        System.out.println(copy.getClass() == rectangle.getClass());

        System.out.println(shallowCopy.getStrings().toString()
                +"\n" + shallowCopyClass.getStrings().toString()
                +"\n" + deepCopy.getStrings().toString()
                +"\n" + deepCopy.getStrings().toString()
                +"\n" + deepCopyClassTwo.getStrings().toString()
                +"\n" + deepCopyClassTwo1.getStrings().toString()
        );


    }
}
