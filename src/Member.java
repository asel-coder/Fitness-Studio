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
        this.id = 0;}
    public void bookSession(Trainer t) {
        Session session = new Session (this, t);
        session.id = gym.addSession(session);

        double b = Math.random();
        SessionAction sa = new SessionAction(b, Action.memberCreated );
       session.addAction(sa);

        sessions.add(session);
    };
    public void cancelSession(int id) {
        Session s = gym.getSessionById(id);
        double t = Math.random();
        SessionAction sa = new SessionAction(t, Action.memberCancelled );
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
