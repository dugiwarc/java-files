interface Message {
    String greet();

    String goodbye();
}

public class MyClass3 {
    // method which accepts the object of interface Message
    public void displayMessage(Message m) {
        System.out.println(m.greet() + ", This is an example of anonymous inner class as an argument." + m.goodbye());
    }

    public static void main(String args[]) {
        // Instantiating the class
        MyClass3 obj = new MyClass3();

        // Passing an anonymous inner class as an argument
        obj.displayMessage(new Message() {
            public String greet() {
                return "Hello";
            }

            public String goodbye() {
                return "Goodbye";
            }
        });

    }
}