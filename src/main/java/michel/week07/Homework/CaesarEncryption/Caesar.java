package michel.week07.Homework.CaesarEncryption;

import java.util.HashMap;

public class Caesar {
    private final HashMap<Character, Character> encrypt;
    private final HashMap<Character, Character> decrypt;

    public Caesar(int shift) {
        encrypt = new HashMap<>();
        decrypt = new HashMap<>();
        shiftCaesar(shift);
    }

    public String encrypt(String text) {
        return translate(text, encrypt);
    }

    public String decrypt(String text) {
        return translate(text, decrypt);
    }

    private String translate(String text, HashMap<Character, Character> alphabet) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            output.append(alphabet.get(text.charAt(i)));
        }
        return output.toString();
    }

    private void shiftCaesar(int shift) {
        for (char i = 0; i <= 'ü'; i++) {
            if (i >= 'A' && i <= 'Z') {
                if ((shift + i) <= 'Z') {
                    encrypt.put(i, (char) (i + shift));
                    decrypt.put((char) (i + shift), i);
                } else {
                    encrypt.put(i, (char) (i + shift - 26));
                    decrypt.put((char) (i + shift - 26), i);
                }

            } else if (i >= 'a' && i <= 'z') {
                if ((shift + i) <= 'z') {
                    encrypt.put(i, (char) (i + shift));
                    decrypt.put((char) (i + shift), i);
                } else {
                    encrypt.put(i, (char) (i + shift - 26));
                    decrypt.put((char) (i + shift - 26), i);
                }
            } else {
                encrypt.put(i, i);
                decrypt.put(i, i);
            }
        }
    }
}
