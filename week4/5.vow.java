
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                    System.out.print(ch+" ");//to print vowels
                    //System.out.println();
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("\nNumber of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}

