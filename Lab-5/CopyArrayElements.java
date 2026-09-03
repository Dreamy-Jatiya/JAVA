//4 Write a Java program to copy all the elements of an array to another array and print 
//both the array elements. [B] 

public class CopyArrayElements {
   
    public static void main(String[] args) {
        int[] originalArray = {5, 10, 15, 20, 25};
        int[] copiedArray = new int[originalArray.length];

        // Copy elements
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Print original array
        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        // Print copied array
        System.out.println("\nCopied Array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}
