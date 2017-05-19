

package ActionClasses;

import com.opensymphony.xwork2.ActionSupport;
import insurance.Customer;
import insurance.HibernateUtil;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

public class customerLogin extends ActionSupport implements ServletRequestAware{
       private Integer cid;
       private String password;
       HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        Session s=HibernateUtil.getSessionFactory().openSession();
        Customer c1=(Customer)s.get(Customer.class, cid);
        if(c1!=null){
              if(c1.getPassword().equals(password)){
                  return SUCCESS;
              }else{
                  return ERROR;
              }
    }else{
            return ERROR;
        }
    }
       
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }
       
}
