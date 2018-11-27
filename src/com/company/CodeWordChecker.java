package com.company;

public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String symbol;

    public CodeWordChecker(int min, int max, String symbol) {
        this.min = min;
        this.max = max;
        this.symbol = symbol;
    }
        public boolean isValid (String str){
            return str.length() >= min && str.length() <= max && !str.contains(symbol);
        }

}


