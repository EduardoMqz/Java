package Abstraction;

public enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNexStage(FlightStages stage){
        //FlightStages[] allStages = values();
        //return allStages[(ordinal()+1)% allStages.length];
        FlightStages nextStage = stage.getNexStage(stage);
        System.out.println("Trasitioning from "+stage+" to "+nextStage);
        return nextStage;

    }
}
