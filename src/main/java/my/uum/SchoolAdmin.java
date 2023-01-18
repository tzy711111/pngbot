package my.uum;

public class SchoolAdmin extends Users {
    private String schoolName;
    private String officeTelNo;
    private String buildingLoc;

    //换去Integer School ID
    public SchoolAdmin(String name, String ICNO, String email, String staffID, String telNo, String schoolName, String officeTelNo, String buildingLoc) {
        super(name, ICNO, email, staffID, telNo);
        this.schoolName = schoolName;
        this.officeTelNo = officeTelNo;
        this.buildingLoc = buildingLoc;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setOfficeTelNo(String officeTelNo){
        this.officeTelNo = officeTelNo;
    }

    public String getOfficeTelNo() {
        return officeTelNo;
    }

    public void setBuildingLoc(String buildingLoc){
        this.buildingLoc = buildingLoc;
    }

    public String getBuildingLoc() {
        return buildingLoc;
    }

}