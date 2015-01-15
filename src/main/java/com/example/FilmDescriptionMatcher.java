package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class FilmDescriptionMatcher {

    private final Deque<Character> stack = new ArrayDeque<>();
    private char[] curLine;

    public boolean processLine(String line) {
        stack.clear();
        curLine = line.toCharArray();
        for (char c : curLine) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')': {
                    if (stack.size() > 0) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                }
            }
        }
        return stack.size() <= 0;
    }

    public void processArray(String[] lines) {
        int count = 0;
        for (String line : lines) {
            if (this.processLine(line)) {
                System.out.println("Line " + count + " is valid");
            } else {
                System.out.println("Line " + count + " is invalid");
            }
            count++;
        }
    }

    public static void main(String[] args) {
        FilmDescriptionMatcher pm = new FilmDescriptionMatcher();
        String[] expressions = new String[4];

        expressions[0] = "PUMP is an eye-opening documentary that tells the story of America's addiction to oil (and gas)";
        expressions[1] = "  from its corporate conspiracy beginnings to its current monopoly today));";
        expressions[2] = " and explains clearly and simply how we can end it (or not)";
        expressions[3] = " Rated PG for mild thematic material)";

        pm.processArray(expressions);
    }

}
