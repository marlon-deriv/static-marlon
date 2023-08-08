// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class AlternateArrayPosNeg {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        List<Integer> pos = new ArrayList<Integer>();
        List<Integer> neg = new ArrayList<Integer>();
        int[] arrFinal = new int[arr.length];
        int longer = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        if(pos.size() >= neg.size()){
            longer = pos.size();
        } else {
            longer = neg.size();
        }
        int i = 0;
        int iP = 0;
        int iN = 0;
        while(i < arr.length){
            if(iN < neg.size()){
                if(neg.get(iN) != null){
                    arr[i] = neg.get(iN);
                    System.out.println("Num: " + arr[i] + ", iN: " +iN);
                    iN++;
                    i++;
                }
            }
            if(iP < pos.size()){
                if(pos.get(iP) != null){
                    arr[i] = pos.get(iP);
                    System.out.println("Num: " + arr[i] + ", iP: " +iP);
                    iP++;
                    i++;
                }
            }
        }
        System.out.println("Size: " + arr.length);
    }
}