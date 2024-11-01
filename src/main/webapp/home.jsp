<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
    function submitForm(button) {
    	if( button.name == "Display"){
    		var action = "DisplaySevlet";
    	}else{
        var action = button.name + ".jsp";
    	}// Construct the action URL based on button name
        document.forms[0].action = action; // Set the action of the form
        document.forms[0].submit(); // Submit the form
    }
</script>
<style>

    input{
        width: 150px;
        height: 50px;
        border-radius: 5px;
        cursor:pointer;
    }
</style>
<body>
    <form method="post">
    	<input type="button" value="add an account" name="Add" onClick="submitForm(this)">
        <input type="button" value="withdrawal" name="Withdrawal" onClick="submitForm(this)">
        <input type="button" value="deposit" name="Deposit" onClick="submitForm(this)"> 
        <input type="button" value="Balance" name="Balance" onClick="submitForm(this)">
    </form>
</body>
</html>