package DZ1;

public class Main {
    public static void main(String[] args) {
        People member1 = new People("Petea",158,9);
        People member2 = new People("Vasea",176,10);
        People member3 = new People("Kolea",142,11);
        People member4 = new People("Vanea",190,8);
        People member5 = new People("Olea",155,13);
        People member6 = new People("Sveta",176,12);
        People member7 = new People("Ira",152,14);
        People member8 = new People("Lena",188,10);
        TeamMen teamMen = new TeamMen("Мальчики", member1, member2, member3,member4);
        TeamFamale teamFamale = new TeamFamale("Девочки", member5, member6, member7, member8);
        Course course = new Course(188,12);

        course.doIt(teamMen,teamFamale);

        teamMen.info();
        teamFamale.info();
        System.out.println();
        teamMen.winInfo();
        teamFamale.winInfo();

    }
}
