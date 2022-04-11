package DZ1;

public class Course {

    private final int[] obst;

    public Course(int jump, int run) {
        this.obst = new int[]{jump, run};
    }

    public void doIt(TeamMen men, TeamFamale famale) {
        for (int i = 0; i < men.getPeople().length; i++) {
            for (int k : obst) {
                if (men.getPeople()[i].getLongJump() < k) {
                    men.getPeople()[i].setWiner(false);
                    break;
                } else {
                    men.getPeople()[i].setWiner(true);
                }
            }
        }

        for(int i = 0; i<men.getPeople().length;i++) {
            for (int k : obst) {
            if (men.getPeople()[i].getSpeedRun() < k) {
                men.getPeople()[i].setWiner(false);
                break;
            } else {
                men.getPeople()[i].setWiner(true);
            }
        }
    }
        for(int i = 0; i<famale.getPeople().length;i++) {
        for (int k : obst) {
            if (famale.getPeople()[i].getLongJump() < k) {
                famale.getPeople()[i].setWiner(false);
                break;
            }
            else {
                men.getPeople()[i].setWiner(true);
            }
        }
    }
        for(
    int i = 0; i<famale.getPeople().length; i++)

    {
        for (int k : obst) {
            if (famale.getPeople()[i].getSpeedRun() < k) {
                famale.getPeople()[i].setWiner(false);
                break;
            } else {
                famale.getPeople()[i].setWiner(true);
                }
            }
        }
    }
}

