import java.math.*;

public class StringMatcher {
    public static void main(String[] args) {
        String regex = ".@.";

        System.out.println(Math.abs(1-2));;

        StringMatcher.compare("Hacker@Earth.com",regex);
        StringMatcher.compare("a@N",regex);
        StringMatcher.compare("Java@Program",regex);
    }

    private static void compare(String s, String regex) {
        if (s.matches(regex)){
            System.out.println(s+" matched");
        } else {
            System.out.println(s+" doesn't match");
        }
    }
}
