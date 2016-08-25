/**
 * Created by Pitrecki on 2016-08-17.
 */
public class ComputeTester
{
    public static void main(String[] args) {
        Complex firstNumb = new Complex(23.2, 32.4);
        Complex secondNumb = new Complex(11.0, 2.0);

        Compute compute = new Compute();
        compute.adding(firstNumb, secondNumb);
        compute.substraction(firstNumb, secondNumb);
        compute.conjugationCompNumb(compute.getResult());

        double d = compute.abs(firstNumb);
        System.out.println(d);
        compute.phase(firstNumb);

    }
}
