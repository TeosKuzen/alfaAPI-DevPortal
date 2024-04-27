import org.fusesource.jansi.Ansi;

public class Logger extends BaseTest {
    public final String LOG_FORMAT = "|%-10s|%-20s|%-30s]|%-10s|%n";
    public final String FILE_LOG_FORMAT = "|%-10s|%-20s|%-30s|%n";
    public final String MESSAGE_FORMAT = "|%-10s|%-30s|%n";
    public String ERROR = Ansi.ansi().fg(Ansi.Color.RED).a("ОШИБКА").reset().toString();
    public String SUCCESS = Ansi.ansi().fg(Ansi.Color.GREEN).a("УСПЕХ").reset().toString();
    public String FILE = Ansi.ansi().fg(Ansi.Color.BLUE).a("ФАЙЛ").reset().toString();
    public String WARNING = Ansi.ansi().fg(Ansi.Color.YELLOW).a("ВНИМАНИЕ").reset().toString();

    public void log(String type, String action, String target, String status) {
        System.out.printf(LOG_FORMAT, type, action, target, status);
    }

    public void fileLog(String type, String file, String status) {
        System.out.printf(FILE_LOG_FORMAT, type, file, status);
    }

    public void toDo(String type, String message) {
        System.out.printf(MESSAGE_FORMAT, type, message);
    }
}
