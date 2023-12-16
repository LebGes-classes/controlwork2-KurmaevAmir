import java.util.Random;

public class ITIS extends Student{
    public ITIS() {
        this.points = 0;
    }

    @Override
    public void makeProgramming() {
        Random random = new Random();
        this.points += (random.nextBoolean()) ? 4 : 5;
    }

    @Override
    public void makeElecEngineering() {
        Random random = new Random();
        this.points += (random.nextBoolean()) ? 3 : 4;
    }
}
