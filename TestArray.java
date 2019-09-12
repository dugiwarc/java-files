public class TestArray {
    public static void main(String[] args) {
        double[] myList = { 1.9, 2.9, 3.4, 3.5 };

        for (double i : myList) {
            System.out.println(i + " ");
        }

        double total = 0;
        for (double i : myList) {
            total += i;
        }
        System.out.println("Total is " + total);

        double max = myList[0];
        for (double i : myList) {
            if (i > max)
                max = i;
        }
        System.out.println("Max is " + max);
    }
}