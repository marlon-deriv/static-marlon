// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CicleRotateArray {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};
        int arrCycle[] = new int[arr.length];
        arrCycle[0] = arr[arr.length-1];
        for(int i = 1; i < arrCycle.length; i++){
            arrCycle[i] = arr[i-1];
        }
        for(int i = 0; i < arrCycle.length; i++){
            System.out.println(arrCycle[i]);
        }
    }
}