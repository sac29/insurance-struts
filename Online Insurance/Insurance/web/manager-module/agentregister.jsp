<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib  prefix="d" uri="/struts-dojo-tags" %>
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
					   <h2><a href="#" title="First Post">Register an agent</a></h2>
					   </header>
					   
       <content>
           <br>
            <br>
                <center>
           <s:form action="agentregister" method="POST" enctype="multipart/form-data">
               <s:textfield name="aname" label="Name"/>
               <s:textfield name="a_address" label="Address"/>
               <d:datetimepicker name="abdate" label="Date of Birth"/>
               <s:radio list="{'Male','Female'}" name="agender" label="Gender"/>
               <s:textfield name="age" label="Age"/>
               <s:file name="aphoto" label="Select Photo"/>
               <s:password name="apassword" label="Password"/>
               <s:submit value="Submit"/>
           </s:form>
                </center>
                <br>
                    <br>
                        <br>
            <br>
               <br>
                   <br>
                       <br>
            
                   <br>
           
       </content>
		</article>
		</div>
     </div>
	  <aside class="top-sidebar">
	  <article>
	   
              <p> <a >Please fill</a><br>
                       <a >all the fields</a></p>
	  </article>
	  </aside>
	   <aside class="middle-sidebar">
	  <article>
	    
              <p>
                  The Policies Definition includes the Policy Interest Rates, Policy Bonus Rates, Policy Bonus Period , Policy Term.
             </p>
	  </article>
	  </aside>
	   <aside class="bottom-sidebar">
	  <article>
	      
		   <p>The Managers of the different branches recruits the Agents and also registration of customers
            </p>
	  </article>
	  </aside>
	 
</body>
</html>
