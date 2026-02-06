public class MemberDAOTest {
    public static void main(String[] args) {

        MemberDAO dao = new MemberDAOImpl();


        Member m1 = new Member("Alice");
        Member m2 = new Member("Catherine");
        Member m3 = new Member("Phiebie");
        dao.addMember(m1);
        System.out.println("Member name: " + m1.name + " id: " + m1.id);
        dao.addMember(m2);
        dao.addMember(m3);


        /*// CREATE
        Member m = new Member("Test Member", null);
        dao.addMember(m);
        System.out.println("Created: " + m);

        // READ
        Member fromDb = dao.getMemberById(m.getId());
        System.out.println("From DB: " + fromDb);

        // UPDATE
        m.name = "Updated Name";
        dao.updateMember(m);
        System.out.println("Updated");

        // READ ALL
        System.out.println("All members:");
        for (Member mem : dao.getAllMembers()) {
            System.out.println(mem);
        }

        // DELETE
        dao.deleteMember(m.getId());
        System.out.println("Deleted");*/
    }
}
