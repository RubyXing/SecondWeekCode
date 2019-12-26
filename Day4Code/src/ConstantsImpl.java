public class ConstantsImpl implements Constants {
    @Override
    public double getNum() {
        return MAX-MIN;
    }

    @Override
    public double add(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double substract(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double moltiply(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2!=0) {
            return num1 / num2;
        }else {
            return 0;
        }
    }


}
