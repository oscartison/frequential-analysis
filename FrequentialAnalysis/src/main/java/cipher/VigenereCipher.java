package cipher;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class VigenereCipher {

    public static void cipher(String input, String output, String key)
            throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new FileReader(input));
        PrintStream out = new PrintStream(new FileOutputStream(output));
        int[] offset = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            offset[i] = key.charAt(i) - 97;
        }

        String line = in.nextLine();

        for (int i = 0; i < line.length(); i++) {
            int posInOffset = i % key.length();
            char newChar = (char) (line.charAt(i) + offset[posInOffset]);
            out.print(newChar);
        }
    }

    public static void decipher(String input, String output, String key)
            throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new FileReader(input));
        PrintStream out = new PrintStream(new FileOutputStream(output));
        int[] offset = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            offset[i] = key.charAt(i) - 97;
        }

        String line = in.nextLine();

        for (int i = 0; i < line.length(); i++) {
            int posInOffset = i % key.length();
            char newChar = (char) (line.charAt(i) - offset[posInOffset]);
            out.print(newChar);
        }
    }

}
