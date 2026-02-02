import java.util.ArrayList;
import java.util.List;

public class Session {
    int id;
    Member member;
    Trainer trainer;
    Status Status;
    List<SessionAction> actions = new ArrayList<>();
    public Session (int id, Member Member, Trainer Trainer, Status Status) {
        this.member = Member;
        this.id = id;
        this.trainer = Trainer;
        this.Status = Status;
    };
    public void changeStatus (Status Status, SessionAction sa1) {
        this.Status = Status;
        actions.add(sa1);
    };
    public int getId() {
        return id;
    }
    public Status getStatus() {
        return Status;
    }
    public List<SessionAction> getActions() {
        return new ArrayList<>(actions);
    };
    @Override
    public String toString() {
        return "Session {id=" + id + ", status='" + Status + "'}";
    }

}
