<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

  <head>
  	<title>Start</title>
  </head>

  <body>
    <h2>Customer Registration</h2>
    
    <form:form commandName="calculation">
      <input type="hidden" name="_flowExecutionKey" 
             value="${flowExecutionKey}"/>
             
      <b>a: </b><form:input path="a"/><br/>
      <b>b: </b><form:input path="b"/><br/>
      <b>operation: <form:input path="operation" /></b>
      <input type="submit" name="_eventId_numbersEntered" 
             value="Submit" />
      <input type="submit" name="_eventId_cancel" 
             value="Cancel" />
    </form:form>
	</body>
</html>