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
     * @param type
     * @return
     */
    public String changeTo(int number, int type)
    {
        String res = "";
        if ((type > this.MAXRANGE) || (type < this.MINRANGE))
        {
            return null;
        }

        if (number == 0)
        {
            return "0";
        }

        while (number > 0)
        {
            res = TEMPLATE.charAt(number % type) + res;
            number = number / type;
        }

        return res;
    }

    /**
     * Zamien liczbe z dowolnego systemu na 10
     * @param number
     * @param type
     * @return
     */
    public int changeFrom(String number, int type)
    {
        int i, sign;
        int p = 1;
        int res = 0;

        if ((type > this.MAXRANGE) || (type < this.MINRANGE))
        {
            return 0;
        }

        number = number.toUpperCase();

        for (i = number.length()-1; i >= 0; i--)
        {
            sign = this.selectChar(number.charAt(i), type);

            if (sign < 0)
            {
                return 0;
            }
            res = res + (sign * p);
            p = p * type;
        }

        return res;
    }

    /**
     * Wybierz znak z szablonu
     * @param sign
     * @param type
     * @return
     */
    private int selectChar(char sign, int type)
    {
        for (int i = 0; i < type; i++)
        {
            if (sign == this.TEMPLATE.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }
}
