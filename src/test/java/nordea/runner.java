package nordea;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/main/java/nordea"},
        format = {"pretty", "html:target/Destination"}
)
public class runner {
}
