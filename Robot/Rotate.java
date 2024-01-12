package Robot;
public enum Rotate{
    RIGHT_15(15.0), 
    LEFT_15(-15.0),
    RIGHT_30(30.0), 
    LEFT_30(-30.0);

    private Double angle;

    Rotate(Double ang){
        this.angle = ang; 
    }

    public Double getAngle(){
        return this.angle;
    }
}