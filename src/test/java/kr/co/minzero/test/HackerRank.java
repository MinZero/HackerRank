package kr.co.minzero.test;

import org.junit.jupiter.api.Test;

public class HackerRank {
    @Test
    public void testString() throws Exception {
        String[] input = {"{}()",
                "({()})",
                "{}(",
                "[]"};
        for(String abc: input) {
            while(abc.matches(".*(\\{}|\\(\\)|\\[])+.*")) {
                abc = abc.replaceAll("(\\{}|\\(\\)|\\[])","");
            }
            if(abc.length() == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }


}
