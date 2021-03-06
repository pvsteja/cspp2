import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
/**
 * Class for plagiarism.
 */
class plagiarism {
    /**
     * function_description.
     *
     * @param      filename  The filename
     *
     * @return     { description_of_the_return_value }
     */
    public HashMap map(final File filename) {
        HashMap<String, Integer> hm = new <String, Integer>HashMap();
        try {
            BufferedReader b = new BufferedReader(new FileReader(filename));
            String str = b.readLine();
            while (str != null) {
                String[] line = str.split(" ");
                String word = "";
                for (int i = 0; i < line.length; i++) {
    word = line[i].replaceAll("[.,*%&!@ #$():?-]", "").trim().toLowerCase();
                    if (word.length() > 0) {
                        if (hm.containsKey(word)) {
                            hm.put(word, hm.get(word) + 1);
                        } else {
                            hm.put(word, 1);
                        }
                    }
                }
                str = b.readLine();
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return hm;
    }


    /**
     * { function_description }
     *
     * @param      hashMap1  The hash map 1
     * @param      hashMap2  The hash map 2
     *
     * @return     { description_of_the_return_value }
     */
    public double similarity(final HashMap<String,Integer> hashMap1,
        final HashMap<String, Integer> hashMap2) {
        double frequencyvector1 = 0, frequencyvector2 = 0;
        double similarity;
        int dotproduct = 0;
        for (int i : hashMap1.values()) {
            frequencyvector1 = frequencyvector1 + Math.pow(i, 2);
        }
        frequencyvector1 = Math.sqrt(frequencyvector1);
        for (int i : hashMap2.values()) {
            frequencyvector2 = frequencyvector2 + Math.pow(i, 2);
        }
        frequencyvector2 = Math.sqrt(frequencyvector2);
        for (String i : hashMap1.keySet()) {
            if (hashMap2.containsKey(i)) {
                dotproduct = dotproduct + hashMap1.get(i) * hashMap2.get(i);
            }
        }
        similarity = dotproduct / (frequencyvector2 * frequencyvector1);
        return similarity;
    }
}
/**
 * Class for solution.
 */
class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String foldername;
        try {
            foldername = sc.nextLine();
        } catch (Exception e) {
            System.out.println("empty directory");
            return;
        }
        File dir = new File(foldername);
        File[] filearray = dir.listFiles();
        HashMap[] hashmaparray = new HashMap[filearray.length];
        plagiarism p = new plagiarism();
        int temp = 0;
        final int num = 100;
        long[][] result = new long[filearray.length][filearray.length];
        for (File print:filearray) {
            hashmaparray[temp] = p.map(print);
            temp++;
        }
        for (int i = 0; i < filearray.length; i++) {
            for (int j = 0; j < filearray.length; j++) {
                result[i][j] = Math.round(p.similarity(hashmaparray[i],
                    hashmaparray[j]) * num);
            }
        }
        System.out.print("\t\t");
        for (int i = 0; i < filearray.length; i++) {
            System.out.print(filearray[i].toString().split("\\\\")[1] + "\t");
        }
        System.out.println();
        for (int i = 0; i < filearray.length; i++) {
            System.out.print(filearray[i].toString().split("\\\\")[1] + "\t");
            for (int j = 0; j < filearray.length; j++) {
                System.out.print(result[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}