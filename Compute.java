/**
 * Created by Pitrecki on 2016-08-17.
 */
public class Compute
{
    private Complex result;

    public Complex getResult() {
        return result;
    }

    public Complex adding(Complex firstNumber, Complex secondNumber) {
//        firstNumber = new Complex(complex.getReal(), complex.getImaginary());
//        secondNumber = new Complex(complex.getReal(), complex.getImaginary());

        double realPart = firstNumber.getReal() + secondNumber.getReal();
        double imaginaryPart = firstNumber.getImaginary() + secondNumber.getImaginary();

        result = new Complex(realPart, imaginaryPart);
        return result;

    }

    public Complex substraction(Complex firstNumber, Complex secondNumber) {
        double realPart = firstNumber.getReal() - secondNumber.getReal();
        double imaginaryPart = firstNumber.getImaginary() - secondNumber.getImaginary();

        result = new Complex(realPart, imaginaryPart);
        return result;
    }

    public double abs(Complex complex) {
        return (Math.sqrt(Math.pow(complex.getReal(), 2) + Math.pow(complex.getImaginary(), 2)));
    }

    public double phase(Complex complex) {
        double phase = 0;
        if(complex.getReal() > 0) {
            phase = Math.atan(complex.getImaginary() / complex.getReal());
        }
        else if(complex.getReal() < 0) {
            phase =  Math.atan(complex.getImaginary() / complex.getReal()) + Math.PI;
        }
        return phase;
    }

    public double convertRadiansToAngle (double valueToConvert) {
        return valueToConvert = (valueToConvert * 180 / Math.PI);
    }

    private double imaginaryPowered(Complex complex) {
        result = complex;
        return  -(Math.pow(result.getImaginary(), 2));
    }


    public void conjugationCompNumb(Complex result) {
        this.result = result;

        double realPart = this.result.getReal();
        double imagPart = this.result.getImaginary();
        String message = realPart + " - j" + imagPart;
        System.out.println(message);
    }

    public void showResultOfComputing() {
        double realPart = this.result.getReal();
        double imagPart = this.result.getImaginary();

        System.out.println(realPart + " + j" + imagPart);

    }

}
