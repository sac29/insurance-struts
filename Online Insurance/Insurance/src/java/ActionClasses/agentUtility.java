
package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import insurance.Agents;
import insurance.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

public class agentUtility extends ActionSupport{
       private List<Agents> as;

       public String getAllAgentData(){
           Session s=HibernateUtil.getSessionFactory().openSession();
           as=s.createCriteria(Agents.class).list();
           return SUCCESS;
       }
       
    public List<Agents> getAs() {
        return as;
    }

    public void setAs(List<Agents> as) {
        this.as = as;
    }
       
       
       
}
