package com.wildernessdrtech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        String numberAsString = Integer.toString(number);
        int intLength = numberAsString.length();
        int first=0, last = 0;

        for(int i = 0; i < intLength; i++){
            if(i == 0){
                first = Integer.parseInt(numberAsString.substring(i,i+1));
            }
            if(i == (intLength -1)){
                last = Integer.parseInt(numberAsString.substring(i,i+1));
            }
            System.out.println(numberAsString.substring(i,i+1));
        }

        return first + last;
    }
}
