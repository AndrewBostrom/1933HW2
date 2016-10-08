/**
 * Created by Noah on 10/26/2015.
 */
public class PotentialRecommendation {
    private int encounters;
    private IUser user;
    private int groupCounter;

    public PotentialRecommendation(IUser user) {
        this.user = user;
        this.encounters = 1;
        this.groupCounter = 1;
    }

    public void incEncounters() {
        encounters++;
    }

    public int getEncounters() {
        return encounters;
    }

    public IUser getUser() {
        return user;
    }

    public void addGroupCounter(int add) {groupCounter += add;}

    public int getGroupCounter() {return groupCounter;}
}