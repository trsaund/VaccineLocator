import java.sql.Time;
import java.util.Date;

public class Patient {
    private String patientFirstName, patientLastName, patientEmail, patientPhone, patientVaccPref = "No Preference",
            apptFullAddress;
    private String patientZipCode;


    public Patient(String patientFirstName, String patientLastName, String patientZipCode, String patientEmail, String patientPhone) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.patientZipCode = patientZipCode;
        this.patientEmail = patientEmail;
        this.patientPhone = patientPhone;
    }

    public void setupAppt(String apptFullAddress) {
        this.apptFullAddress = apptFullAddress;
    }

    public void setVaccinePref(String vaccinePref) {
        this.patientVaccPref = vaccinePref;
        if (!vaccinePref.equalsIgnoreCase("moderna") & !vaccinePref.equalsIgnoreCase("pfizer")
                & !vaccinePref.equalsIgnoreCase("johnson & johnson")) {
            vaccinePref = null;
        }
    }
}
