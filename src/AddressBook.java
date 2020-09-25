import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfoList;

    public AddressBook() {
        this.buddyInfoList = new ArrayList<BuddyInfo>();
    }

    /**
     *
     * Adds BuddyInfo object to Address Book
     *
     * @param b
     */
    public void addBuddy(BuddyInfo b) {
        buddyInfoList.add(b);
    }

    /**
     *
     * Removes BuddyInfo object from Address Book
     * @param b
     */
    public void removeBuddy(BuddyInfo b) {
        for(BuddyInfo buddy : this.buddyInfoList) {
            if(buddy.equals(b)) {
                this.buddyInfoList.remove(buddy);
            }
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Address Book: ");
    }
}
