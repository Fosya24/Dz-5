import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RestService;

public class RestServiceTest {

    private final RestService service = new RestService();

    @Test
    public void shouldCalculateRest() {

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}
