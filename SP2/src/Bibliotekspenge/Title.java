package Bibliotekspenge;

public abstract class Title {

    // Fields
    String title;
    String literatureType;
    static final double RATE = 0.067574;

    // Constructor
    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    } // ends constructor

    // Methods
    public double calculateRoyalty() {
        double points = calculatePoints();
        double titleRoyalty = points * RATE;
        return titleRoyalty;
    }

    public abstract double calculatePoints();

    public double convertLiteratureType(String literatureType) {
        switch (literatureType) {
            case "BI":
                return 3.0;
            case "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                throw new IllegalArgumentException("Invalid input: " + literatureType);
        } // ends switch case

    } // ends convert method

} // ends class
