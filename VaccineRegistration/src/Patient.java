import java.sql.Time;
import java.util.Date;

public class Patient {
    private String patientFirstName, patientLastName, patientEmail, patientPhone;
    private double patientZipCode;
    private String vaccinePref;
    private String apptFullAddress;
    private int patientId = 1;


    public Patient(String patientFirstName, String patientLastName, double patientZipCode, String patientEmail, String patientPhone) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientZipCode = patientZipCode;
        this.patientEmail = patientEmail;
        this.patientPhone = patientPhone;
        patientId = patientId;
        patientId += 1;
    }

    public void setupAppt(String apptFullAddress) {
        this.apptFullAddress = apptFullAddress;
    }

    public void setVaccinePref(String vaccinePref) {
        this.vaccinePref = vaccinePref;
        if (!vaccinePref.equalsIgnoreCase("moderna") & !vaccinePref.equalsIgnoreCase("pfizer")
                & !vaccinePref.equalsIgnoreCase("johnson & johnson")) {
            vaccinePref = null;
        }
    }
}
