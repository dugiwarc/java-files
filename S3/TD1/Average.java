public class Average {
    public static void main(String[] args) {
        double total = 0.0;
        for (String item : args) {
            total += Integer.parseInt(item);
        }
        System.out.println(total / args.length);
    }
}