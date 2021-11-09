package Questions;

public class Q15_implem implements Q15_interface{

    @Override
    public double addition(double a, double b) {
        return a + b;
    }
    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    public void WowMyMethod() {
        System.out.println("Wow!");
    }

}
