<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  	<script src="https://kit.fontawesome.com/dcd8aa9c93.js" crossorigin="anonymous"></script>	
  	<title>EditEmployee</title>
  	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Lora:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
        rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">	 
  
</head>
<body class="sidebar-menu-collapsed">
	<div class="se-pre-con"></div>
		<section>
			
			<div class="main-content">
  				<div class="container-fluid content-top-gap">
    				<nav aria-label="breadcrumb">
      					<ol class="breadcrumb my-breadcrumb">
        					<li class="breadcrumb-item active" aria-current="page">EditEmployee</li>
      					</ol>
    				</nav>
    				
    				<div class="accordions">
      					<div class="row">
       					<!-- accordion style 1 -->
     						<div class="col-lg-12 mb-4">
          						 <section class="forms">
						            <div class="card card_border py-2 mb-4">
						            <div class="cards__heading">
						                    <h3>Edit Employee <span></span></h3>
						                </div>
						                <div class="card-body">
						                    <form action="<%=request.getContextPath()%>/UpdateEmployeeServlet" method="post">
						                    	<div class="form-group">
						                            <label for="inputAddress" class="input__label">Employee Id</label>
						                            <input type="text" name="id" class="form-control input-style" id="inputAddress" placeholder="Enter Employee Id" value="<%= request.getAttribute("id")%>" required>
						                        </div>
						                    	<div class="form-group">
						                            <label for="inputAddress" class="input__label">Employee Name</label>
						                            <input type="text" name="name" class="form-control input-style" id="inputAddress" placeholder="Enter Employee Name (Letters Only)" pattern="[A-Za-z\s]+" value="<%= request.getAttribute("name")%>" required>
						                        </div>
						                        <div class="form-row">
						                            <div class="form-group col-md-6">
						                                <label for="inputCity" class="input__label">Employee Age</label>
						                                <input type="text" name="age" class="form-control input-style" id="inputCity" placeholder="Enter Age (Numbers Only)" maxlength="2" pattern="[0-9]+" value="<%= request.getAttribute("age")%>" required>
						                            </div>
						                            <div class="form-group col-md-6">
						                                <label for="inputState" class="input__label">Salary</label>
						                               	<input type="date" name="salary" class="form-control input-style" id="inputCity"  value="<%= request.getAttribute("salary")%>" pattern="[0-9]+" required>
						                            </div>
						                        </div>
						                        <div class="form-row">
						                        	<div class="form-group col-md-6">
						                                <label for="exampleInputEmail1" class="input__label">City</label>
							                            <input type="text" name="city" class="form-control input-style" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter City" value="<%= request.getAttribute("city")%>" required>
							                            
						                            </div>
						                            <div class="form-group col-md-6">
						                                <label for="inputEmail4" class="input__label">Mobile</label>
						                                <input type="text" name="mob" class="form-control input-style" id="inputEmail4" placeholder="Enter Mobile Number (Numbers Only)" minlength="10" maxlength="10" pattern="[0-9]+" value="<%= request.getAttribute("mob")%>" required>
						                            </div>
						                          
						                        </div>
						                        <div class="form-row">
						                            <div class="form-group col-md-6">
						                                <label for="exampleInputEmail1" class="input__label">Email</label>
							                            <input type="email" name="email" class="form-control input-style" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" value="<%= request.getAttribute("email")%>" required>
							                            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
						                            </div>
						                            <div class="form-group col-md-6">
						                                <label for="inputZip" class="input__label">Gender</label>
						                                <select id="inputState" name="gender" class="form-control input-style" value="<%= request.getAttribute("gender")%>" required>
						                                    <option selected disabled>Choose...</option>
						                                    <option>Male</option>
						                                    <option>Female</option>
						                                </select>
						                            </div>
						                        </div>
						                        
						                        <div align="center"><button type="submit" class="btn btn-primary btn-style mt-4">Update</button></div>
						                    </form>
						                </div>
						            </div>
						        </section>
        					</div>
      					</div>
    				</div>
  				</div>
			</div>
		</section>
</body>
</html>