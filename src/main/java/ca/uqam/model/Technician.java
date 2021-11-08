package ca.uqam.model;

public class Technician extends Agent{

    public Technician(int numAgent) {
        super(numAgent);
    }

    public void solveJam(Kiosk kiosk){
        kiosk.setPaperJam(false);
    }
}
