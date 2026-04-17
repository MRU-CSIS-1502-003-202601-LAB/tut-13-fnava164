package SecondMain;

public abstract class Gadget implements OnOffable {
    private String model;

    public  Gadget (String model){
        this.model = model;
    }

    public void performDiagnostic(){
        System.out.println("performing Diagnostic");
    }

    public abstract int powerUsed();
}
