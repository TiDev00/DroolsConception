package ca.uqam.model;

public class Kiosk {

    private final KioskType kioskType;
    private boolean paperJam;
    private Level paperStatus;
    private final int kioskNumber;

    public KioskType getKioskType() {
        return kioskType;
    }

    public boolean isPaperJam() {
        return paperJam;
    }

    public void setPaperJam(boolean paperJam) {
        this.paperJam = paperJam;
    }

    public void setPaperStatus(Level paperStatus) {
        this.paperStatus = paperStatus;
    }

    public int getKioskNumber() {
        return kioskNumber;
    }

    public boolean isPaperEmpty(Kiosk kiosk){
        return kiosk.paperStatus == Level.Empty;
    }

    public boolean isPaperLow(Kiosk kiosk){
        return kiosk.paperStatus == Level.Low;
    }

    public Kiosk(KioskType kioskType, boolean paperJam, Level paperStatus, int kioskNumber) {
        this.kioskType = kioskType;
        this.paperJam = paperJam;
        this.paperStatus = paperStatus;
        this.kioskNumber = kioskNumber;
    }

    public boolean isKioskAvailable(Kiosk kiosk){
        return !isPaperEmpty(kiosk) && !kiosk.isPaperJam();
    }
}
