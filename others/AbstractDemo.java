public class AbstractDemo {
    public static void main(String[] args) {
        AbstractSalary s = new AbstractSalary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        AbstractEmployee d = new AbstractSalary("George W.", "Houston, TX", 2, 2400.00);
        System.out.println("\n Call to mailCheck using Salary reference--");
        s.mailCheck();
        System.out.println("\n Call to mailCheck using Employee reference--");
        d.mailCheck();
    }
}