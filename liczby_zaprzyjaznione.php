<?php

/**
 * Uruchomienie w konsoli: $ php -f liczby_zaprzyjaznione.php
 */

$a = 220;
$b = 284;

$frendlyNumbers = frNumbers($a, $b);
var_dump($frendlyNumbers);

/**
 * @param int $a
 * @param int $b
 * @return bool
 * Czy liczba jest zaprzyjaźniona
 */
function frNumbers(int $a, int $b): bool
{
    return ($a == divSum($b) && $b == divSum($a) && $a != $b);
}

/**
 * @param int $c
 * @return int
 * Oblicz sumę dzielników
 */
function divSum(int $c): int
{
    $sum = 1;
    for ($i = 2; $i < $c; $i++)
    {
        if ($c % $i == 0)
        {
            $sum += $i;
        }
    }
    return $sum;
}