package insurance;
// Generated Jul 18, 2015 12:33:04 AM by Hibernate Tools 3.6.0



/**
 * Chairlogin generated by hbm2java
 */
public class Chairlogin  implements java.io.Serializable {


     private Integer loginid;
     private String cpassword;

    public Chairlogin() {
    }

    public Chairlogin(String cpassword) {
       this.cpassword = cpassword;
    }
   
    public Integer getLoginid() {
        return this.loginid;
    }
    
    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }
    public String getCpassword() {
        return this.cpassword;
    }
    
    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }




}


