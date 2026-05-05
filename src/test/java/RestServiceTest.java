import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.RestService;

public class RestServiceTest {

    private final RestService service = new RestService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void shouldCalculateRest(int income, int expenses, int threshold, int expected) {
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
