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
              <tr><th>Customer ID</th><th>Name</th><th>Address</th><th>Mobile</th><th>Dob</th><th>Gender</th><th>Pincode</th><th>City</th><th>State</th><th>Password</th><th>Image</th></tr>
              <s:iterator value="cs">
                  <tr><td><s:property value="cid"/></td><td><s:property value="cname"/></td><td><s:property value="address"/></td><td><s:property value="mob"/></td><td><s:property value="bdate"/></td><td><s:property value="gender"/></td><td><s:property value="pincode"/></td><td><s:property value="city"/></td><td><s:property value="state"/></td><td><s:property value="password"/></td>
            <td><img src="<s:url value="showImage?id=%{cid}"/>" width="140" height="150"></td></tr>
              </s:iterator>
          </table>
       </content>
		</article>
		</div>
     </div>
	  
	   
</body>
</html>
