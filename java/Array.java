package classSnacks;

import java.util.Arrays;

public class Array {
    public String shortestWord(String sentence){
        String[] words = sentence.split(" ");
        String shortest = words[0];
        for(int i = 1; i < words.length; i++){
            if(words[i].length() < shortest.length()){
                shortest = words[i];
            }
        }
        return shortest;
    }

    public int[] ascendingOrder(int[] arr){
        for(int counter = 0; counter < arr.length; counter++){
            arr[counter] = arr[counter] * arr[counter];
        }

        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int counterTwo = 0; counterTwo < arr.length - 1 - counter; counterTwo++) {

                if (arr[counterTwo] > arr[counterTwo + 1]) {
                    int temp = arr[counterTwo];
                    arr[counterTwo] = arr[counterTwo + 1];
                    arr[counterTwo + 1] = temp;
                }
            }
        }
        return arr;
    }
}
