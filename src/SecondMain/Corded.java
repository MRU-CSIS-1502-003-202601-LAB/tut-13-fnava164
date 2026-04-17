package SecondMain;

public abstract class Corded extends Gadget{
    private String plugType;
    private boolean isPluggedIn;

    public Corded (String model, String plugType){
        super(model);
        this.plugType = plugType;

    }

    public boolean isPluggedIn(){
        return this.isPluggedIn = isPluggedIn;
    }

    public void plugIn(){
        this.isPluggedIn = true;
        System.out.println("is plugged in");
    }

    public void unPlug(){
        this.isPluggedIn = false;
    }
    
}
