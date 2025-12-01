package org.example.solution;

public class Solution {
    final public static char LEFT  = 'L';
    final public static char RIGHT = 'R';

    private int number = 50;
    private int zerosCount = 0;

    public void applyRotation(String code){

        char direction = code.charAt(0);
        int distance = Integer.parseInt(code.substring(1));

        if (direction == LEFT) {
            number = number - distance;
        } else if (direction == RIGHT) {
            number = number + distance;
        }

        number = ((number % 100) + 100) % 100;

        if (number == 0) {
            zerosCount++;
        }
    }

    public int getZerosCount() {
        return zerosCount;
    }
}
