// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class FindCommonElementsThree {
    public static void main(String[] args) {
        
        int ar1[] = {1, 5, 10, 20, 40, 80, 405, 44, 409, 22, 33};
        int ar2[] = {6, 7, 20, 80, 100, 405, 33, 42, 331};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120, 405, 33, 90, 987};
        List<Integer> commonA = new ArrayList<Integer>();
        List<Integer> commonB = new ArrayList<Integer>();
        
        if(ar1.length >= ar2.length){
            for(int i = 0; i < ar1.length; i++){
                for (int j = 0; j < ar2.length; j++){
                    if(ar1[i] == ar2[j]){
                        commonA.add(ar1[i]);
                        break;
                    }
                }
            }
        } else {
            for(int i = 0; i < ar2.length; i++){
                for (int j = 0; j < ar1.length; j++){
                    if(ar2[i] == ar1[j]){
                        commonA.add(ar1[i]);
                        break;
                    }
                }
            }
        }
        System.out.println("commonA after ar1 => ar2: " +commonA.size());
        if(ar3.length >= commonA.size()){
            for(int i = 0; i < ar3.length; i++){
                for (int j = 0; j < commonA.size(); j++){
                    if(ar3[i] == commonA.get(j)){
                        commonB.add(ar3[i]);
                    }
                }
            }
        } else{
            for(int i = 0; i < commonA.size(); i++){
                for (int j = 0; j < ar3.length; j++){
                    if(commonA.get(i) == ar3[j]){
                        commonB.add(ar3[i]);
                    }
                }
            }
        }
        System.out.println("commonB after ar3 => commonA: " +commonB.size());
        System.out.println("Common elements: ");
        for (int i = 0; i < commonB.size(); i++){
            System.out.print(commonB.get(i) + ", ");
        }
    }
}