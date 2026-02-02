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

    public Member registerMember (String name) {
        Member m = new Member(name, this);
        int id = members.size() + 1;
        m.id = id;
        members.add(m);
        return m;
    }
    public Trainer registerTrainer (String name) {
        Trainer m = new Trainer(name, this);
        int id = trainers.size() + 1;
        m.id = id;
        trainers.add(m);
        return m;
    }
    public int addSession (Session s) {
        int id = sessions.size() + 1;
        s.id = id;
        sessions.add(s);
        return id;
    }
    public Session getSessionById(int id) {
        for (Session session : sessions) {
            if (session.id == id) {
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
