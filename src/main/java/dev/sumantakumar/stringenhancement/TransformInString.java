package dev.sumantakumar.stringenhancement;

public class TransformInString {
    public static void main(String[] args) {
        String input = "Hello World! How are you?";
        System.out.println(input);
        String upper = input.transform(s -> s.toUpperCase());
        String lower = input.transform(s -> s.toLowerCase());
        System.out.println(upper);
        System.out.println(lower);

    }
}
