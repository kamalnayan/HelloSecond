<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
 

<logic:equal value="insert"  name="dform" property="method">
Record inserted with Id  <bean:write name="dform" property="id" /> and name <bean:write name="dform" property="name" /> 
</logic:equal>


<logic:equal value="delete"  name="dform" property="method">
Record deleted  with Id  <bean:write name="dform" property="id" />  
</logic:equal>

<logic:equal value="update"  name="dform" property="method">
Record updated of  Id  <bean:write name="dform" property="id" /> with name <bean:write name="dform" property="name" /> 
</logic:equal>

