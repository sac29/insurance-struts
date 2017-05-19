/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 *
 * @author Sachin
 */
public class customer extends ActionSupport{
     private ArrayList<String> s=new ArrayList<String>();

    public ArrayList<String> getS() {
        return s;
    }

    public void setS(ArrayList<String> s) {
        this.s = s;
    }
     
     
    @Override
    public String execute() throws Exception {
        return super.execute();//To change body of generated methods, choose Tools | Templates.
    }
     public String getState(){
        s.add("Arunachal Pradesh");
        s.add("Assam");
        s.add("Andhra Pradesh");
        s.add("Bihar");
        s.add("Chattisgarh");
        s.add("");
        s.add("Goa");
        s.add("Gujrat");
        s.add("Haryana");
        s.add("Himachal Pradesh");
        s.add("Jammu and Kashmir");
        s.add("Jharkhand");
        s.add("Karnataka");
        s.add("Kerala");
        s.add("Madhya Pradesh");
        s.add("Maharastra");
        s.add("Manipur");
        s.add("Meghalaya");
        s.add("Mizoram");
        s.add("Nagaland");
        s.add("Punjab");
        s.add("Rajasthan");
        s.add("Sikkim");
        s.add("Tamil Nadu");
        s.add("Telangana");
        s.add("Tripura");
        s.add("Uttar Pradesh");
        s.add("Uttarakhand");
        s.add("West Bengal");
       return SUCCESS;
    }
}
