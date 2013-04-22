/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectie;

/**
 *
 * @author Ruben Thonissen
 */


public class Bands {
    private int band_id;
    private String band_naam;
    private String band_soortMuziek;
    private String band_url;

    public Bands() {
    }

    public Bands(int band_id, String band_naam, String band_soortMuziek, String band_url) {
        this.band_id = band_id;
        this.band_naam = band_naam;
        this.band_soortMuziek = band_soortMuziek;
        this.band_url = band_url;
    }

    public int getBand_id() {
        return band_id;
    }

    public void setBand_id(int band_id) {
        this.band_id = band_id;
    }

    public String getBand_naam() {
        return band_naam;
    }

    public void setBand_naam(String band_naam) {
        this.band_naam = band_naam;
    }

    public String getBand_soortMuziek() {
        return band_soortMuziek;
    }

    public void setBand_soortMuziek(String band_soortMuziek) {
        this.band_soortMuziek = band_soortMuziek;
    }

    public String getBand_url() {
        return band_url;
    }

    public void setBand_url(String band_url) {
        this.band_url = band_url;
    }
    
    
}
