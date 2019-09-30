class Superclass {
    int age;

    Superclass(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " + age);
    }
}

public class SubClass1 extends Superclass {
    int age = 10;

    public SubClass1(int age) {
        super(age);
    }

    public static void main(String args[]) {
        SubClass1 s = new SubClass1(24);
        s.getAge();
    }
}