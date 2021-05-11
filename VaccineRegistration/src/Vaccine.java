public class Vaccine {

    public String vaccineName;
    private int numberOfDoses;
    private int vaccineQuantity;

    public String getName() {
        return vaccineName;
    }

    public int getNumberOfDoses() {
        return numberOfDoses;
    }

    public int getQuantity() {
        return vaccineQuantity;
    }

    public void setQuantity(int newQuantity) {
        vaccineQuantity = Math.max(newQuantity, 0); //if negative number is entered, 0 will be stored.

    }

}