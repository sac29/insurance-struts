<%@taglib prefix="s" uri="/struts-tags" %>
<s:head/>
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
               <h2><a href="#" title="First Post">Policies Registration</a></h2>
               </header>
                    <center>			   
               <content>
                   <h3></h3>
                   <br>
                 <s:form action="policyreg">
               <s:textfield name="pname" label="Plan Name"/>
               <s:textfield name="term" label="Plan Term"/>
               <s:textfield name="rate" label="Rate of Interest"/>
               <s:textfield name="sum_assured" label="Sum Assured"/>
               <s:textfield name="installment" label="Installment"/>
               <s:textfield name="commission" label="Commission"/>
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
                  The Policies Definition includes the Policy Interest Rates, Policy Bonus Rates, Policy Bonus Period , Policy Term.
              </p>
	  </article>
	  </aside>
	   <aside class="bottom-sidebar">
	  <article>
	      
              <p>
                  The Managers of the different branches recruits the Agents and also registration of customers
              </p>
	  </article>
	  </aside>
	 
</body>
</html>
