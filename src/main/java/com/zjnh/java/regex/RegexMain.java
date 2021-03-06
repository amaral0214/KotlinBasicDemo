package com.zjnh.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String... args) {
        String source = "Hello, this is my phone number: 010-12345678.";
        String pattern = ".*(\\d{3}-\\d{8}).*";
        Matcher matcher = Pattern.compile(pattern).matcher(source);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
    }
}
