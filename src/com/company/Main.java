package com.company;

public class Main {

    public static void main(String[] args) {

      int n = 5;
      int power = 3;
      int result = calculatePower (n, power);
        System.out.println(n + result);

    }
static int calculatePower(int num, int power){

        int answer = 1;
        if(num > 0 && power == 0){
            return answer;
        }
        else if (num == 0 && power >=1){
            return 0;
        }
        else {
            for (int i = 1; i <= power; i++){
                answer = answer*num;

            }
            return answer;

        }


}
}
