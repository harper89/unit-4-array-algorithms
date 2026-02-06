public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
       intArray = new int[arraySize];
   }
   public ArrayAlgorithms(int[] array) {
       intArray = array;
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for (int i = 0; i<intArray.length; i++) {
         intArray[i] = (int) (Math.random()*100);
      
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for (int i = 0; i<intArray.length; i++) {
         intArray[i] = i+startNum;
      
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int largestInt = intArray[0];
      for (int i = 0; i<intArray.length; i++) {
         if (intArray[i]>largestInt) largestInt = intArray[i];
      
      }
      return largestInt;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for (int i = 0; i<intArray.length; i++) {
         for (int j = i+1; j<intArray.length; j++) {
            if (intArray[i] == intArray[j]) return true;
         
         }
      
      
      }
      return false;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      
      for (int currentNum : intArray) {
         if (currentNum == intToFind) return true;
      
      }
      return false;
   }

   // ===== UWHS ALGORITHMS =====

   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
      int best = 1;
      int last = intArray[0];
      int current = 1;
      for (int i = 1; i<intArray.length; i++) {
         if (intArray[i]>last) {
            current++;
         } else {
            current = 1;
         }
         if (current>best) best = current;
         last = intArray[i];
      
      }
      return best;
   }
   public String toString() {
      String list = "";
      for (int i = 0; i<intArray.length-1; i++) {
      list+= intArray[i]+",";
      
      }
      list+= intArray[intArray.length-1];
      return "{" + list + "}";
   }

   public int[] moveZeroesToEnd() {
      // UWHS ONLY:
      // Move all zeros to the end of while preserving order of non-zero elements. 
      // HINT: use a new array instead of changing intArray
      // Return the changed array
      int slot = intArray.length-1;
      int[] newArray = new int[intArray.length];
      for (int i = 0; i<intArray.length; i++) {
         if (intArray[i] == 0) {
            newArray[slot] = 0;
            slot--;
          }
      }
      slot = 0;
      for (int i = 0; i<intArray.length; i++) {
         if (intArray[i] != 0) {
            newArray[slot] = intArray[i];
            slot++;
          }
      }
      return newArray;
      
   }

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayAlgorithms list = new ArrayAlgorithms(50);
      list.populateArrayWithRandom();
      System.out.println(list);
      System.out.println(list.findMax());
      System.out.println(list.hasDuplicates());
      System.out.println(list.isInArray(67));
      System.out.println(list.longestContiguousSubarray());
      ArrayAlgorithms list2 = new ArrayAlgorithms(list.moveZeroesToEnd());
      System.out.println(list2);
      ArrayAlgorithms list3 = new ArrayAlgorithms(20);
      list3.populateArrayWithSequential(5);
      System.out.println(list3);
   }
}
