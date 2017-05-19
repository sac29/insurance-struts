
package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import insurance.HibernateUtil;
import insurance.PolicyRegistration;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;


/**
 *
 * @author Sachin
 */
public class policyregAction extends ActionSupport{
      private double planamount;
     private double installemnt;
      private int term;
     private Date regdate;
     private String nominee;
     private String installmentType;
      private Double sumassured;

    public Double getSumassured() {
        return sumassured;
    }

    public void setSumassured(Double sumassured) {
        this.sumassured = sumassured;
    }
    
        
    
    @Override
    public String execute() throws Exception {
      
        Session s=HibernateUtil.getSessionFactory().openSession();
        PolicyRegistration pr=new PolicyRegistration();
        pr.setNominee(nominee);
        pr.setInstallemnt(installemnt);
        pr.setPlanamount(planamount);
        pr.setRegdate(regdate);
        pr.setTerm(term);
        pr.setSumassured(sumassured);
        pr.setInstallmentType(installmentType);
        s.save(pr);
        s.beginTransaction().commit();
        return SUCCESS;
    }
        
     
     
    public double getPlanamount() {
        return planamount;
    }

    public void setPlanamount(double planamount) {
        this.planamount = planamount;
    }

    public double getInstallemnt() {
        return installemnt;
    }

    public void setInstallemnt(double installemnt) {
        this.installemnt = installemnt;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    public String getInstallmentType() {
        return installmentType;
    }

    public void setInstallmentType(String installmentType) {
        this.installmentType = installmentType;
    }

    
     
}
