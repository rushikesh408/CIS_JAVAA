package com.june5;

public class Div {

    void division(){
        for(int i =1;  i<= 100 ;i++){



            if(i%3==0 && i%5 == 0 ){
                System.out.println("FizzBuzz");
            }

            else if (i%3==0 ) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {
        Div div = new Div();
        div.division();
    }

}
