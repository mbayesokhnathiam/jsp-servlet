<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="style.jsp" %>
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		<h3>Ajout un employé</h3>
			<form method="post" action="<%=request.getContextPath()%>/add-employe">
  <!-- 2 column grid layout with text inputs for the first and last names -->
  <div class="row mb-4">
    <div class="col">
      <div class="form-outline">
        <input type="text" id="form3Example1" class="form-control" name="prenom" />
        <label class="form-label" for="form3Example1">First name</label>
      </div>
    </div>
    <div class="col">
      <div class="form-outline">
        <input type="text" id="form3Example2" class="form-control" name="nom" />
        <label class="form-label" for="form3Example2">Last name</label>
      </div>
    </div>
  </div>

  <!-- Email input -->
  <div class="form-outline mb-4">
    <input type="email" id="form3Example3" class="form-control" name="email" />
    <label class="form-label" for="form3Example3">Email address</label>
  </div>

  <!-- Password input -->
  <div class="form-outline mb-4">
    <input type="password" id="form3Example4" class="form-control" name="telephone"/>
    <label class="form-label" for="form3Example4">Téléphone</label>
  </div>

 

  <!-- Submit button -->
  <button type="submit" class="btn btn-primary btn-block mb-4">Sauvegarder</button>

  
</form>
		</div>
	</div>
</div>
</body>
</html>