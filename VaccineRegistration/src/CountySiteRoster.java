import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountySiteRoster {
    ArrayList<VaccineSite> vaccineSites; //array list because we do not know how many products there will be

    public CountySiteRoster(String fileName) throws FileNotFoundException {
        vaccineSites = new ArrayList<VaccineSite>();

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

    public ArrayList getByZipCode(double ZipCode) throws FileNotFoundException {
        ArrayList nearbySites = new ArrayList<VaccineSite>();
        /*if (siteZipCode.equals(ZipCode) {
            nearbySites.add(site);
        } */
        return nearbySites;
    }
}
