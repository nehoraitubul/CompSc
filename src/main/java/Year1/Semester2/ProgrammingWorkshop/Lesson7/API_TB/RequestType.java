package Year1.Semester2.ProgrammingWorkshop.Lesson7.API_TB;

public enum RequestType {
    SEND_MESSAGE("send-message"),
    CHECK_BALANCE("check-balance"),
    CLEAR_HISTORY("clear-history");

    private final String label;

    RequestType(String label){
        this.label = label;
    }

    public String getType(){
        return this.label;
    }
}
