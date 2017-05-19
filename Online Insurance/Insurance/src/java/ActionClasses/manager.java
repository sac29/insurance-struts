

package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

public class manager extends ActionSupport{
        private ArrayList<String> l=new ArrayList<String>();

    public ArrayList<String> getL() {
        return l;
    }

    public void setL(ArrayList<String> l) {
        this.l = l;
    }

    @Override
    public String execute() throws Exception {
        return super.execute(); //To change body of generated methods, choose Tools | Templates.
    }
    
        
  
    public String getLoc(){
        l.add("Lucknow");
        l.add("Delhi");
        l.add("Patna");
        l.add("Bhopal");
        l.add("Mumbai");
        l.add("Nagpur");
        l.add("Chandigarh");
        l.add("Dehradun");
        l.add("Jaipur");
       return SUCCESS;
    }
    
}
