public class SplitDemo {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String csv = "java,spring,mysql,react";
        String[] tech = csv.split(",");
        for (String t : tech) {
            System.out.println(t);
        }
    }
}
