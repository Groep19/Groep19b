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

public class Festivals
{


   private static final String URL = "jdbc:mysql://localhost/groep19_festivals";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "";

   private Connection connection = null; // manages connection
   private PreparedStatement ophalenGebruikers = null; 
   
   // constructor
   public Festivals()
   {
      try 
      {
         connection = 
            DriverManager.getConnection( URL, USERNAME, PASSWORD );

         // create query that selects all entries in the AddressBook
         ophalenGebruikers = 
            connection.prepareStatement( "SELECT gebr_naam, gebr_paswoord from geregistreerdegebruikers where gebr_naam = ? and gebr_paswoord = ?" );
                      		 
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
