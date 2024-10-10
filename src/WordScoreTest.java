import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordScoreTest {

    @Test
    public void testALowerCaseLetter() {
        WordScore scrabble = new WordScore("a");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void testAUpperCaseLetter() {
        WordScore scrabble = new WordScore("A");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void testAValuableLetter() {
        WordScore scrabble = new WordScore("f");
        assertEquals(4, scrabble.getScore());
    }

    @Test
    public void testAShortWord() {
        WordScore scrabble = new WordScore("at");
        assertEquals(2, scrabble.getScore());
    }

    @Test
    public void testAShortValuableWord() {
        WordScore scrabble = new WordScore("zoo");
        assertEquals(12, scrabble.getScore());
    }

    @Test
    public void testAMediumWord() {
        WordScore scrabble = new WordScore("street");
        assertEquals(6, scrabble.getScore());
        //System.out.println("for the word \'street\' the score is " + scrabble.getScore());
    }

    @Test
    public void testAMediumValuableWord() {
        WordScore scrabble = new WordScore("quirky");
        assertEquals(22, scrabble.getScore());
    }

    @Test
    public void testALongMixCaseWord() {
        WordScore scrabble = new WordScore("OxyphenButazone");
        assertEquals(41, scrabble.getScore());
    }

    @Test
    public void testAEnglishLikeWord() {
        WordScore scrabble = new WordScore("pinata");
        assertEquals(8, scrabble.getScore());
    }

    @Test
    public void testAnEmptyInput() {
        WordScore scrabble = new WordScore("");
        assertEquals(0, scrabble.getScore());
    }

    @Test
    public void testEntireAlphabetAvailable() {
        WordScore scrabble = new WordScore("abcdefghijklmnopqrstuvwxyz");
        assertEquals(87, scrabble.getScore());
    }
}