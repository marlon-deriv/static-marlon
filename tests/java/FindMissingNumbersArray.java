// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class FindMissingNumbersArray {
    public static int min = 0;
    public static int max = 0;
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 8;
        arr[3] = 8;
        arr[4] = 8;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        findMinAndMax(arr);
        System.out.println();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Missing spaces: " +(findSpaces(arr)));
    }
    public static int findSpaces(int[] arr){
        int total = max - min + 1;
        int numFound = 0, spaces = 0;
        
        System.out.println("Total interval: " + total);
        for(int i = min; i <= max; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == arr[j]){
                    numFound++;
                    break;
                }
            }
        }
        System.out.println("\nNumFound: " + numFound);
        spaces = total - numFound;
        return spaces;
    }
    public static void findMinAndMax(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                min = arr[0];
                max = arr[0];
            } else{
                if(arr[i] < min){
                    min = arr[i];
                }
                if(arr[i] > max){
                    max = arr[i];
                }
            }
        }
    }
}