package com.jaymansmann;

class ScoreKeeper {
    private int score;
    public ScoreKeeper() {
        this.score = 0;
    }

    public int addPoint() {
        return ++score;
    }

    public int addPoints(int points) {
        if(points > 100) {
            throw new IllegalArgumentException();
        }
        score += points;
        return score;
    }

    public int removePoint() {
        return --score;
    }
}
