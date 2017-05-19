package ActionClasses;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import insurance.Agents;
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

public class agentAction extends ActionSupport implements ServletRequestAware {

    private String aname;
    private String a_address;
    private Date abdate;
    private String agender;
    private Integer age;
    private Double commission;
    private String apassword;
    private File aphoto;
    private String aphotoFileName;
    private String aphotoContentType;
    HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        String path=request.getSession().getServletContext().getRealPath("/img");
          File f=new File(path, aphotoFileName);
          FileUtils.copyFile(aphoto, f);
          byte[] bs=new byte[(int)f.length()];
          FileInputStream fis=new FileInputStream(f);
          fis.read(bs);
          fis.close();
          Session s=HibernateUtil.getSessionFactory().openSession();
          Agents a=new Agents();
          a.setAname(aname);
          a.setAAddress(a_address);
          a.setAbdate(abdate);
          a.setAgender(agender);
          a.setAge(age);
          a.setAphoto(bs);
          a.setApassword(apassword);
          s.save(a);
          s.beginTransaction().commit();
          return SUCCESS;
    }
      
    
    
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getA_address() {
        return a_address;
    }

    public void setA_address(String a_address) {
        this.a_address = a_address;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    

    public Date getAbdate() {
        return abdate;
    }

    public void setAbdate(Date abdate) {
        this.abdate = abdate;
    }

    public String getAgender() {
        return agender;
    }

    public void setAgender(String agender) {
        this.agender = agender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public File getAphoto() {
        return aphoto;
    }

    public void setAphoto(File aphoto) {
        this.aphoto = aphoto;
    }

    public String getAphotoFileName() {
        return aphotoFileName;
    }

    public void setAphotoFileName(String aphotoFileName) {
        this.aphotoFileName = aphotoFileName;
    }

    public String getAphotoContentType() {
        return aphotoContentType;
    }

    public void setAphotoContentType(String aphotoContentType) {
        this.aphotoContentType = aphotoContentType;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request = hsr;
    }
    
     public String getImagea(){
        HttpServletResponse response=ServletActionContext.getResponse();
        response.setContentType("image/jpg");
        int id=Integer.parseInt(request.getParameter("id"));
         Session s=HibernateUtil.getSessionFactory().openSession();
         Agents s1=(Agents)s.get(Agents.class,id);
         try{
             OutputStream os=response.getOutputStream();
             os.write(s1.getAphoto());
         }catch(Exception e){}
         
        
        
        return SUCCESS;
    }
}
