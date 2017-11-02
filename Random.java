import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static int RInt(int min, int max){
        int random = ThreadLocalRandom.current().nextInt(min, max + 1);

        return random;
    }
}
