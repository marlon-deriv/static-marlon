import java.util.*;

public class SubBalancedArrays {
    public static void main(String args[]) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        int arrSize = 0;
        int zeros = 0, ones = 0;
        int j = 0;
      
        if(arr.length > 1){
            arrSize = 2;
            while(arrSize < arr.length){
                for(int i = 0; i < (arr.length - arrSize + 1); i++){
                    if(arr[i] == 0) zeros++;
                    if(arr[i] == 1) ones++;
                    j = i + 1;
                    while(j < (i + arrSize)){
                        if(arr[j] == 0) zeros++;
                        if(arr[j] == 1) ones++;
                        j++;
                    }
                    System.out.println("Zeros: " + zeros + ", ones: " + ones);
                    if(zeros == ones){
                        System.out.println("(" + i + ", " + (j-1) + ")");
                    }
                    zeros = ones = 0;
                }
                arrSize+=2;
            }
        }
    }
}