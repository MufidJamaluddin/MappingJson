/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polban.jtk.mufid.Console;

import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import com.fasterxml.jackson.databind.ObjectMapper;
import id.ac.polban.jtk.mufid.GmapsModel.Gmaps;
/**
 *
 * @author mufidjamaluddin
 */
public class JsonMappingApp 
{
    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        /**
         * Buat membaca file gmapsdirections.json di folder src
         */
        BufferedReader br;
        /**
         * Penampung class
         */
        Gmaps gmaps = null;
        /**
         * Penampung Parsing String
         */
        StringBuilder jsonSb;
        jsonSb = new StringBuilder();
        /**
         * Proses membaca file
         */
        try 
        {
            br = new BufferedReader(new FileReader("C:\\Users\\mufidjamaluddin\\Documents\\NetBeansProjects\\TugasJson\\src\\gmapsdirections.json"));
            String line;
            while((line = br.readLine())!= null) // membaca dan assignment per line
            {
                System.out.println(line);
                jsonSb.append(line); // menambahkan ke stringbuilder
            }
        } 
        catch (FileNotFoundException ex)
        {
        
        }
        catch (IOException ex) 
        {
       
        }
        /**
         * Sejak Java 7, BufferedReader udah otomatis close
         */
  
        /**
         * Pemetaan JSON ke Java Object
         */
        ObjectMapper mapper = new ObjectMapper();
        /**
         * Menghindari error karena desrialization
         */
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try
        {
            /**
             * Pemetaan
             */
            gmaps = mapper.readValue(jsonSb.toString(), Gmaps.class);
            /**
             * 
             */
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
        if(gmaps != null)
        {
            System.out.println("Demo JSON Mapping to Object \n");
            
            System.out.println("Geocoder 1 Status \t: " + gmaps.getGeocoded_waypoints().get(0).getGeocoder_status());
            System.out.println("Geocoder 1 Place ID \t: " + gmaps.getGeocoded_waypoints().get(0).getPlace_id());
            System.out.println("Geocoder 1 Type 1 \t: " + gmaps.getGeocoded_waypoints().get(0).getTypes().get(0));
            System.out.println("Geocoder 1 Type 2 \t: " + gmaps.getGeocoded_waypoints().get(0).getTypes().get(1));
            
            System.out.println("Geocoder 2 Status \t: " + gmaps.getGeocoded_waypoints().get(1).getGeocoder_status());
            System.out.println("Geocoder 2 Place ID \t: " + gmaps.getGeocoded_waypoints().get(1).getPlace_id());
            System.out.println("Geocoder 2 Type 1 \t: " + gmaps.getGeocoded_waypoints().get(1).getTypes().get(0));
            System.out.println("Geocoder 2 Type 2 \t: " + gmaps.getGeocoded_waypoints().get(1).getTypes().get(1));
            
            System.out.println("Bounds Northeast Lat\t\t:" + gmaps.getRoutes().get(0).getBounds().getNortheast().getLat());
            System.out.println("Bounds Northeast Lat\t\t:" + gmaps.getRoutes().get(0).getBounds().getNortheast().getLng());
            System.out.println("Bounds Southwest Lat\t\t:" + gmaps.getRoutes().get(0).getBounds().getSouthwest().getLat());
            System.out.println("Bounds Southwest Lat\t\t:" + gmaps.getRoutes().get(0).getBounds().getSouthwest().getLng());
            
            System.out.println("\nCopyright \t\t:" + gmaps.getRoutes().get(0).getCopyrights());
            System.out.println("Alamat Awal \t\t:" + gmaps.getRoutes().get(0).getLegs().get(0).getStart_address());
            System.out.println("Alamat Tujuan \t\t:" + gmaps.getRoutes().get(0).getLegs().get(0).getEnd_address());
            
            
            int i = 0;
            boolean isNull;
            
            do
            {
                // POINT PERTAMA
                System.out.println("\nAlamat Point ke-" + (i+1) + "\t:" + gmaps.getRoutes().get(0).getLegs().get(0).getSteps().get(i).getStart_location().getLat() + " , " + gmaps.getRoutes().get(0).getLegs().get(0).getSteps().get(0).getStart_location().getLng());
                System.out.println("Tujuan Point ke-" + (i+1) +"\t:" + gmaps.getRoutes().get(0).getLegs().get(0).getSteps().get(i).getStart_location().getLat() + " , " + gmaps.getRoutes().get(0).getLegs().get(0).getSteps().get(0).getStart_location().getLng());
                System.out.println("Jarak Point ke-" + (i+1) +"\t:" + gmaps.getRoutes().get(0).getLegs().get(0).getSteps().get(i).getDistance().getText());
                System.out.println("Waktu Point ke-" + (i+1) +"\t:" + gmaps.getRoutes().get(0).getLegs().get(0).getSteps().get(i).getDuration().getText());
                System.out.println("Mode Kendaraan ke-" + (i+1) +"\t:" + gmaps.getRoutes().get(0).getLegs().get(0).getSteps().get(i).getTravel_mode());
                // INCREMENT
                i++;
            }
            while(gmaps.getRoutes().get(0).getLegs().get(0).getSteps().size() > i);// loop sebanyak ukuran list, keluar loop jika melebihi ukuran list
            
            System.out.println("\nOverview Polylines \t:" + gmaps.getRoutes().get(0).getOverview_polyline().getPoints());
            System.out.println("Summary \t\t:" + gmaps.getRoutes().get(0).getSummary());
            System.out.println("Status \t\t: " + gmaps.getStatus());
        }

    }
}
