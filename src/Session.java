import java.util.ArrayList;
import java.util.List;

public class Session {
    int id;
    Member member;
    Trainer trainer;
    Status Status;
    List<SessionAction> actions = new ArrayList<>();
    public Session (Member Member, Trainer Trainer) {
        this.member = Member;

        this.trainer = Trainer;
        this.Status = Status.created;
    };
    public void changeStatus (Status Status, SessionAction sa1) {
        this.Status = Status;
        actions.add(sa1);
    };
    public int addAction (SessionAction a) {
        int id = actions.size() + 1;
        a.id = id;
        actions.add(a);
        return id;
    }



    public List<SessionAction> getActions() {
        return new ArrayList<>(actions);
    };
    @Override
    public String toString() {
        return "Session {id=" + id + ", status='" + Status + "'}";
    }

}
