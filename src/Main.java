public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bMI = service.calculate(56.0, 1.67);
        System.out.println("bMI: " + bMI);

    }
}
