public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 56.0;
        double height = 1.67;
        double bMI = service.calculate(weight, height);
        System.out.println("bMI: " + bMI);

    }
}
