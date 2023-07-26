// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.ArrayList;

class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 3, 6, 1};
        List<Integer> duplicated = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = 0; j < arr.length; j++){
                if(j != i){
                    if(current == arr[j]){
                        if(!duplicated.contains(arr[j])){
                            duplicated.add(arr[j]);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < duplicated.size(); i++){
            System.out.println(duplicated.get(i));
        }
    }
}