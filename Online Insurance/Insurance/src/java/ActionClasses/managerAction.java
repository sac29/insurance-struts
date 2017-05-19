package ActionClasses;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import insurance.Agents;
import insurance.HibernateUtil;
import insurance.Manager;
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

public class managerAction extends ActionSupport implements ServletRequestAware {

    private Integer mgrssn;
    private String mname;
    private String maddress;
    private String location;
    private String mgender;
    private Date mbdate;
    private Integer mage;
    private String mpassword;
    private File mphoto;
    private String mphotoFileName;
    private String mphotoContentType;
    HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        String path = request.getSession().getServletContext().getRealPath("/img");
        File f = new File(path, mphotoFileName);
        FileUtils.copyFile(mphoto, f);
        byte[] bs = new byte[(int) f.length()];
        FileInputStream fis = new FileInputStream(f);
        fis.read(bs);
        fis.close();
        Session s = HibernateUtil.getSessionFactory().openSession();
        Manager m = new Manager();
        m.setMgrssn(mgrssn);
        m.setMname(mname);
        m.setMaddress(maddress);
        m.setLocation(location);
        m.setMgender(mgender);
        m.setMbdate(mbdate);
        m.setMage(mage);
        m.setMpassword(mpassword);
        m.setMphoto(bs);
        s.save(m);
        s.beginTransaction().commit();
        request.setAttribute("user", "Your form has been successfully submitted...");
        return SUCCESS;
    }

    public Integer getMgrssn() {
        return mgrssn;
    }

    public void setMgrssn(Integer mgrssn) {
        this.mgrssn = mgrssn;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMgender() {
        return mgender;
    }

    public void setMgender(String mgender) {
        this.mgender = mgender;
    }

    public Date getMbdate() {
        return mbdate;
    }

    public void setMbdate(Date mbdate) {
        this.mbdate = mbdate;
    }

    public Integer getMage() {
        return mage;
    }

    public void setMage(Integer mage) {
        this.mage = mage;
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }

    public File getMphoto() {
        return mphoto;
    }

    public void setMphoto(File mphoto) {
        this.mphoto = mphoto;
    }

    public String getMphotoFileName() {
        return mphotoFileName;
    }

    public void setMphotoFileName(String mphotoFileName) {
        this.mphotoFileName = mphotoFileName;
    }

    public String getMphotoContentType() {
        return mphotoContentType;
    }

    public void setMphotoContentType(String mphotoContentType) {
        this.mphotoContentType = mphotoContentType;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }
   public String getImagem(){
        HttpServletResponse response=ServletActionContext.getResponse();
        response.setContentType("image/jpg");
        int id=Integer.parseInt(request.getParameter("id"));
         Session s=HibernateUtil.getSessionFactory().openSession();
         Manager sm=(Manager)s.get(Manager.class,id);
         try{
             OutputStream os=response.getOutputStream();
             os.write(sm.getMphoto());
         }catch(Exception e){}
         
            
        return SUCCESS;
    }
}
