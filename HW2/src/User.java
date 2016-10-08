import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noah on 10/26/2015.
 */
public class User implements IUser {

    private ArrayList<IUser> followedUsers;
    private ArrayList<IGroup> groups;
    private ArrayList<String> tweetList;
    private String id;

    public User() {
        this.followedUsers = new ArrayList<IUser>();
        this.groups = new ArrayList<IGroup>();
        this.tweetList = new ArrayList<String>();
        this.id = new String();
    }

    @Override
    public void follow(IUser user) {
        if (!followedUsers.contains(user)) {
            followedUsers.add(user);
        }
    }

    @Override
    public void unfollow(IUser user) {
        followedUsers.remove(user);
    }

    @Override
    public void addToGroup(IGroup group) {
        if (!groups.contains(group)) {
            groups.add(group);
            group.addUser(this);
        }
    }

    @Override
    public void removeFromGroup(IGroup group) {
        groups.remove(group);
        group.removeUser(this);
    }

    @Override
    public List<IUser> getFollowedUsers() {
        return followedUsers;
    }

    @Override
    public List<IGroup> getGroups() {
        return groups;
    }

    @Override
    public List<IUser> getFollowedUsersInGroup(IGroup group) {
        List<IUser> followedUsersInGroup = new ArrayList<IUser>();
        for (IUser user : followedUsers) {
            if (user.getGroups().contains(group)) {
                followedUsersInGroup.add(user);
            }
        }
        return followedUsersInGroup;
    }

    @Override
    public void tweeted(String tweet) {
        tweetList.add(tweet);
    }

    @Override
    public String getLastTweet() {
        return tweetList.get(tweetList.size()-1);
    }

    @Override
    public List<String> getTweetHistory() {
        return tweetList;
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
        if (o instanceof User) {
            if (id.equals(o.toString())) {
                return true;
            }
        }
        return false;
    }
}
