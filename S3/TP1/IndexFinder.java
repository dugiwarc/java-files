public class IndexFinder {
    public static void main(String args[]) {
        String s1 = "instance de string";
        int index1 = s1.indexOf('s', (s1.indexOf('s')) + 1);
        System.out.println(index1);
    }
}