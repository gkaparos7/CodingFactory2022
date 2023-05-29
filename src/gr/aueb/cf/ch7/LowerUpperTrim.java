package gr.aueb.cf.ch7;

public class LowerUpperTrim {

    public static void main(String[] args) {
        String s = "Athens University";
        String lowercase;
        String uppercase;
        String trimed;
        String s2 = "";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimed = s.trim();

        System.out.println("*".repeat(20));

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }
    }
}