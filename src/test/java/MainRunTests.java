import hotel.MainRun;
import org.junit.jupiter.api.Test;

public class MainRunTests {
    private MainRun mainRun;

    @Test
    public void run() {
        mainRun = new MainRun();
        mainRun.getRoom();
    }
}
