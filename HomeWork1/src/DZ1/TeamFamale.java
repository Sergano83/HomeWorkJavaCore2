package DZ1;

public class TeamFamale {
    private String name;
    private People[] members;

    public TeamFamale(String name, People member5, People member6, People member7, People member8) {
        this.name = name;
        members = new People[] {member5, member6, member7, member8};
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

