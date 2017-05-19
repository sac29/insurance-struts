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
              <tr><th>Agent Code</th><th>Name</th><th>Address</th><th>DOB</th><th>Gender</th><th>Age</th><th>Password</th><th>Photo</th></tr>
              <s:iterator value="as">
                  <tr><td><s:property value="agentCode"/></td><td><s:property value="aname"/></td><td><s:property value="AAddress"/></td><td><s:property value="abdate"/></td><td><s:property value="agender"/></td><td><s:property value="age"/></td><td><s:property value="apassword"/></td>
            <td><img src="<s:url value="showImagea?id=%{agentCode}"/>" width="150" height="150"></td></tr>
              </s:iterator>
          </table>
       </content>
		</article>
		</div>
     </div>
	  
	   
</body>
</html>
