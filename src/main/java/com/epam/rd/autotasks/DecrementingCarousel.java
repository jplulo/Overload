package com.epam.rd.autotasks;

public class DecrementingCarousel {
    boolean isRunning;
    int[] carrousel;
    int addIndex;

    public DecrementingCarousel(int capacity) {
        carrousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (element > 0 && addIndex < carrousel.length && !isRunning) {
            carrousel[addIndex++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        if (!isRunning) {
            isRunning = true;
            return new CarouselRun(carrousel);
        }
        return null;
    }
}