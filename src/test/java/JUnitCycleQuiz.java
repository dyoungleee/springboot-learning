import org.junit.jupiter.api.*;

public class JUnitCycleQuiz {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Hello!");
    }

    @Test
    public void junitQuiz3() {
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4() {
        System.out.println("This is second test");
    }

    // @__All 메서드에는 static 추가해주는 거 까먹지 말것!
    @AfterAll
    public static void afterAll() {
        System.out.println("Bye!");
    }
}
