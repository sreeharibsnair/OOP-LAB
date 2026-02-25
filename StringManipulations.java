import java.util.Scanner;

public class StringManipulations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = new String(sc.nextLine());

        System.out.println("Length of string: " + s1.length());

        System.out.print("Enter second string to concatenate: ");
        String s2 = sc.nextLine();
        String s3 = s1.concat(s2);
        System.out.println("Concatenated string: " + s3);

        System.out.print("Enter index to extract character: ");
        int index = sc.nextInt();
        System.out.println("Character at index " + index + ": " + s1.charAt(index));
        sc.nextLine();

        System.out.print("Enter string to compare: ");
        String s4 = sc.nextLine();
        System.out.println("Using equals(): " + s1.equals(s4));
        System.out.println("Using compareTo(): " + s1.compareTo(s4));

        System.out.print("Enter substring to search: ");
        String sub = sc.nextLine();
        System.out.println("Index of substring: " + s1.indexOf(sub));

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);
        System.out.println("After replace: " + s1.replace(oldChar, newChar));

        System.out.println("Uppercase: " + s1.toUpperCase());

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String numStr = String.valueOf(num);
        System.out.println("String value of integer: " + numStr);
        sc.nextLine();

        System.out.print("Enter a sentence to split: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.print("Enter string for StringBuffer: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        System.out.print("Enter string to append: ");
        sb.append(sc.nextLine());
        System.out.println("StringBuffer result: " + sb);

        sc.close();
    }
}

