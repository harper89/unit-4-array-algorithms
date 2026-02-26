import java.util.*;
public class ArrayListAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private ArrayList<Integer> intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */
   public ArrayListAlgorithms() {
      intArray = new ArrayList<Integer>();
   
   }
   

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      int length = (int) (Math.random() *100);
      for (int i = 0; i<length; i++) {
         intArray.add((int)(Math.random()*100));
      
      
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      int length = (int) (Math.random() *100);
      for (int i = 0; i<length; i++) {
         intArray.add(i+startNum);
      
      
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int largestInt = intArray.get(0);
      for (int i = 0; i<intArray.size(); i++) {
         if (intArray.get(i)>largestInt) largestInt = intArray.get(i);
      
      }
      return largestInt;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for (int i = 0; i<intArray.size(); i++) {
         for (int j = i+1; j<intArray.size(); j++) {
            if (intArray.get(i) == intArray.get(j)) return true;
         
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
   public String toString() {
      System.out.println(intArray);
      return "";
         }

     
   

   
     
   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayListAlgorithms list = new ArrayListAlgorithms();
      ArrayListAlgorithms list2 = new ArrayListAlgorithms();
      list.populateArrayWithRandom();
      list2.populateArrayWithSequential(0);
      System.out.println(list);
      System.out.println(list.findMax());
      System.out.println(list.hasDuplicates());
      System.out.println(list.isInArray(67));
      System.out.println(list2);
      System.out.println(list2.findMax());
      System.out.println(list2.hasDuplicates());
      System.out.println(list2.isInArray(67));
      
     
   }
}
