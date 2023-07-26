// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class FindMissingInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int biggest = 0;
        int smallest = 0;
        int n;
        for(int i = 0; i < arr.length; i++){
            if(i == 0){ 
                biggest = arr[i]; 
                smallest = arr[i];
            }
            if(biggest < arr[i]) biggest = arr[i];
            if(smallest > arr[i]) smallest = arr[i];
        }
        System.out.println("Interval: " + smallest + " - " + biggest);
        for(int i = smallest; i <= biggest; i++){
            boolean found = false;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found){
                System.err.println (i + " not found!");
            } 
        }
    }
}