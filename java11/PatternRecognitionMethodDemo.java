package java11;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class PatternRecognitionMethodDemo {
    public static void main(String[] args) {
        var str = Pattern.compile("Sooraj").asMatchPredicate();
        System.out.println(str.test("Sooraaj"));

        var string = Pattern.compile("abcd").asMatchPredicate();
        System.out.println(string.test("abqcd"));

    }
}
