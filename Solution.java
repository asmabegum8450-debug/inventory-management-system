import java.util.Arrays;

public class Solution {
   public static void duplicateZeros(int[] inventory) {
       int n = inventory.length;
       int zeros = 0;

       for ( int num : inventory) {
        if(num == 0){
            zeros++;
        }
       }

       int i = n - 1;  // main arraY 
       int j = n - 1 + zeros;  // imaginary array     array size = 7 (4,0,1,0,3,4,0 as we r not allowed to change the array size )4,0,0,1,0,0,3,4,0,0 array size = 10  j = 10 

       //backword process
       while ( i >=0) {
           if ( j < n ) {
                inventory[j] = inventory[i];
           }

           if (inventory[i] == 0) {
               j--;
               if (j < n) {
                inventory[j] = 0;
               }
           }

           i--;
           j--;
       }
   }
   
   public static void runTest(String testName, int[] input) {
     System.out.println("==================");
     System.out.println(testName);
     System.out.println("Original: " + Arrays.toString(input));

     duplicateZeros(input);

     System.out.println("Updated:" + Arrays.toString(input));
   }

   public static void main(String[] args){
     runTest("Normal test 1",
                       new int[] {4,0,1,3,0,2,5,0});
     
     runTest("Normal test 2",
                        new int[] {3, 2,1});
    runTest("Normal test 3",
                       new int[] {1,2,0,3,4});

    runTest("Edge Test 1",
                    new int[] {});
    runTest("Edge Test 2",
                    new int[] {0, 0, 0});

    runTest("Edge Test 3",
                    new int[] {0});
   }
}
