package cipher;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class FrequencyCesar {

    double[] freq = new double[26];
    double[] freqEnglish = {8.2, 1.5, 2.8, 4.3, 13, 2.2, 2, 6.1, 7, 0.15, 0.77, 4, 2.4, 6.7,
        7.5, 1.9, 0.095, 6, 6.3, 9.1, 2.8, 0.98, 2.4, 0.15, 2, 0.074};

    public void makeFreqBoard(String input)
            throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new FileReader(input));

        String line = in.nextLine();
        for (int i = 0; i < line.length(); i++) {
            freq[(int) (line.charAt(i) - 97)]++;
        }
        for (int i = 0; i < freq.length; i++) {
            freq[i] = (freq[i] / line.length()) * 100;
        }
    }

    public void chiSquare() {
        int minChi;
        int key;
        for (int possibleKey = 0; possibleKey < 26;) {
            
        }
    }

}
