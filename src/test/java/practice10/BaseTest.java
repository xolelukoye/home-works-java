package practice10;

import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected SetOfMethods setOfMethods;

    @BeforeEach
    public void setupTest() {
        setOfMethods = new SetOfMethods();
    }
}
