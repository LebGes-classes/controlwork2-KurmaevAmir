import java.util.Random;
abstract class Student{
    private Random random = new Random();
    public int points;
    public abstract void makeProgramming();
    public abstract void makeElecEngineering();

    public int getPoints() {
        return points;
    }
}
