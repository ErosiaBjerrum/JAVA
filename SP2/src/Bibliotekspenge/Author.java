package Bibliotekspenge;

import java.util.ArrayList;

public class Author {
    // Fields
    private String name;
    private ArrayList<Title> titles;

    // Constructor
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    } // ends constructor

    // Methods
    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public double calculateRoyalties() {
        double royalties = 0.0;

        for (Title t : titles) {
            royalties += t.calculateRoyalty();
        } // ends for-loop
        return royalties;
        } // ends calculate loop

    public String getName() {
        return name;
    } // ends getter

} // ends main class