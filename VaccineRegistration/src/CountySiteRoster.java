import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CountySiteRoster {
    ArrayList<VaccineSite> vaccineSites; //array list because we do not know how many products there will be
    ArrayList<Patient> patients;

    public CountySiteRoster(String fileName) throws FileNotFoundException {
        vaccineSites = new ArrayList<VaccineSite>();
        patients = new ArrayList<Patient>();
        Scanner input = new Scanner(new File(fileName));
        loadSite(input);
    }

    private void loadSite(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals(""))
            {
                break; //moves execution down to next while loop (or whatever next chunk of code is)
            }
            Scanner scannerLine = new Scanner(line);
            VaccineSite site = new VaccineSite(scannerLine);
            vaccineSites.add(site);
        }
    }

    public ArrayList getByZipCode(double zipCode) throws FileNotFoundException {
        ArrayList nearbySites = new ArrayList<VaccineSite>();
        for (int i = 0; i < vaccineSites.size(); i++) {
            VaccineSite site = vaccineSites.get(i);
            if (site.getSiteZipCode() == zipCode) {
                nearbySites.add(site);
            }
        }
        /*if (siteZipCode.equals(ZipCode) {
            nearbySites.add(site);
        } */
        return nearbySites;
    }

}
