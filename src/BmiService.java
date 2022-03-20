public class BmiService {
    public double calculate(double height, int weight) {
        double bodyMassIndex = weight / (height * height);
        return bodyMassIndex;
    }
}
