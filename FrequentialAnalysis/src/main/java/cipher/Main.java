package cipher;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args[0].equals("delete")) {
            Preprocess.preprocessFile(args[1], args[2], true);
        } else if (args[0].equals("CesarCipher")) {
            CesarCipher.cipher(args[1], args[2], Integer.parseInt(args[3]));
        } else if (args[0].equals("Decipher")) {
            CesarCipher.decipher(args[1], args[2], Integer.parseInt(args[3]));
        } else if (args[0].equals("Vig")) {
            VigenereCipher.cipher(args[1], args[2], args[3]);
        } else if (args[0].equals("DeVig")) {
            VigenereCipher.decipher(args[1], args[2], args[3]);
        }

    }

}
