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
