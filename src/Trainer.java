import java.util.ArrayList;
import java.util.List;

public class Trainer {
    int id;
    String name;
    List<Session> sessions = new ArrayList<>();
    public Trainer (int id, String name) {
        this. name = name;
        this.id = id;
    }


}
