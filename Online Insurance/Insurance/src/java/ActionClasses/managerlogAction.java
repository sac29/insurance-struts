/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ActionClasses;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

import insurance.HibernateUtil;
import insurance.Manager;
import org.hibernate.Session;

public class managerlogAction extends ActionSupport{
       private Integer mid;
       private String mpassword;

    @Override
    public String execute() throws Exception {
       Session s=HibernateUtil.getSessionFactory().openSession();
        Manager m=(Manager)s.get(Manager.class, mid);
        if(m!=null){
              if(m.getMpassword().equals(mpassword)){
                  return SUCCESS;
              }else{
                  return ERROR;
              }
    }else{
            return ERROR;
        }
    }

       
    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }
       
}
