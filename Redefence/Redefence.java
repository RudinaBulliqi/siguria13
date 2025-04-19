/*
import java.util.*;

public class Redefence {

    //ENKRIPTIMI
    // Encrypt using Redefence (Rail Fence + custom key order)
    public static String encrypt(String text, int rails, int[] keyOrder) {
        if (rails <= 1 || keyOrder.length != rails) return text;

        // Step 1: Zig-zag writing
        List<StringBuilder> railBuilders = new ArrayList<>();
        for (int i = 0; i < rails; i++) railBuilders.add(new StringBuilder());

        int rail = 0;
        boolean down = true;
        for (char c : text.toCharArray()) {
            railBuilders.get(rail).append(c);

            // Switch direction if at either end
            if (rail == 0) down = true;
            else if (rail == rails - 1) down = false;

            rail += down ? 1 : -1;
        }

        // Step 2: Read rails based on key order
        StringBuilder result = new StringBuilder();
        for (int i : keyOrder) {
            result.append(railBuilders.get(i));
        }

        return result.toString();
    }

    // Demo
    public static void main(String[] args) {
        String plaintext = "GRUPI13SIGURIAETEDHENAVE";
        int rails = 3;
        int[] key = {2, 0, 1}; // Custom reading order for rails

        String encrypted = encrypt(plaintext, rails, key);
        System.out.println("Encrypted: " + encrypted);
    }
}
*/