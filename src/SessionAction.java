public class SessionAction {
    int id;

    double time;
    Action action;
    public SessionAction (double time, Action action) {
        this. time = time;
        this. action = action;
      }
    @Override
    public String toString() {
        return "SessionAction {id=" + id + ", action='" + action + "'}";
    }
}
