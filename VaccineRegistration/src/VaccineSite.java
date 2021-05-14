import java.util.Scanner;

public class VaccineSite {
    private String siteName;
    private String siteAddress;
    private String siteCity;
    private String siteState;
    private int siteZipCode;
    private int modernaCount;
    private int jandjCount;
    private int pfizerCount;

    public VaccineSite(Scanner line) {
        siteName = line.next();
        siteAddress = line.next();
        siteCity = line.next();
        siteState = line.next();
        siteZipCode = line.nextInt();
        modernaCount = line.nextInt();
        pfizerCount = line.nextInt();
        //jandjCount = line.nextInt();
        /*This code will throw an error if text file with Site Info is formatted wrong, but we assume a file
        with any additional site info will be formatted correctly and input by programmers on the backend. */

    }

    public String getName() {
        return siteName;
    }

    public String getFullSiteAddress() {
        String fullSiteAddress = siteAddress + ", " + siteCity + ", " + siteState + " " + siteZipCode;
        return fullSiteAddress;
    }

    public int getSiteZipCode() {
        return siteZipCode;
    }

    public int getModernaQuantity() {
        return modernaCount;
    }

    public int getPfizerCount() {
        return pfizerCount;
    }

    public int getJandjCount() {
        return jandjCount;
    }

    //For all set methods: if negative number is entered, 0 will be stored
    public void setModernaQuantity(int newCount) {
        modernaCount = Math.max(newCount, 0);
    }

    public void setPfizerCount(int newCount) {
        pfizerCount = Math.max(newCount, 0);
    }

    public void setJandjCount(int newCount) {
        jandjCount = Math.max(newCount, 0);
    }
}
