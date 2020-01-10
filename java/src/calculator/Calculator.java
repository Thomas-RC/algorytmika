package calculator;

public class Calculator
{

    public static void main(String[] args)
    {

        Conversion Convert = new Conversion();


        //zamiana z 10
        System.out.println(Convert.changeTo(12345,2));
        System.out.println(Convert.changeTo(12345,3));
        System.out.println(Convert.changeTo(12345,6));
        System.out.println(Convert.changeTo(12345,8));
        System.out.println(Convert.changeTo(12345,16));
        System.out.println(Convert.changeTo(12345,32));

//        //zamina na 10
        System.out.println(Convert.changeFrom("11000000111001", 2));
        System.out.println(Convert.changeFrom("121221020", 3));
        System.out.println(Convert.changeFrom("133053", 6));
        System.out.println(Convert.changeFrom("30071", 8));
        System.out.println(Convert.changeFrom("3039", 16));
        System.out.println(Convert.changeFrom("C1P", 32));

    }
}
