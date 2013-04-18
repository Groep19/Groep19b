/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectie;

import java.sql.Date;





/**
 *
 * @author Ruben Thonissen
 */
public class Festivals {
    private int fest_id, fest_duur;
    private String fest_naam, fest_locatie;
    private Date fest_datum;

    public Festivals() {
    
    }

    public Festivals(int fest_id,  String fest_naam, String fest_locatie, Date fest_datum, int fest_duur) {
        this.fest_id = fest_id;
        this.fest_naam = fest_naam;
         this.fest_locatie = fest_locatie;
          this.fest_datum = fest_datum;
        this.fest_duur = fest_duur;
        
       
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

   
    
    
}
