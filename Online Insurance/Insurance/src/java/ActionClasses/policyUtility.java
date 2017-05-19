package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import insurance.HibernateUtil;
import insurance.PolicyRegistration;
import java.util.List;
import org.hibernate.Session;

public class policyUtility extends ActionSupport {

    private List<PolicyRegistration> pr;
       
    public String getAllPolicyData(){
        Session s=HibernateUtil.getSessionFactory().openSession();
        pr=s.createCriteria(PolicyRegistration.class).list();
        return SUCCESS;
    }
    
    public List<PolicyRegistration> getPr() {
        return pr;
    }

    public void setPr(List<PolicyRegistration> pr) {
        this.pr = pr;
    }

}
