import java.util.Scanner;
class arrayA{
    int size;
    int[] arr= new int[size];
    void setter(int s){
        size = s;
        arr= new int[size];
    }
    void sort()
    {
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void search(int key){
        boolean found= false;
        for(int i=0; i<size; i++){
            if(arr[i]==key){
                System.out.println("Element found at index: "+i);
                found= true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in the array.");
        }

    }
    void sum(){
        int sum=0;
        for(int i=0; i<size; i++){
            sum+= arr[i];
        }
        System.out.println("Sum of the elements in the array: "+sum);
    }
    void average(){
        int sum=0;
        for(int i=0; i<size; i++){
            sum+= arr[i];
        }
        double average= (double)sum/size;
        System.out.println("Average of the elements in the array: "+average);
    }
}


public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        arrayA a1= new arrayA();
        a1.setter(size);
        for(int i=0; i<size; i++){
            a1.arr[i]= arr[i];
        }
        a1.sort();
        System.out.println("Enter the element to search: ");
        int key= sc.nextInt();
        a1.search(key);
        a1.sum();
        a1.average();

        sc.close();
    }
}