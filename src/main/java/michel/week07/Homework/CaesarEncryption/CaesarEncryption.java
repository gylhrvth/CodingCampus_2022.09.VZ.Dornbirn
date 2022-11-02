package michel.week07.Homework.CaesarEncryption;

public class CaesarEncryption {
    public static void main(String[] args) {
        String text = "Dies ist ein Beispieltext der mit einem Klick verschlüsselt werden kann. Hier kann auch \nein eigenen Text herein geschrieben, oder ein Geheimcode zum Entschlüsseln herein \nkopiert werden.";

        Caesar c1 = new Caesar(3);
        Caesar c2 = new Caesar(7);

        System.out.println(c1.encrypt(text));
        System.out.println("---------------------------------------------------");
        System.out.println(c1.decrypt(c1.encrypt(text)));
        System.out.println("===================================================");
        System.out.println(c2.encrypt(text));
        System.out.println("---------------------------------------------------");
        System.out.println(c2.decrypt(c2.encrypt(text)));
    }
}
