import java.sql.Time;
import java.util.Date;

public class Patient {
    private String patientName, patientEmail, patientPhone;
    private double patientZipCode;
    private Date patientDOB;
    private String vaccinePref;
    private Date apptDate;
    private Time apptTime;
    private String apptFullAddress;


    public Patient(String patientName, Date patientDOB, double patientZipCode, String patientEmail, String patientPhone) {
        this.patientName = patientName;
        this.patientDOB = patientDOB;
        this.patientZipCode = patientZipCode;
        this.patientEmail = patientEmail;
        this.patientPhone = patientPhone;
    }

    public void setupAppt(Date apptDate, Time apptTime, String apptFullAddress) {
        this.apptDate = apptDate;
        this.apptTime = apptTime;
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
