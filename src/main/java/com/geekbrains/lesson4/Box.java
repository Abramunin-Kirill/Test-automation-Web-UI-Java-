package com.geekbrains.lesson4;

public class Box {
    private Integer ballCounter;

    public Box() {
        this.ballCounter = 0;
    }

    public Integer getBallCounter() {
        return ballCounter;
    }

    public void setBallCounter(Integer ballCounter) {
        this.ballCounter = ballCounter;
    }

    public void shuffleBalls() throws BoxIsEmptyException {
        if (ballCounter > 2) {
            System.out.println("Мячи перемешаны");
        } else {
            throw new BoxIsEmptyException();
        }
    }

    public void addBall() {
        ballCounter++;
    }

    public void removeBall() {
        if (ballCounter == 0) {
            throw new NullPointerException();
        }
        ballCounter--;
    }
}
