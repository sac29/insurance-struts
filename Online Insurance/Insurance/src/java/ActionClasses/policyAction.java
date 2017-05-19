package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import insurance.HibernateUtil;
import insurance.Policies;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

public class policyAction extends ActionSupport implements ServletRequestAware {

    private String pname;
    private Integer term;
    private Double sum_assured;
    private Float rate;
    private String installment;
    private Float commission;
    HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Policies p = new Policies();
        p.setPname(pname);
        p.setTerm(term);
        p.setRate(rate);
        p.setSumAssured(sum_assured);
        p.setInstallment(installment);
        p.setCommission(commission);
        s.save(p);
        s.beginTransaction().commit();
        return SUCCESS;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Double getSum_assured() {
        return sum_assured;
    }

    public void setSum_assured(Double sum_assured) {
        this.sum_assured = sum_assured;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getInstallment() {
        return installment;
    }

    public void setInstallment(String installment) {
        this.installment = installment;
    }

    public Float getCommission() {
        return commission;
    }

    public void setCommission(Float commission) {
        this.commission = commission;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }

}
