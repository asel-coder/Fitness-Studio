import java.util.List;
import java.util.ArrayList;

public class Gym {
    List<Trainer> trainers;
    List<Member> members;
    List<Session> sessions;

    public Gym() {
        this.sessions = new ArrayList<>();
        this.members = new ArrayList<>();
        this.trainers = new ArrayList<>();
    }

    public void registerMember (String name) {
        Member m = new Member(name, this);
        members.add(m);
    }
    public Session getSessionById(int id) {
        for (Session session : sessions) {
            if (session.getId() == id) {
                return session;
            }
        }
        return null; // not found
    };
    public Member getMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null; // not found
    };
    public List<Member> getMembers() {
        return new ArrayList<>(members);
    };

}
