package academy.learnprogramming;

import academy.learnprogramming.config.MaxNumber;
import academy.learnprogramming.config.MinNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {

    // -- fields --
    private final Random random = new Random();

    // commented out to change from field injection to constuctor injection
//    @Autowired
//    @MaxNumber
    private final int maxNumber;

//    @Autowired
//    @MinNumber
    private final int minNumber;

    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // -- public methods --
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }
}
