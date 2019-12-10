<?php

/**
 * Uruchomienie w konsoli: $ php -f dzielnik.php
 */

$a = 1989;
$b = 867;

$d = maxDiv($a,$b);
print_r($d);

/**
 * @param int $a
 * @param int $b
 * @return int
 * Największy wspólny dzielnik 2 liczb, Euklides z odejmowaniem
 */
function maxDiv(int $a, int $b):int
{
    while ($a != $b)
    {
        if ($a < $b)
        {
            $c = $a;
            $a = $b;
            $b = $c;
        }
        $a = $a - $b;
    }
    return $a;
}
