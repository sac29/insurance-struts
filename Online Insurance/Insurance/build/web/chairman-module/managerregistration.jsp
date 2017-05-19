
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="d" uri="/struts-dojo-tags" %>
<s:head/>
<d:head/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<link rel="stylesheet" href="lic.css" type="text/css" />
</head>

<body class="body">
<div class="mainContent">
        <div class="content">
		<article class="topcontent">
		               <header>
               <h2><a href="#" title="First Post">Manager Registration</a></h2>
               </header>
                    <center>			   
               <content>
             
                   <br>
                 <s:form action="managerreg" method="POST" enctype="multipart/form-data">
               <s:textfield name="mgrssn" label="Manager Ssn"/>
               <s:textfield name="mname" label="Name"/>
               <s:radio list="{'Male','Female'}" name="mgender" label="Gender"/>
               <d:datetimepicker name="mbdate" label="Date of Birth"/>
               <s:textfield name="mage" label="Age"/>
               <s:textfield name="maddress" label="Address"/>
               <d:autocompleter name="location" list="l" label="Branch Location"/>
               <s:textfield name="mpassword" label="Password"/>
               <s:file name="mphoto" label="Select File"/>
                 <s:submit value="Submit"/><br>
                   </s:form>
                   
                     <br>
                     <br>
                       <br>      
                       <br>
                  <br>
               </content>
                    </center>
		</article>
		</div>
     </div>
	  <aside class="top-sidebar">
	  <article>
	   
		   <p>
                       <a >Please fill</a><br>
                       <a >all the fields</a>
		   </p>
	  </article>
	  </aside>
	   <aside class="middle-sidebar">
	  <article>
	    
              <p>
                 After registration give login id and password to respective branch manager.
              </p>
	  </article>
	  </aside>
	   <aside class="bottom-sidebar">
	  <article>
	      
              <p>
                  The Chairman is responsible for the Defines Policies and Schemes.
              </p>
	  </article>
	  </aside>
	 
</body>
</html>
