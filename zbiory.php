<?php

/**
 * Uruchomienie w konsoli: $ php -f zbiory.php
 */

$a = 4;
$b = printSubs($a);
var_dump($b);

/**
 * @param array $set
 * Drukuj podzbiory dla podanej tablicy
 */
function printSubs(int $n)
{

    $set = getArrayfromInt($n);

    for ($i = 0; $i < (1 << $n); $i++)
    {
        printf('%s', '{ ');

        for ($j = 0; $j < $n; $j++)
        {
            if (($i & (1 << $j)) > 0)
            {
                printf('%s', $set[$j] . " ");
            }
        }

        printf('%s', '}' . "\n");
    }


}

/**
 * @param int $a
 * @return array
 * Zwraca tablicę z podanego int
 */
function getArrayfromInt(int $a): array
{
    $arr = [];
    for ($i = 1; $i <= $a; $i++)
    {
        $arr[] = $i;
    }
    return $arr;
}
