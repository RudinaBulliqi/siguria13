public class RedefenceDecrypt {

    public static String decrypt(String cipher, int rails, int[] keyOrder) {
        if (rails <= 1 || keyOrder.length != rails) return cipher;


        int[] railLengths = new int[rails];
        int len = cipher.length();


        int rail = 0;
        boolean down = true;
        for (int i = 0; i < len; i++) {
            railLengths[rail]++;
            if (rail == 0) down = true;
            else if (rail == rails - 1) down = false;
            rail += down ? 1 : -1;
        }


        String[] railStrings = new String[rails];
        int cipherIndex = 0;
        for (int k = 0; k < rails; k++) {
            int actualRail = keyOrder[k];
            int count = railLengths[actualRail];
            railStrings[actualRail] = cipher.substring(cipherIndex, cipherIndex + count);
            cipherIndex += count;
        }


        StringBuilder result = new StringBuilder();
        int[] railPositions = new int[rails];
        rail = 0;
        down = true;
        for (int i = 0; i < len; i++) {
            result.append(railStrings[rail].charAt(railPositions[rail]++));
            if (rail == 0) down = true;
            else if (rail == rails - 1) down = false;
            rail += down ? 1 : -1;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String encrypted = "U3UEHVGIIIENRP1SGRATDEAE";
        int rails = 3;
        int[] key = {2, 0, 1};

        String decrypted = decrypt(encrypted, rails, key);
        System.out.println("Decrypted: " + decrypted);
    }
}
