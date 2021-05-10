package support;

import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before //before each scenario
    public void start() {
        TestContext.initialize();
    }

    @After
    public void finish() {
        TestContext.teardown();
    }
}
