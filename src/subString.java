public class subString {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language.";

        int indexOfJava = sentence.indexOf("Java");
        String substring = sentence.substring(indexOfJava, indexOfJava + 4);

        System.out.println("Index of 'Java': " + indexOfJava);
        System.out.println("Extracted substring: " + substring);
    }
}