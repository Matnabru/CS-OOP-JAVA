public class Slot extends Module{

    public Slot(int type){
        super(type);
    }

    public void addModule(Module module) {
        setPower(module.isPower());
        setType(module.getType());
    }
    public void removeModule(){
        setPower(false);
        setType(0);
    }


}
