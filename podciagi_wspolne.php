<?php
/**
 * @param string $str1
 * @param string $str2
 * @param int $step
 * @return string
 * Szukaj najwieksze podciągi wspolne z 2 stringow.
 * Uruchomienie w konsoli: $ php -f podciagi_wspolne.php
 */
function comSubstring(string $str1, string $str2, int $step): string
{
    $count1 = strlen($str1);
    $count2 = strlen($str2);

    if ($count1 < $count2) {
        $shortString = $str1;
        $longString = $str2;
        $countShortstring = $count1;
    } else {
        $shortString = $str2;
        $longString = $str1;
        $countShortstring = $count2;
    }
    
    $position = strpos($longString, $shortString);

    if ($position !== false)
    {
        return $shortString;
    }

    for ($i = 1, $j = $countShortstring - 1; $j > 0; --$j, ++$i)
    {

        for ($k = 0; $k <= $i; ++$k)
        {
            $substr = substr($shortString, $k, $j);
            $position = strpos($longString, $substr);

            if ($position !== false && strlen($substr) >= 0)
            {

                $countSign = strlen($substr);

                $countAll = 1;
                $sign = $sign2 = "";
                while ($countAll <= $countSign)
                {
                    $sign .= "_";
                    $sign2 .= "-";
                    $countAll++;
                }

                $strStay1 = str_replace($substr, $sign, $str1);
                $strStay2 = str_replace($substr, $sign2, $str2);

                echo "KROK {$step}: t1 = {$str1}, t2 = {$str2},  Max część wspólna: " . $substr . ", Długość: " . strlen($substr) . "\n";
                $step++;

                if (strlen($strStay1) >= 0 && strlen($strStay2) >= 0)
                {
                    $res = comSubstring($strStay1, $strStay2, $step);
                }
                else
                {
                    $res = "";
                }

                return $res;

            }

        }

    }

    return "";
}

/**
 * Wywołanie
 */
$t1 = "BAABBBAABBB";
$t2 = "BBBABBBABA";

echo comSubstring($t1, $t2, 1);





