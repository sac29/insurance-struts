

package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import insurance.Chairlogin;
import insurance.HibernateUtil;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

public class chaimanAction extends ActionSupport implements ServletRequestAware{
     private Integer loginid;
     private String cpassword;
       HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        Session s=HibernateUtil.getSessionFactory().openSession();
        Chairlogin l=(Chairlogin)s.get(Chairlogin.class, loginid);
        if(l!=null){
                if(l.getCpassword().equals(cpassword)){
                    return SUCCESS;
                }else{
                    return ERROR;
                }
        }else{
            return ERROR;
        }
    
    }
     
        
    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public void setServletRequest(HttpServletRequest hsr) {
           request=hsr;
    }
     
}
