public class Module {
    private boolean power;
    private int type;
    public Module(int type){
        power = false;
        this.type = type;
    }
    public Module(){

    }
    public int getType() {
        return type;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setType(int type) {
        this.type = type;
    }


    public void switchPower() {
        this.power = !this.power;
    }
    @Override
    public String toString() {
        return "Module{" +
                "power=" + power +
                ", type=" + type +
                '}';
    }
}
