package calculator;

/**
 * Conversja systemow liczbowych
 */
public class Conversion
{

    private final int MAXRANGE;
    private final int MINRANGE;
    private final String TEMPLATE;

    public Conversion()
    {
        MAXRANGE = 36;
        MINRANGE = 2;
        TEMPLATE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    /**
     * Zamień liczbe z systemu 10 na dowolny
     * @param number
     * @param radix
     * @return
     */
    public String changeTo(int number, int radix)
    {
        String res = "";
        if ((radix > this.MAXRANGE) || (radix < this.MINRANGE))
        {
            return null;
        }

        if (number == 0)
        {
            return "0";
        }

        while (number > 0)
        {
            res = TEMPLATE.charAt(number % radix) + res;
            number = number / radix;
        }

        return res;
    }

    /**
     * Zamien liczbe z dowolnego systemu na 10
     * @param number
     * @param radix
     * @return
     */
    public int changeFrom(String number, int radix)
    {
        int i, sign;
        int p = 1;
        int res = 0;

        if ((radix > this.MAXRANGE) || (radix < this.MINRANGE))
        {
            return 0;
        }

        number = number.toUpperCase();

        for (i = number.length()-1; i >= 0; i--)
        {
            sign = this.selectChar(number.charAt(i), radix);

            if (sign < 0)
            {
                return 0;
            }
            res = res + (sign * p);
            p = p * radix;
        }

        return res;
    }

    /**
     * Wybierz znak z szablonu
     * @param sign
     * @param radix
     * @return
     */
    private int selectChar(char sign, int radix)
    {
        for (int i = 0; i < radix; i++)
        {
            if (sign == this.TEMPLATE.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }
}
