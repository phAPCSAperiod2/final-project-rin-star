import java.util.ArrayList;

public class Club {
    private ArrayList<Member> members;

    public Club() {
        members = new ArrayList<>();
    }

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void displayMembers() {
        System.out.println("Club Members:");
        for (int i = 0; i < members.size(); i++) {
            System.out.println("- " + members.get(i).getName());
        }
    }
}
