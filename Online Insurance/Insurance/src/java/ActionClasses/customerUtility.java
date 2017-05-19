
package ActionClasses;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import insurance.Customer;
import insurance.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

public class customerUtility extends ActionSupport{
      private List<Customer> cs;
    
      public String getAllCustomerData(){
           Session s=HibernateUtil.getSessionFactory().openSession();
           cs=s.createCriteria(Customer.class).list();
           return SUCCESS;
       }
      
    public List<Customer> getCs() {
        return cs;
    }

    public void setCs(List<Customer> cs) {
        this.cs = cs;
    }
      
      
}
