class OuterDemo {
    private int num = 175;

    public class InnerDemo {
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }

}

public class MyClass2 {
    public static void main(String args[]) {
        OuterDemo outer = new OuterDemo();
        OuterDemo.InnerDemo inner = outer.new InnerDemo();

        System.out.println(inner.getNum());
    }
}