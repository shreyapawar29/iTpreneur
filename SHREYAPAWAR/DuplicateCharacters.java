public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        str = str.toLowerCase();

        int[] charCounts = new int[256]; 

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { 
                charCounts[ch]++;
            }
        }

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) i + ": " + charCounts[i] + " times");
            }
        }
    }
}
