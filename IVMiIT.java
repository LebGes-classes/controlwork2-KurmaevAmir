import java.util.Random;

public class IVMiIT extends Student{
    public IVMiIT() {
        this.points = 0;
    }

    @Override
    public void makeProgramming() {
        Random random = new Random();
        this.points += (random.nextBoolean()) ? 3 : 4;
    }

    @Override
    public void makeElecEngineering() {
        Random random = new Random();
        this.points += (random.nextBoolean()) ? 4 : 5;
    }
}
