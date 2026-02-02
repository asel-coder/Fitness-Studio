import java.util.ArrayList;
import java.util.List;

public class Member {
    Gym gym;
    int id;
    String name;
    List<Session> sessions = new ArrayList<>();
    public Member (String name, Gym gym) {
        this. name = name;
        this.gym = gym;
        int id = gym.members.size() + 1;
        this.id = id;}
    public void bookSession(Trainer t) {
        int id = gym.sessions.size() + 1;
        Session session = new Session (id, this, t, Status.created);
        int sessionActionId = session.actions.size() +1;
        double b = Math.random();
        SessionAction sa = new SessionAction(sessionActionId, b, Action.memberCreated );
        session.actions.add(sa);
        sessions.add(session);
        gym.sessions.add(session);
    };
    public void cancelSession(int id) {
        Session s = gym.getSessionById(id);
        int sessionActionId = s.actions.size() +1;
        double t = Math.random();
        SessionAction sa = new SessionAction(sessionActionId, t, Action.memberCancelled );
        s.changeStatus(Status.cancelledByMember, sa);
    };
    public int getId() {
        return id;
    }

    public List<Session> getSessions() {
        return new ArrayList<>(sessions);
    };
    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "'}";
    }

}
