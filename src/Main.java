import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Gym g = new Gym();
     g.registerMember("Bob");
        g.registerMember("Alice");
        g.registerMember("Asel");
     List<Member> a = g.getMembers();
     /*System.out.println(a);*/
        Trainer t1 = g.registerTrainer ("Carl");
        Member best = g.getMemberById(3);
        best.bookSession(t1);
        best.bookSession(t1);
        best.bookSession(t1);
      List<Session> b = best.getSessions();
        System.out.println(b);
        best.cancelSession(2);
        Session d = g.getSessionById(2);
        List<SessionAction> c = d.getActions();
        System.out.println(c);
        System.out.println(b);



    }
}