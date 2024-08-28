import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueSubstringsFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputStr = scanner.nextLine();
        Map<String, Integer> substrFreq = getUniqueSubstringsFrequency(inputStr);

        System.out.println(substrFreq);
    }

    public static Map<String, Integer> getUniqueSubstringsFrequency(String inputStr) {
        Map<String, Integer> substrFreq = new HashMap<>();
        int n = inputStr.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substr = inputStr.substring(i, j);
                substrFreq.put(substr, substrFreq.getOrDefault(substr, 0) + 1);
            }
        }

        return substrFreq;
    }
}
