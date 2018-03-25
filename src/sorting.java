/* David Andersson
19/03/2018
Selection sort
 */

public class sorting {
    public static void selSort(int[] numbers){
        int min = 0;
        for (int i = 0 ; i < numbers.length ; i++) {
            min = i;
            for (int j = i ; j < numbers.length ; j++) {

                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
    }

    public static void selSort(double[]decimalnumbers) {
        int max = 0;
        for (int i = 0 ; i < decimalnumbers.length ; i++) {
            max = i;
            for (int j = i ; j < decimalnumbers.length ; j++) {

                if (decimalnumbers[j] > decimalnumbers[max]) {
                    max = j;
                }
            }
            double temp = decimalnumbers[i];
            decimalnumbers[i] = decimalnumbers[max];
            decimalnumbers[max] = temp;
        }
    }
    public static void selSortStringLength(String[] words) {
        int kort;
        for(int i = 0; i < words.length; i++){
            kort = i;
            for(int j = i; j < words.length; j++){
                if(words[j].length()<words[kort].length()){
                    kort = j;
                }
            }
            String temp = words[i];
            words[i] = words[kort];
            words[kort] = temp;
        }
    }

    public static void selSortStringAlpha(String[] words) {
        int liten;
        for(int i = 0; i < words.length; i++){
            liten = i;
            for(int j = i; j < words.length; j++) {
                if (words[j].compareTo(words[liten]) < 0) {
                    liten = j;
                }
            }
            String temp = words[i];
            words[i] = words[liten];
            words[liten] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("\nHeltal (Minst-Störst)");
        int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        selSort(numbers);
        for (int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("\nDecunaltal (Störst-Minst)");
        double[] decimalnumbers = {32.5, 12, 60.3, 39.2, -4, -5.2, 22.2, 6.8, -2, -67.7};
        selSort(decimalnumbers);
        for (int i = 0; i < decimalnumbers.length ; i++) {
            System.out.println(decimalnumbers[i]);
        }

        System.out.println("\nOrdlängd (Kortast-längst)");
        String[] words = {"hej","ja","main","rakhyvel","i","david"};
        selSortStringLength(words);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        System.out.println("\nBokstavsordning");
        selSortStringAlpha(words);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}
