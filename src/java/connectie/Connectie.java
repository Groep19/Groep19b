/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectie;

/**
 *
 * @author Sven
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class Connectie
{


   private static final String URL = "jdbc:mysql://localhost/groep19_festivals";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "";

   private Connection connection = null; // manages connection
   private PreparedStatement ophalenGebruikers = null; 
   private PreparedStatement ophalenBands = null;
   private PreparedStatement ophalenAlleBands = null;
   
   
   // constructor
   public Connectie()
   {
      try 
      {
         connection = 
            DriverManager.getConnection( URL, USERNAME, PASSWORD );

         // create query that selects all entries in the AddressBook
         ophalenGebruikers = 
            connection.prepareStatement( "SELECT gebr_naam, gebr_paswoord from geregistreerdegebruikers where gebr_naam = ? and gebr_paswoord = ?" );
         
         ophalenBands = 
            connection.prepareStatement ("SELECT * from bands where band_naam = ?");
         ophalenAlleBands = 
                 connection.prepareStatement("SELECT * from bands ");
                      		 
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();
         System.exit( 1 );
      } // end catch
   } // end PersonQueries constructor
   
   // select all of the addresses in the database   
   public int ophalenGebruikers(String geb_naam, String geb_paswoord)
   {
      
      ResultSet resultSet = null;
       int count = 0;  
      try 
      {
         // executeQuery returns ResultSet containing matching entries
          ophalenGebruikers.setString(1, geb_naam);
          ophalenGebruikers.setString(2,geb_paswoord);
         resultSet = ophalenGebruikers.executeQuery(); 
           
         while ( resultSet.next() )
         {
            count ++;
               
         } // end while
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();         
      } // end catch
      finally
      {
         try 
         {
            resultSet.close();
         } // end try
         catch ( SQLException sqlException )
         {
            sqlException.printStackTrace();         
            close();
         } // end catch
      } // end finally
      
    return count;
   } 
   
   public List < Bands > ophalenBands(String band_naam) throws Exception{
       
       List< Bands > results = null;
       ResultSet resultSet = null;
        
      try 
      {
         // executeQuery returns ResultSet containing matching entries
          ophalenBands.setString(1, band_naam);
         resultSet = ophalenBands.executeQuery(); 
           
         results = new ArrayList< Bands >();
         
         while ( resultSet.next() )
         {
            results.add ( new Bands(
                    resultSet.getInt("band_id"),
                    resultSet.getString("band_naam"),
                    resultSet.getString("band_soortMuziek"),
                    resultSet.getString("band_url")));
               
         } // end while
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();         
         throw sqlException;
      } // end catch
      finally
      {
         try 
         {
            resultSet.close();
         } // end try
         catch ( SQLException sqlException )
         {
            sqlException.printStackTrace();         
            close();
            throw sqlException;
         } // end catch
      } // end finally
      
    return results;
   }
   public List < Bands > ophalenAlleBands() throws Exception{
       
       List< Bands > results = null;
       ResultSet resultSet = null;
        
      try 
      {
         // executeQuery returns ResultSet containing matching entries
        
         resultSet = ophalenAlleBands.executeQuery(); 
           
         results = new ArrayList< Bands >();
         
         while ( resultSet.next() )
         {
            results.add ( new Bands(
                    resultSet.getInt("band_id"),
                    resultSet.getString("band_naam"),
                    resultSet.getString("band_soortMuziek"),
                    resultSet.getString("band_url")));
               
         } // end while
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();         
         throw sqlException;
      } // end catch
      finally
      {
         try 
         {
            resultSet.close();
         } // end try
         catch ( SQLException sqlException )
         {
            sqlException.printStackTrace();         
            close();
            throw sqlException;
         } // end catch
      } // end finally
      
    return results;
   }
  
   // close the database connection
   public void close()
   {
      try 
      {
         connection.close();
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();
      } // end catch
   } // end method close
} // end class PersonQueries
