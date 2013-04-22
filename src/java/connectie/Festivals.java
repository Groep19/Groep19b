/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectie;

import java.sql.Date;
import java.sql.Time;





/**
 *
 * @author Ruben Thonissen
 */
public class Festivals {
    private int fest_id, fest_duur;
    private String fest_naam, fest_locatie;
    private Date fest_datum, datum;
    private String band_naam, pod_omschr, camp_adres;
    private Time uur;
    
    public Festivals() {
    
    }

    public Festivals(String fest_naam, Date datum, String band_naam, String pod_omschr, Time uur) {
        this.fest_naam = fest_naam;
        this.datum = datum;
        this.band_naam = band_naam;
        this.pod_omschr = pod_omschr;
        this.uur = uur;
       
    }

    
    
    public Festivals(int fest_id,  String fest_naam, String fest_locatie, Date fest_datum, int fest_duur) {
        this.fest_id = fest_id;
        this.fest_naam = fest_naam;
         this.fest_locatie = fest_locatie;
          this.fest_datum = fest_datum;
        this.fest_duur = fest_duur;
        
        
       
    }

    public Time getUur() {
        return uur;
    }

    public void setUur(Time uur) {
        this.uur = uur;
    }

    

    public int getFest_id() {
        return fest_id;
    }

    public void setFest_id(int fest_id) {
        this.fest_id = fest_id;
    }

    public int getFest_duur() {
        return fest_duur;
    }

    public void setFest_duur(int fest_duur) {
        this.fest_duur = fest_duur;
    }

    public String getFest_naam() {
        return fest_naam;
    }

    public void setFest_naam(String fest_naam) {
        this.fest_naam = fest_naam;
    }

    public String getFest_locatie() {
        return fest_locatie;
    }

    public void setFest_locatie(String fest_locatie) {
        this.fest_locatie = fest_locatie;
    }

    public Date getFest_datum() {
        return fest_datum;
    }

    public void setFest_datum(Date fest_datum) {
        this.fest_datum = fest_datum;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getBand_naam() {
        return band_naam;
    }

    public void setBand_naam(String band_naam) {
        this.band_naam = band_naam;
    }

    public String getPod_omschr() {
        return pod_omschr;
    }

    public void setPod_omschr(String pod_omschr) {
        this.pod_omschr = pod_omschr;
    }

    public String getCamp_adres() {
        return camp_adres;
    }

    public void setCamp_adres(String camp_adres) {
        this.camp_adres = camp_adres;
    }

   
    
    
}
