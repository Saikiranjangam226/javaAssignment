import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProcessNames {
    public static void main(String[] args) {
        String[] names = {"Mahesh", "Dinesh", "Kamalesh", "Sathish", "Suresh", "Ramesh"};
        int[] weightage = {-2, 2, 1, -1, 3, 0};

        List<String> outputList = processNames(names, weightage);
        System.out.println(outputList);
    }

    public static List<String> processNames(String[] names, int[] weightage) {
        List<String> positiveWeightage = new ArrayList<>();
        List<String> negativeWeightage = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (weightage[i] > 0) {
                positiveWeightage.add(names[i]);
            } else if (weightage[i] < 0) {
                negativeWeightage.add(names[i]);
            }
        }
        Collections.sort(positiveWeightage, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int index1 = findIndex(names, o1);
                int index2 = findIndex(names, o2);
                return Integer.compare(weightage[index2], weightage[index1]);
            }
        });
        positiveWeightage.addAll(negativeWeightage);
        return positiveWeightage;
    }

    private static int findIndex(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}