/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rasmus
 */
public class CD implements ToBeStored {

    private double weight;
    private String artist;
    private String title;
    private int publishingYear;

    public CD(String artist, String title, int publishingYear) {
        this.weight = 0.1;

        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
      

    }

    public double weight() {
        weight = 0.1;
        return weight;
    }

    public String toString() {
        return artist + ": " + title + " (" +publishingYear + ")";

    }

}
