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
					   <h2><a href="#" title="First">Pay your premium</a></h2>
					   </header>
					   
       <content>
           <center>
               <s:form action="paypremium">
               <table width="470" border="0" cellpadding="0" cellspacing="0" bgcolor="#00FFFF">
  <!--DWLayoutTable-->
  <tr>
    <td width="155" height="86">&nbsp;</td>
    <td width="179">&nbsp;</td>
    <td width="104">&nbsp;</td>
    <td width="161">&nbsp;</td>
  </tr>
  <tr>
    <td height="31">&nbsp;</td>
    <td colspan="2" valign="top"><table width="450" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
          <td width="283" height="31" valign="top"><s:textfield name="policyNo" label="Policy No"/> </td>
          <td width="283" height="31" valign="top"><s:textfield name="paidamount" label="Pay Premium"/> </td>
        </tr>
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="18"></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="27"></td>
    <td></td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="104" height="27" valign="top"><label>
                <s:submit value="Pay"/>
        </label></td>
      </tr>
    </table>
    </td>
    <td></td>
  </tr>
  <tr>
    <td height="115"></td>
    <td></td>
    <td></td>
  </tr>
</table>
           </center>
               </s:form>
       </content>
		</article>
		</div>
     </div>
	 
	   
	 
</body>
</html>
