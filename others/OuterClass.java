public class OuterClass {
    void myMethod() {
        int num = 23;

        class MethodInnerDemo {
            public void print() {
                System.out.println("This is method inner class" + num);
            }
        }

        MethodInnerDemo inner = new MethodInnerDemo();
        inner.print();
    }

    public static void main(String args[]) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
    }
}