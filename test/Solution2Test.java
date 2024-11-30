import org.junit.Test;
import static org.junit.Assert.*;

public class Solution2Test {

    private Solution2 solution2 = new Solution2();

    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testSingleCharacterString() {
        String input = "a";
        String expected = "a";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testAllUniqueCharacters() {
        String input = "abc";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testAllSameCharacters() {
        String input = "aaaaa";
        String expected = "a";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testMultipleDuplicates() {
        String input = "bcabc";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testComplexDuplicates() {
        String input = "cbacdcbc";
        String expected = "acdb";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testBoundaryCase() {
        String input = "z";
        String expected = "z";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testLongString() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testLongStringWithDuplicates() {
        String input = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testReversedString() {
        String input = "zyxwvutsrqponmlkjihgfedcba";
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testReversedStringWithDuplicates() {
        String input = "zzyyxwwvutsrqponmlkjihgfedcba";
        String expected = "zyxwvutsrqponmlkjihgfedcba";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testRepeatedPattern() {
        String input = "abcabcabcabc";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testComplexPattern() {
        String input = "abacb";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }

    @Test
    public void testEdgeCaseWithMultipleSolutions() {
        String input = "abacb";
        String expected = "abc";
        assertEquals(expected, solution2.removeDuplicateLetters(input));
    }
}