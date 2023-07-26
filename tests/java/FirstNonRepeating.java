public class FirstNonRepeating {
    public static void main(String args[]) {
      int[] arr = {-1, 2, -1, 3, 0};
      boolean found = false;
      
      for(int i = 0; i < arr.length; i++){
          found = false;
          for (int j = 0; j < arr.length; j++){
              if(j != i){
                  if (arr[i] == arr[j]){
                      found = true;
                      break;
                  }
              }
          }
          if(!found){
              System.out.println("Not found: " + arr[i]);
              break;
          }
      }
    }
}