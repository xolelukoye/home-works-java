import org.junit.jupiter.api.BeforeEach;
import practice10.SetOfMethods;

public class BaseTest {

    protected SetOfMethods setOfMethods;

    @BeforeEach
    public void setupTest() {
        setOfMethods = new SetOfMethods();
    }
}
