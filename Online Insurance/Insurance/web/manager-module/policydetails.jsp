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
					   <h2><a href="#" title="First Post">Policy Details</a></h2>
					   </header>
					   
       <content>
           <table cellpadding="1" border="2">
               <tr><th>Policy No</th><th>Plan Amount</th><th>Installment</th><th>Installment Type</th><th>Paid Amount</th><th>Sum Assured</th><th>Term</th><th>Registration Date</th><th>Nominee</th></tr>
               <s:iterator value="pr">
                   <tr><td><s:property value="policyNo"/></td><td><s:property value="planamount"/></td><td><s:property value="installment"/></td><td><s:property value="installmentType"/></td><td><s:property value="paidamount"/></td><td><s:property value="sumassured"/></td><td><s:property value="term"/></td><td><s:property value="regdate"/></td><td><s:property value="nominee"/></td></tr>
               </s:iterator>
           </table>
       </content>
		</article>
		</div>
     </div>
	  
	  
</body>
</html>
