// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class FindSubArrayZero {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 1, 6};
        int sum = -1;
        for(int i = 0; i < arr.length; i++){
            sum = arr[i];
            if(sum == 0){
                System.out.println("True!");
                break;
            } else {
                for(int j = i+1; j < arr.length; j++){
                    sum += arr[j];
                    System.out.println("Sum: " + sum);
                    if(sum == 0){
                        System.out.println("True!");
                        break;
                    }
                }
            }
        }
    }
}