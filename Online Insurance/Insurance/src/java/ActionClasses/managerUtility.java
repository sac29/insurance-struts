package ActionClasses;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import insurance.HibernateUtil;
import insurance.Manager;
import java.util.List;
import org.hibernate.Session;

public class managerUtility extends ActionSupport {

    private List<Manager> m;

    public String getAllMangerData() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        m = s.createCriteria(Manager.class).list();
        return SUCCESS;
    }

    public List<Manager> getM() {
        return m;
    }

    public void setM(List<Manager> m) {
        this.m = m;
    }

}
