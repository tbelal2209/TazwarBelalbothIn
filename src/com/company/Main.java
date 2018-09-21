package com.company;

public class Main {

    public static void main(String[] args){
        System.out.println(bothin("Hello"));
    }

    public static String bothin(String str)
    {
        int ei = 0;
        int oi = 1;
        String eout = "";
        String oout = "";
        while (ei < str.length()) {
            eout = eout + str.substring(ei, ei + 1);
            ei = ei + 2;
        }
      while ((oi < str.length()) && (oi%2)==1) {
            oout = oout + str.substring(oi, oi + 2);
            oi = oi + 1;
      }
        return eout + oout;
    }
}
