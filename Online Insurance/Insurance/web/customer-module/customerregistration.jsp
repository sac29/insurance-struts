<%@taglib prefix="d" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
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
					   <h2><a href="#" title="First Post">Customer Registration</a></h2>
					   </header>
					   
                    <content><center>
                            <br>
           <s:form action="customerreg" method="POST" enctype="multipart/form-data">
           <s:textfield name="cname" label="Name"/>
           <s:radio list="{'Male','Female'}" name="gender" label="Gender"/>
             <d:datetimepicker name="bdate" label="Date of Birth"/>
           <s:textfield name="mob" label="Mobile"/>
           <s:textfield name="address" label="Address"/>
           <s:textfield name="pincode" label="Pincode"/>
           <s:textfield name="city" label="City"/>
          <d:autocompleter name="state" list="s" label="State"/>
            <s:password name="password" label="Password"/>
            <s:file name="photo" label="Select Photo"/>
             <s:file name="idproof" label="Select ID Photo"/>
                <s:submit value="Submit"/><br>
            </s:form>
                    
                    <br>
                     <br>
                       <br>      
                       <br>
                  <br>
                    </center>
       </content>
		</article>
		</div>
     </div>
	  <aside class="top-sidebar">
	  <article>
	   
              <p><a >Please fill</a><br>
                       <a >all the fields</a></p>
	  </article>
	  </aside>
	   <aside class="middle-sidebar">
	  <article>
	    
              <p>The Policies Definition includes the Policy Interest Rates, Policy Bonus Rates, Policy Bonus Period , Policy Term.
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
