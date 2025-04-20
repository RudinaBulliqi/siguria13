package Autokey;
import java.util.Scanner;

public class Autokey {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plainText = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        System.out.print("Enter primer (one letter): ");
        String primer = scanner.nextLine().toUpperCase();

        scanner.close();

        String cipherText = encrypt(plainText, primer);
        String decryptedText = decrypt(cipherText, primer);

        System.out.println("Ciphertext: " + cipherText);
        System.out.println("Decrypted plaintext: " + decryptedText);
    }

    public static String encrypt(String plainText, String primer) {
        String key = primer + plainText;
        key = key.substring(0, plainText.length());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            int p = ALPHABET.indexOf(plainText.charAt(i));
            int k = ALPHABET.indexOf(key.charAt(i));
            int c = (p + k) % 26;
            result.append(ALPHABET.charAt(c));
        }

        return result.toString();
    }
    public static String decrypt(String cipherText, String primer) {
StringBuilder key = new StringBuilder(primer);
StringBuilder result = new StringBuilder();

for (int i = 0; i < cipherText.length(); i++) {
int c = ALPHABET.indexOf(cipherText.charAt(i));
int k = ALPHABET.indexOf(key.charAt(i));
int p = (c - k + 26) % 26;
char decryptedChar = ALPHABET.charAt(p);
result.append(decryptedChar);
key.append(decryptedChar);
}

return result.toString();
}
}
