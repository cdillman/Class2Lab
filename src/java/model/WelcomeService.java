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
    private Calendar current2 = Calendar.getInstance();
    private Date date = current.getTime();
    private String mor = "2/3/2014 00:00 AM";
    private String aft = "2/3/2014 11:00 AM";
    private String eve = "2/3/2014 5:00 PM";
    private Date after;
    private Date morn;
    private Date even;
    private String format = "MM/dd/yyyy hh:mm a";
    private SimpleDateFormat sdf = new SimpleDateFormat(format);
    private String dayMsg;
    private String welMsg = "Good ";
    private String name;
    private String morMsg;
    private String aftMsg;
    private String eveMsg;
    
    public String Run(){
        WelcomeService wel = new WelcomeService();
        wel.TimeOfDay();
        return wel.GreetingMessage();
    }
    
    public String TimeOfDay(){
       try{
        sdf.format(date);
        Date morn = sdf.parse(mor);
        Date after = sdf.parse(aft);
        Date even = sdf.parse(eve);
       }
       catch(ParseException pe){
           
       }
        if(date.after(morn) && date.before(after)){
//            System.out.println("Morning");
            dayMsg = "morning";
        }
        else if(date.after(after) && date.before(even)){
//            System.out.println("Afternoon");
            dayMsg = "afternoon";
        }
        else if(date.after(even) && date.before(morn)){
//            System.out.println("Night");
            dayMsg = "evening";
        }
        else{
//            System.out.println("Fail");
        }
            return dayMsg;
    }
    
    public String GreetingMessage(){
        name = "Mike";
        
        welMsg += dayMsg + " " + name + ", Welcome";
        return welMsg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
    public static void main(String[] args) {
        WelcomeService wel = new WelcomeService();
        
       
        wel.TimeOfDay();
        System.out.println(wel.GreetingMessage());
        
    }
}
