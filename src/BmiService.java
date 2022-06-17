public class BmiService {
    public double calculate(int mass, double high) {
        double index = (double) (mass / (high * high));
        return index;
    }
}
