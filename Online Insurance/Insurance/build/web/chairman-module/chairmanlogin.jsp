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
					   <h2><a href="#" title="First Post">First</a></h2>
					   </header>
					   
               <content>
                   <h3>Chairman Login</h3>
                   <br><center>
                 <s:form action="chairmanhome">
               <s:textfield name="loginid" label="Login Id"/><br>
               <s:password name="cpassword" label="Password"/><br>
                 <s:submit value="Login"/><br>
                   </s:form>
                     </center>
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
