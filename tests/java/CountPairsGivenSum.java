// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CountPairsGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 3};
        int sum = 6;
        int amount = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(sum == arr[i] + arr[j]){
                    amount ++;
                }
            }
        }
        System.out.println(amount);
    }
}