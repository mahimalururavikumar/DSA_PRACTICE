//import java.lang.module.ModuleDescriptor.Builder;

import java.util.Arrays;

public class practice {

    //CHECK PALIINDROME
    public static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println(str + " is Not a Palindrome");
                return false;
            }
        }
        System.out.println(str + " is a palindrome");
        return true;
    }

    //DISTANCE USING DIRECTIONS
    public static float findDistance(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X = x * x;
        int Y = y * y;
        return (float) Math.sqrt(X + Y);
    }

    //MAKING UPPER CASE
    public static void strToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    //LARGEST STRING USING LEXICAL --------AND---------   SUB STRING
    public static void compareAndSubString(String str[]) {
        // largest String on lexical(a,b,c,....)
        String fruits[] = { "apple", "banana", "orange", "mango" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        // SubString
        String string = "hello world ";
        System.out.println(string.substring(5, 10));
    }

    //STRING COMPRESSION
    public static StringBuilder stringCompression(String str) {
        StringBuilder newstr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if (count > 1) {
                newstr.append(count.toString());
            }
        }
        return newstr;
    }

    //COUNT VOWELS
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    //ANAGRAM
    public static void anagram(String str, String str2) {
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        if (str.length() == str2.length()) {
            char[] str1 = str.toCharArray();
            char[] str22 = str2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str22);
            boolean result = Arrays.equals(str1, str22);
            if (result) {
                System.out.println(str + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str + " and " + str2 + " are not anagrams of each other.");
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String largest = "earth";
        // String str = "heart";
        // anagram(largest, str);
        // sc.close();
    }
}