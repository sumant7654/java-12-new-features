package dev.sumantakumar.jvmconstantapi;

public class JVMContantApi {
    public static void main(String[] args) {
        String data ="Hello World SumantaKumar, How are you today?";

        System.out.println(data.describeConstable().get());
        System.out.println(data.resolveConstantDesc(null));
    }
}
