//3. Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. 
//   The program should continue till user enters a word “quit”. 
//   Display the total count of each vowel for all sentences. [B] 
import java.util.Scanner;

class VowelCounter {

    int totalA = 0;
    int totalE = 0;
    int totalI = 0;
    int totalO = 0;
    int totalU = 0;

    void countVowels(String sentence) {

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < sentence.length(); j++) {
            char ch = Character.toLowerCase(sentence.charAt(j));

            if (ch == 'a') a++;
            else if (ch == 'e') e++;
            else if (ch == 'i') i++;
            else if (ch == 'o') o++;
            else if (ch == 'u') u++;
        }

        // Display count for current sentence
        System.out.println("Vowel count in this sentence:");
        System.out.println("A=" + a + " E=" + e + " I=" + i + " O=" + o + " U=" + u);

        // Add to total count
        totalA += a;
        totalE += e;
        totalI += i;
        totalO += o;
        totalU += u;
    }

    public void displayTotal() {
        System.out.println("\nTotal Vowel Count for all sentences:");
        System.out.println("A=" + totalA);
        System.out.println("E=" + totalE);
        System.out.println("I=" + totalI);
        System.out.println("O=" + totalO);
        System.out.println("U=" + totalU);
    }
}

public class VowelCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VowelCounter vc = new VowelCounter();

        while (true) {
            System.out.print("Enter a sentence (type 'quit' to stop): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            vc.countVowels(input);
        }

        vc.displayTotal();
        sc.close();
    }
}