import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {
    private Temperature temperature = new Temperature();
    private SequenceSearch search = new SequenceSearch();
    private HalfString halfString = new HalfString();
    private ReverseArray rArray = new ReverseArray();

    @Test
    public void if1TempLowerThan100ShouldReturnTrue() {
        Assertions.assertTrue(temperature.lowerThan100(40, 50));
    }

    @Test
    public void ifSequenceFoundShouldReturnTrue() {
        Assertions.assertTrue(search.findSequence(new int[]{1, 2, 3, 3, 7}));
    }

    @Test
    public void ShouldBeEqualToHalfOfString() {
        Assertions.assertEquals("Str", halfString.halfString("String"));
    }

    @Test
    public void ArrayShouldBeEqualToReverse() {
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 7}, rArray.reverseArray(new int[]{7, 5, 3, 1}));
    }
}
