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
					   <h2><a href="#" title="First Post">Agents Details</a></h2>
					   </header>
					   
       <content>
          <table cellpadding="1" border="2">
              <tr><th>Manager ID</th><th>Manager SSN</th><th>Name</th><th>Age</th><th>Gender</th><th>Dob</th><th>Address</th><th>Location</th><th>Password</th><th>Image</th></tr>
              <s:iterator value="m">
                  <tr><td><s:property value="mid"/></td><td><s:property value="mgrssn"/></td><td><s:property value="mname"/></td><td><s:property value="mage"/></td><td><s:property value="mgender"/></td><td><s:property value="mbdate"/></td><td><s:property value="maddress"/></td><td><s:property value="location"/></td><td><s:property value="mpassword"/></td>
                      <td><img src="<s:url value="showImagem?id=%{mid}"/>" width="150" height="150"></td></tr>
              </s:iterator>
          </table>
       </content>
		</article>
		</div>
     </div>
	  
	   
</body>
</html>
