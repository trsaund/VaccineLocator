import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VaccineSite {
    private String siteName;
    private String siteAddress;
    private String siteCity;
    private String siteState;
    private String siteZipCode;
    private int modernaCount;
    private int jandjCount;
    private int pfizerCount;

    public VaccineSite(Scanner line) {
        line.useDelimiter(" | ");
        siteName = line.next();
        siteAddress = line.next();
        siteCity = line.next();
        siteState = line.next();
        siteZipCode = line.next();
        modernaCount = line.nextInt();
        jandjCount = line.nextInt();
        pfizerCount = line.nextInt();
        /*This code will throw an error if text file with Site Info is formatted wrong, but we assume a file
        with any additional site info will be formatted correctly and input by programmers on the backend. */

    }




}
