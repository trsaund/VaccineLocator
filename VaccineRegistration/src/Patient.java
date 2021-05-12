import java.util.Date;

public class Patient {
    private String patientName, patientEmail, patientPhone;
    private double patientZipCode;
    private Date patientDOB;

    public Patient(String patientName, Date patientDOB, double patientZipCode, String patientEmail, String patientPhone) {
        this.patientName = patientName;
        this.patientDOB = patientDOB;
        this.patientZipCode = patientZipCode;
        this.patientEmail = patientEmail;
        this.patientPhone = patientPhone;
    }
}
