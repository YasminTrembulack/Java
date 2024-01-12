package Robot;
public enum Move {
    AHEAD_1(1),
    BEHIND_1(-1),
    AHEAD_2(2),
    BEHIND_2(-2);

    private Integer speed;

    Move(Integer speed){
        this.speed = speed;
    }

    public Integer getSpeed() {
        return this.speed;
    }
}
