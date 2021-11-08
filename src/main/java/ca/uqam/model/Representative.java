package ca.uqam.model;

public class Representative extends Agent{

    public Representative(int numAgent) {
        super(numAgent);
    }

    public void fillPaper(Kiosk kiosk){
        kiosk.setPaperStatus(Level.High);
    }
}
