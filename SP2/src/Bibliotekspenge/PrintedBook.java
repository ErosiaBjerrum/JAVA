package Bibliotekspenge;

public class PrintedBook extends Title {

    // Fields
    int pages;
    int copies;

    // Constructor
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;

    } // ends constructor

    // Method
    @Override
    public double calculatePoints() {
        double typeFactor = convertLiteratureType(literatureType);
        double points = pages * typeFactor * copies;
        return points;
    } // ends method

} // ends main
