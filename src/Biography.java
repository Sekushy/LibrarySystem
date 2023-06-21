import java.util.ArrayList;

public class Biography {
    private String name;
    private String birthDate;
    private String placeOfBirth;
    private ArrayList<String> education;
    private boolean isAlive;

    public Biography(String name, String birthDate,
                     String placeOfBirth, ArrayList<String> education,
                     boolean isAlive) {
        this.name = name;
        this.birthDate = birthDate;
        this.placeOfBirth = placeOfBirth;
        this.education = education;
        this.isAlive = isAlive;
    }

    public Biography(String name, String birthDate, boolean isAlive) {
        this.name = name;
        this.birthDate = birthDate;
        this.isAlive = isAlive;
        this.placeOfBirth = "Unknown";
        this.education = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
