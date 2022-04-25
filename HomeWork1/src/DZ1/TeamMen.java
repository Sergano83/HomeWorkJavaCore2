package DZ1;

public class TeamMen {


   private String name;
   private People[] members;

    public TeamMen(String name, People member1, People member2, People member3, People member4) {
        this.name = name;
        members = new People[] {member1, member2, member3, member4};
    }
    public void winInfo() {
        for (People member : members) {
            if (member.isWiner()) {
                System.out.println(member);
            }
        }

    }
    public void info() {
        for (People member : members) {
            System.out.println(member);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People[] getPeople() {
        return members;
    }

    public void setPeople(People[] members) {
        this.members = members;
    }
}
