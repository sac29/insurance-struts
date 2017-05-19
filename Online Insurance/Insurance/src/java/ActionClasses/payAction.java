
package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import insurance.HibernateUtil;
import insurance.PolicyRegistration;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

public class payAction extends ActionSupport implements ServletRequestAware{
           private Integer policyNo;
           private Double paidamount;
          HttpServletRequest request;

    @Override
    public String execute() throws Exception {
         Session s=HibernateUtil.getSessionFactory().openSession();
         PolicyRegistration p=(PolicyRegistration)s.get(PolicyRegistration.class, policyNo);
         p.setPaidamount(paidamount);
         s.update(p);
         s.beginTransaction().commit();
         return SUCCESS;
    }

    public Integer getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(Integer policyNo) {
        this.policyNo = policyNo;
    }
          
          
    

    public Double getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(Double paidamount) {
        this.paidamount = paidamount;
    }

    public void setServletRequest(HttpServletRequest hsr) {
      request=hsr; 
    }
           
}
