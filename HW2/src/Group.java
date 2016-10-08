import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noah on 10/26/2015.
 */
public class Group implements IGroup {

    private ArrayList<IUser> members;
    private String id;

    public Group() {
        this.members = new ArrayList<IUser>();
        this.id = new String();
    }

    @Override
    public List<IUser> getUsers() {
        return members;
    }

    @Override
    public void addUser(IUser user) {
        members.add(user);
    }

    @Override
    public void removeUser(IUser user) {
        members.remove(user);
    }

    @Override
    public int getUserCount() {
        return members.size();
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Identifiable i) {
        return id.compareTo(i.toString());
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Group) {
            if (id.equals(o.toString())) {
                return true;
            }
        }
        return false;
    }
}
