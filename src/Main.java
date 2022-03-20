public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(1.76, 75);
        System.out.println("Индекс массы тела= " + bodyMassIndex);
    }
}
