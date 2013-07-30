<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<html:form action="/data">

Id  <html:text property="id" />

	<br>
	<br>
Name <html:text property="name" />
	<br>
	<br>

Select Opearation
<br>
	<br>
<html:radio property="method" value="delete" />Delete
<br>

	<html:radio property="method" value="update" />Update
<br>

	<html:radio property="method" value="insert" />Insert
<html:errors />
	<br>
	
	<html:submit />

</html:form>