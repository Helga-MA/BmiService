public class BmiService {
    public double calculate(double weight, double height) {
        double bMI = weight / (height * height);
        System.out.println("bMI: " + bMI);
        return bMI;
    }

}
