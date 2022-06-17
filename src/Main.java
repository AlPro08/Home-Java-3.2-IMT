public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 70;
        double h = 1.75;
        System.out.println();
        System.out.println("IMT= " + (service.calculate(m,h)));
        System.out.println();
        System.out.println("IMT= " + (service.calculate(75, 1.75)));
        System.out.println();
        System.out.println("IMT= " + (service.calculate(75, 1.87)));
    }
}
