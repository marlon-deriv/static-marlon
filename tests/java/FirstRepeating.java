public class FirstRepeating {
    public static void main(String args[]) {
      int[] arr = {10, 5, 3, 4, 3, 5, 6};
      boolean found = false;
      int i = 0;
      while(!found){
          for (int j = i+1; j < arr.length; j++){
              if (arr[i] == arr[j]){
                System.out.println("First repeating element: " + arr[i]);
                found = true;
              }
          }
          i++;
      }
    }
}