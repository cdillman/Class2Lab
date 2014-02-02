/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.text.*;
import java.util.*;

/**
 *
 * @author Corbin
 */
public class WelcomeService {
    private Calendar current = Calendar.getInstance();
    private Date date = current.getTime();
    private String mor = "2/1/14 12:00 AM";
    private String aft = "2/1/14 11:00 AM";
    private String eve = "2/1/14 5:00 PM";
    private Date after;
    private Date morn;
    private Date even;
    private String format = "M/d/yy hh:mm a";
    private SimpleDateFormat sdf = new SimpleDateFormat(format);
    private String dayMsg;
    private String name;
    private String morning;
    private String afternoon;
    private String evning;
    
    
    public String TimeOfDay() throws ParseException{
        sdf.format(date);
        Date morn = sdf.parse(mor);
        Date after = sdf.parse(aft);
        Date even = sdf.parse(eve);
        
        if(date.after(morn) && date.before(after) ){
            System.out.println("Morning");
        }
        else if(date.after(after) && date.before(even)){
            System.out.println("Afternoon");
        }
        else if(date.after(even) && date.before(morn)){
            System.out.println("Night");
        }
        else{
            System.out.println("Fail");
        }
            return dayMsg;
    }
    
   
    public static void main(String[] args) {
        WelcomeService wel = new WelcomeService();
        
        try{
        wel.TimeOfDay();
        }
        catch(ParseException pe){
            System.out.println("P.E.");
        }
    }
}
