package sorting;

import java.util.*;

public class App {
    Scanner scanner = new Scanner(System.in);
    public void computeWord () {
        ArrayList<String> words = new ArrayList<>();
        String [] temp = new String[0];
        while (scanner.hasNextLine()) {
            temp = scanner.nextLine().split("\\s+");
            for (var a : temp) {
                words.add(a);
            }
        }
        int percentage = (Collections.frequency(words,Collections.max(words)) * 100) / words.size();
        System.out.println("Total words: " + words.size() + ".");
        String max = Collections.max(words, Comparator.comparing(String::length));
        System.out.println("The longest word: " + max + " ("+ Collections.frequency(words,Collections.max(words)) + " time(s), "+percentage+"%)." );

    }


    public void computeLine() {
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        int percentage = (Collections.frequency(lines,Collections.max(lines)) * 100) / lines.size();
        System.out.println("Total lines: " + lines.size() + ".");
        String max = Collections.max(lines, Comparator.comparing(String::length));
        System.out.println("The longest line:\n" + max + "\n("+ Collections.frequency(lines,Collections.max(lines)) + " time(s), "+percentage+"%)." );
    }

    public void computeLong(){
        ArrayList<Long> nums = new ArrayList<>();
        while (scanner.hasNextLong()) {
            nums.add(scanner.nextLong());
        }
        int percentage = (Collections.frequency(nums,Collections.max(nums)) * 100) / nums.size();
        System.out.println("Total numbers: " + nums.size() + ".");
        System.out.println("The greatest number: " + Collections.max(nums) + " (" + Collections.frequency(nums,Collections.max(nums)) + " time(s), "+percentage+"%)." );
    }

    public void incompatibleParameter() {
        System.out.println("Incompatible parameters.");
    }
}
