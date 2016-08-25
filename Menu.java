import java.util.Scanner;

/**
 * Created by Pitrecki on 2016-08-17.
 */
public class Menu
{
    private Scanner scanner;
    private Compute compute;

    private void showMenu() {
        System.out.print("\n\n\n\n");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Sprzezenie");
        System.out.println("4. Modul");
        System.out.println("5. Faza");
        System.out.println("0. Wyjscie z programu");
        System.out.print("\n\n\n\n");
//        System.out.println();
//        System.out.println();
    }

    private void switchApp(Complex firstNumb, Complex secNumb) {
        compute = new Compute();
        int choosenSubMenu;
        boolean isExit = true;
        while (isExit) {
            showMenu();
            switch (choosenSubMenu = scanner.nextInt()) {
                case 1:
                    compute.adding(firstNumb, secNumb);
                    compute.showResultOfComputing();
                    break;
                case 2:
                    compute.substraction(firstNumb, secNumb);
                    compute.showResultOfComputing();
                    break;
                case 3:
                    System.out.print("Podaj nr liczby do obl.");
                    if (scanner.nextInt() == 1)
                        compute.conjugationCompNumb(firstNumb);
                    else
                        compute.conjugationCompNumb(secNumb);
                    break;
                case 4:
                    System.out.print("Podaj nr liczby do obl.");
                    if (scanner.nextInt() == 1)
                        System.out.println(compute.abs(firstNumb));
                    else
                        System.out.println(compute.abs(secNumb));
                    break;
                case 5:
                    System.out.print("Podaj nr liczby do obl.");
                    if (scanner.nextInt() == 1) {
                        System.out.println(compute.phase(firstNumb));
                        System.out.println(compute.convertRadiansToAngle(compute.phase(firstNumb)));
                    }
                    else {
                        System.out.println(compute.phase(secNumb));
                        System.out.println(compute.convertRadiansToAngle(compute.phase(secNumb)));
                    }
                    break;
                case 0:
                    System.out.println("Wychodze z programu");
                    isExit = false;
                    break;
                default:
                    System.out.println("Nieprawidlowy numer");
                    break;
            }
        }
    }


    public void appInitialization() {
        System.out.println("Witaj uzytkowniku! Kalkutronix completronix!");
        System.out.println("Wpisz obliczane liczby:");
        scanner = new Scanner(System.in);

        System.out.print("re: ");
        double first = scanner.nextDouble();
        System.out.print("im: ");
        Complex firstNumb = new Complex(first, scanner.nextDouble());

        System.out.print("re: ");
        first = scanner.nextInt();
        System.out.print("im: ");
        Complex secNumb = new Complex(first, scanner.nextDouble());

        switchApp(firstNumb, secNumb);
    }
}
