package kr.co.minzero;

import java.util.BitSet;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BitSet[] bits = {new BitSet(n), new BitSet(n)};
        for(int i = 0; i < m; i++ ){
            String command = scan.next();
            int set = scan.nextInt();
            int param = scan.nextInt();
            if(command.equalsIgnoreCase("AND")) {
                bits[set-1].and(bits[param-1]);
            } else if (command.equalsIgnoreCase("OR")) {
                bits[set-1].or(bits[param-1]);
            } else if (command.equalsIgnoreCase("XOR")) {
                bits[set-1].xor(bits[param-1]);
            } else if (command.equalsIgnoreCase("FLIP")) {
                bits[set-1].flip(param);
            } else if (command.equalsIgnoreCase("SET")) {
                bits[set-1].set(param);
            }
            System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
        }
    }
}
