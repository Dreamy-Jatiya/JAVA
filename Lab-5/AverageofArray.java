//2. Write a program that creates and initializes a four integer element array. Calculate and 
//display the average of its values.[A]

public class AverageofArray {
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40}; // four integer elements

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average of array values: " + average);
    }
}
