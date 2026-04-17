package SecondMain;

public class run {
    public static void main(String[] args){
        Corded ninjaBlender = new Blender("Ninja 2000");
        //ninjaBlender.setspeed("high");
        if (ninjaBlender instanceof Blender){
            Blender blender = (Blender)ninjaBlender;
            blender.setSpeed("high");
        }
        ninjaBlender.turnOn();
        ninjaBlender.plugIn();
        ninjaBlender.turnOn();
    }
}
