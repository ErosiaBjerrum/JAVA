package Bibliotekspenge;

public class AudioBook extends Title {

    // Fields
    int durationInMinutes;
    int copies;

    // Constructor
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;

    } // ends constructor

    // Method
    @Override
    public double calculatePoints() {
        double typeFactor = convertLiteratureType(literatureType);
        double points = (durationInMinutes * 0.5) * typeFactor * copies;
        return points;
    } // ends method

} // ends class
