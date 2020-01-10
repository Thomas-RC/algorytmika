package calculator;

import java.util.Scanner;

/**
 * Kalkulator :
 * - kalkulator pracuje na dowolnym systemie liczbowym od binarnego po dziesiętny;
 * - kalkulator potrafi odjąć większą liczbę od mniejszej i przedstawić prawidłowy wynik ze znakiem minusa (np 3 - 5 = -2);
 * - kalkulator mnoży, dodaje i odejmuje również liczby ujemne (np -2 * 3 = -6 czy -2 + -3 = -5);
 * - kalkulator dodatkowo dzieli liczby;
 */
public class Calculator
{

    public static void main(String[] args)
    {

        int xc, yc, s;
        float xf, yf, res;
        char choice;
        String wyn, x, y;


        Scanner scan = new Scanner(System.in);
        Conversion Convert = new Conversion();

        do
        {
            System.out.print("(1) Dodawanie\n");
            System.out.print("(2) Odejmowanie\n");
            System.out.print("(3) Mnożenie\n");
            System.out.print("(4) Dzielenie\n");
            System.out.print("(5) Wyjdż\n\n");
            System.out.print("Twoj wybor : ");
            choice = scan.next().charAt(0);

            switch (choice)
            {
                case '1':
                    System.out.println("Wybierz system liczbowy: 10 - dziesietny, 2 - binarny , 3 - trojkowy itd. MIN 2, MAX 32");
                    s = scan.nextInt();

                    //todo: zabezpieczenie przed MAX i MIN

                    System.out.print("Wprowadz dwie liczby w wybranym systemie liczbowym : ");
                    x = scan.next();
                    y = scan.next();

                    if(s == 10)
                    {
                        xf = Float.valueOf(x.trim());
                        yf = Float.valueOf(y.trim());

                        res = xf + yf;
                        System.out.println("Wynik = " + res + "\n");
                    }
                    else
                    {
                        xc = Convert.changeFrom(x, s);
                        yc = Convert.changeFrom(y, s);

                        wyn = Convert.changeTo((xc+yc), s);
                        System.out.println("Wynik = " + wyn + "\n");
                    }

                    break;
                case '2':
                    System.out.println("Wybierz system liczbowy: 10 - dziesietny, 2 - binarny , 3 - trojkowy itd. MIN 2, MAX 32");
                    s = scan.nextInt();

                    //todo: zabezpieczenie przed MAX i MIN

                    System.out.print("Wprowadz dwie liczby w wybranym systemie liczbowym : ");
                    x = scan.next();
                    y = scan.next();

                    if(s == 10)
                    {
                        xf = Float.valueOf(x.trim());
                        yf = Float.valueOf(y.trim());

                        res = xf - yf;
                        System.out.println("Wynik = " + res + "\n");
                    }
                    else
                    {
                        xc = Convert.changeFrom(x, s);
                        yc = Convert.changeFrom(y, s);

                        wyn = Convert.changeTo((xc-yc), s);
                        System.out.println("Wynik = " + wyn + "\n");
                    }

                    break;
                case '3':
                    System.out.println("Wybierz system liczbowy: 10 - dziesietny, 2 - binarny , 3 - trojkowy itd. MIN 2, MAX 32");
                    s = scan.nextInt();

                    //todo: zabezpieczenie przed MAX i MIN

                    System.out.print("Wprowadz dwie liczby w wybranym systemie liczbowym : ");
                    x = scan.next();
                    y = scan.next();

                    if(s == 10)
                    {
                        xf = Float.valueOf(x.trim());
                        yf = Float.valueOf(y.trim());

                        res = xf * yf;
                        System.out.println("Wynik = " + res + "\n");
                    }
                    else
                    {
                        xc = Convert.changeFrom(x, s);
                        yc = Convert.changeFrom(y, s);

                        wyn = Convert.changeTo((xc*yc), s);
                        System.out.println("Wynik = " + wyn + "\n");
                    }

                    break;
                case '4':
                    System.out.println("Wybierz system liczbowy: 10 - dziesietny, 2 - binarny , 3 - trojkowy itd. MIN 2, MAX 32");
                    s = scan.nextInt();

                    //todo: zabezpieczenie przed MAX i MIN

                    System.out.print("Wprowadz dwie liczby w wybranym systemie liczbowym : ");
                    x = scan.next();
                    y = scan.next();

                    if(s == 10)
                    {
                        xf = Float.valueOf(x.trim());
                        yf = Float.valueOf(y.trim());

                        res = xf / yf;
                        System.out.println("Wynik = " + res + "\n");
                    }
                    else
                    {
                        xc = Convert.changeFrom(x, s);
                        yc = Convert.changeFrom(y, s);

                        wyn = Convert.changeTo((xc/yc), s);
                        System.out.println("Wynik = " + wyn + "\n");
                    }

                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.print("Brak takiego działania, wybierz od 1 do 5.");
            }
        } while (choice != 5);
    }


}

