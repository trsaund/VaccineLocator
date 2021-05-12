import java.util.Date;

public class Patient {
    private String patientName, patientZipCode, patientEmail, patientPhone;
    private Date patientDOB;

    public Patient(String patientName, Date patientDOB, String patientZipCode, String patientEmail, String patientPhone) {
        this.patientName = patientName;
        this.patientDOB = patientDOB;
        this.patientZipCode = patientZipCode;
        this.patientEmail = patientEmail;
        this.patientPhone = patientPhone;
    }
}
