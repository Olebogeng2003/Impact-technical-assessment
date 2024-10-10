import java.util.HashMap;
import java.util.Map;

class WordScore {

    private String word;
    private static final Map<Character, Integer> Letter_score = new HashMap<>();

    static {
        Letter_score.put('A', 1); Letter_score.put('E', 1); Letter_score.put('I', 1);
        Letter_score.put('O', 1); Letter_score.put('U', 1); Letter_score.put('L', 1);
        Letter_score.put('N', 1); Letter_score.put('R', 1); Letter_score.put('S', 1);
        Letter_score.put('T', 1); Letter_score.put('D', 2); Letter_score.put('G', 2);
        Letter_score.put('B', 3); Letter_score.put('C', 3); Letter_score.put('M', 3);
        Letter_score.put('P', 3); Letter_score.put('F', 4); Letter_score.put('H', 4);
        Letter_score.put('V', 4); Letter_score.put('W', 4); Letter_score.put('Y', 4);
        Letter_score.put('K', 5); Letter_score.put('J', 8); Letter_score.put('X', 8);
        Letter_score.put('Q', 10); Letter_score.put('Z', 10);
    }

    WordScore(String word) {
        this.word = word.toUpperCase();  // This is to Converts to uppercase for consistency
    }

    int getScore() {
        int score = 0;
        for (char letter : word.toCharArray()) {
            score += Letter_score.getOrDefault(letter, 0);
        }
        return score;
    }
}
