package com.epam.rd.autotasks;

public class CarouselRun {

    int position = 0;
    int[] carrousel;

    public CarouselRun(int[] finalArray) {
        this.carrousel = finalArray;
    }

    public int next() {
        if (isFinished())
            return -1;
        else {
            while (carrousel[position %= carrousel.length] <= 0) {
                position++;
            }
        }
        return carrousel[position++]--;
    }

    public boolean isFinished() {
        for (int var : carrousel) {
            if(var>0){
                return false;
            }
        }
        return true;
    }
}
