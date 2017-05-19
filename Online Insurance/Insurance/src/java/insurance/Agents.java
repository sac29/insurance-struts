package insurance;
// Generated Jul 18, 2015 12:33:04 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Agents generated by hbm2java
 */
public class Agents  implements java.io.Serializable {


     private Integer agentCode;
     private String aname;
     private String AAddress;
     private Date abdate;
     private String agender;
     private int age;
     private Double commission;
     private byte[] aphoto;
     private String apassword;
     private Set policyRegistrations = new HashSet(0);

    public Agents() {
    }

	
    public Agents(String aname, String AAddress, Date abdate, String agender, int age, String apassword) {
        this.aname = aname;
        this.AAddress = AAddress;
        this.abdate = abdate;
        this.agender = agender;
        this.age = age;
        this.apassword = apassword;
    }
    public Agents(String aname, String AAddress, Date abdate, String agender, int age, Double commission, byte[] aphoto, String apassword, Set policyRegistrations) {
       this.aname = aname;
       this.AAddress = AAddress;
       this.abdate = abdate;
       this.agender = agender;
       this.age = age;
       this.commission = commission;
       this.aphoto = aphoto;
       this.apassword = apassword;
       this.policyRegistrations = policyRegistrations;
    }
   
    public Integer getAgentCode() {
        return this.agentCode;
    }
    
    public void setAgentCode(Integer agentCode) {
        this.agentCode = agentCode;
    }
    public String getAname() {
        return this.aname;
    }
    
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getAAddress() {
        return this.AAddress;
    }
    
    public void setAAddress(String AAddress) {
        this.AAddress = AAddress;
    }
    public Date getAbdate() {
        return this.abdate;
    }
    
    public void setAbdate(Date abdate) {
        this.abdate = abdate;
    }
    public String getAgender() {
        return this.agender;
    }
    
    public void setAgender(String agender) {
        this.agender = agender;
    }
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public Double getCommission() {
        return this.commission;
    }
    
    public void setCommission(Double commission) {
        this.commission = commission;
    }
    public byte[] getAphoto() {
        return this.aphoto;
    }
    
    public void setAphoto(byte[] aphoto) {
        this.aphoto = aphoto;
    }
    public String getApassword() {
        return this.apassword;
    }
    
    public void setApassword(String apassword) {
        this.apassword = apassword;
    }
    public Set getPolicyRegistrations() {
        return this.policyRegistrations;
    }
    
    public void setPolicyRegistrations(Set policyRegistrations) {
        this.policyRegistrations = policyRegistrations;
    }




}


