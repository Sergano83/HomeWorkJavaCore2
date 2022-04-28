package DZ1;

public class People {
    private String name;
    private int longJump;
    private int speedRun;
    private boolean isWiner = false;

    public People(String name, int longJump, int speedRun) {
        this.name = name;
        this.longJump = longJump;
        this.speedRun = speedRun;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", longJump=" + longJump +
                ", speedRun=" + speedRun +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLongJump() {
        return longJump;
    }

    public void setLongJump(int longJump) {
        this.longJump = longJump;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public boolean isWiner() {
        return isWiner;
    }

    public void setWiner(boolean winer) {
        isWiner = winer;
    }
}
