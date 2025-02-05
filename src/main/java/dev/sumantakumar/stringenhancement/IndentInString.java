package dev.sumantakumar.stringenhancement;

public class IndentInString {
    public static void main(String[] args) {
        String string = "Hello World!\nHow are you?";
        System.out.println(string);
        System.out.println(string.indent(10));
        String string2 = "          Hello World!\n            How are you?";
        System.out.println(string2.indent(-10));
    }
}
