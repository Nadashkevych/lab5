import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {
    private Temperature temperature = new Temperature();
    private SequenceSearch search = new SequenceSearch();
    private HalfString halfString = new HalfString();
    private ReverseArray rArray = new ReverseArray();

    //zadanie1 - testuje sie metode, ktora zwraca true jesli temperatura<100 lub
    // false jesli wieksza
    @Test
    public void if1TempLowerThan100ShouldReturnTrue() {
        Assertions.assertTrue(temperature.lowerThan100(40, 50));
    }

    @Test
    public void if1TempHigherThan100ShouldReturnFalse() {
        Assertions.assertFalse(temperature.lowerThan100(440, 150));
    }

    //zadanie2 - testuje sie metode, szukajaca sekwencje liczb 1 2 3; musi zwracac true
    // jesli sekwencja w tablicy wystapi lub false jesli nie
    @Test
    public void ifSequenceFoundShouldReturnTrue() {
        Assertions.assertTrue(search.findSequence(new int[]{1, 2, 3, 3, 7}));
    }

    @Test
    public void ifSequenceNotFoundShouldReturnFalse() {
        Assertions.assertFalse(search.findSequence(new int[]{1, 5, 3, 3, 7}));
    }

    @Test
    public void ifArrayNullShouldReturnFalse() {
        Assertions.assertFalse(search.findSequence(new int[5]));
    }

    //zadanie3 - zwraca polowe stringa o parzystej liczbie znakow, mniejsza czesc
    // stringa o nieparzystej liczbie znakow lub pusty string w przypadku przekazania null
    @Test
    public void shouldBeEqualToHalfOfEvenString() {
        Assertions.assertEquals("Str", halfString.halfString("String"));
    }

    @Test
    public void ShouldBeEqualToSmallerHalfOfOddString() {
        Assertions.assertEquals("Str", halfString.halfString("Strings"));
    }

    @Test
    public void IfNullShouldBeEqualToEmpty() {
        Assertions.assertEquals("", halfString.halfString(""));
    }

    //zadanie4 - metoda musi zwracac tablice int'ow w odwrotnej kolejnosci
    @Test
    public void ArrayShouldBeEqualToReverse() {
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 7}, rArray.reverseArray(new int[]{7, 5, 3, 1}));
    }

}
