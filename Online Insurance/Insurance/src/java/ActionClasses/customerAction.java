
package ActionClasses;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import insurance.Agents;
import insurance.Customer;
import insurance.HibernateUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;

public class customerAction extends ActionSupport implements ServletRequestAware{
    private String cname;
    private String address;
    private String mob;
    private Date bdate;
    private String gender;
    private Integer pincode;
    private String password;
    private String city;
    private String state;
    private File photo;
    private String photoFileName;
    private String photoContentType;
    private File idproof;
    private String idproofFileName;
    private String idproofContentType;
    HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/img");
        File f = new File(path, photoFileName);
       // File f1 = new File(path, idproofFileName);
        FileUtils.copyFile(photo, f);
      //  FileUtils.copyFile(photo, f1);
        byte[] bs = new byte[(int) f.length()];
     //   byte[] bs1 = new byte[(int) f1.length()];
        FileInputStream fis = new FileInputStream(f);
     //   FileInputStream fis1 = new FileInputStream(f1);
     //   fis1.read(bs1);
        fis.read(bs);
     //   fis1.close();
        fis.close();
        Session s=HibernateUtil.getSessionFactory().openSession();
        Customer c=new Customer();
        c.setCname(cname);
        c.setAddress(address);
        c.setGender(gender);
        c.setMob(mob);
        c.setBdate(bdate);
        c.setPincode(pincode);
        c.setCity(city);
        c.setState(state);
        c.setPassword(password);
        c.setPhoto(bs);
      //  c.setIdproof(bs1);
        s.beginTransaction().commit();
        s.save(c);
        return SUCCESS;
    }

    
    
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    public File getIdproof() {
        return idproof;
    }

    public void setIdproof(File idproof) {
        this.idproof = idproof;
    }

    public String getIdproofFileName() {
        return idproofFileName;
    }

    public void setIdproofFileName(String idproofFileName) {
        this.idproofFileName = idproofFileName;
    }

    public String getIdproofContentType() {
        return idproofContentType;
    }

    public void setIdproofContentType(String idproofContentType) {
        this.idproofContentType = idproofContentType;
    }

    public void setServletRequest(HttpServletRequest hsr) {
    request=hsr;
    }
    public String getImage(){
        HttpServletResponse response=ServletActionContext.getResponse();
        response.setContentType("image/jpg");
        int id=Integer.parseInt(request.getParameter("id"));
         Session s=HibernateUtil.getSessionFactory().openSession();
         Customer s1=(Customer)s.get(Customer.class,id);
         try{
             OutputStream os=response.getOutputStream();
             os.write(s1.getPhoto());
         }catch(Exception e){}
         
        
        
        return SUCCESS;
    }
}
