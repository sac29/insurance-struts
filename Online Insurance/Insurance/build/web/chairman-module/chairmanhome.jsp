<%@taglib prefix="s" uri="/struts-tags" %>
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
					   <h2><a href="#" title="First Post">Welcome to Chairman Module</a></h2>
					   </header>
					   
       <content>
      Chairman

The Chairman is the Super User of the System. The Chairman is responsible for the defining the Policies, Policies Terms and conditions, Policies Amounts, Face Amounts, Establishing the different branches, Registration of the Branch Managers.

The Policies Definition includes the Policy Interest Rates, Policy Bonus Rates, Policy Bonus Period , Policy Term.The Chairman also defines  the Policy Commission Rates  for the Agents who involves in the  Customer Policy Registration Process.

The Chairman is responsible for the Defines Policies and Schemes,Branch Establishments,Recruits Branch Managers,Defines the Policy Terms and Conditions,Defines the Policy Specifications

Reports:

?   Policy Details

?  Branch Manager details

?  Agents Details

? Customer details
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
	   
              <p><s:a action="policydetails">Define Policies</s:a></p><br>
			         
              <p><s:a action="managerdetails">Manager Registration</s:a><br></p>
	  </article>
	  </aside>
	   <aside class="middle-sidebar">
	  <article>
	    
              <p><s:a action="viewpolicy">Show registered policies</s:a><br>
			         
              <p> <s:a action="viewmanagers">Manager Details</s:a><br></p>
	  </article>
	  </aside>
	   <aside class="bottom-sidebar">
	  <article>
	      
		   <p>
                   <s:a action="viewcustomers">Customer Details</s:a><br>        
			  <s:a action="viewagents">Agents Details</s:a></p>
	  </article>
	  </aside>
	 
</body>
</html>
