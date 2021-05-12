import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VaccineSite {
    private String siteName;
    private String siteAddress;
    private String siteZipCode;
    private String siteCity;
    private String siteState;

    public VaccineSite(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        loadSite(input);
    }

    private void loadSite(Scanner input) {

    }

    public ArrayList getByZipCode(double ZipCode) throws FileNotFoundException {
        ArrayList nearbySites = new ArrayList<VaccineSite>();
        return nearbySites;
    }


}
