package lv.rvt;

public class CD implements Packable {
        private String artist;
        private String title;
        private int year;
        private double weight = 0.1;
    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;

    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.year + " )"  ;
    }
}

