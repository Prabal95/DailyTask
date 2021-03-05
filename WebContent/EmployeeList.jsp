<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%> 
<%@page import="com.employee.beans.EmployeeBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://kit.fontawesome.com/dcd8aa9c93.js" crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<link rel="stylesheet" href="css/style-starter.css">
  	<link href="//fonts.googleapis.com/css?family=Nunito:300,400,600,700,800,900&display=swap" rel="stylesheet">

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
        					
        					<li class="breadcrumb-item active" aria-current="page">Employee List</li>
      					</ol>
    				</nav>
    				<form action="<%=request.getContextPath()%>/Index.jsp" method="post">
                 
                    <button type="submit" class="btn button-style-w3">HOME</button>
                </form>
    				<div class="accordions">
      					<div class="row">
       					<!-- accordion style 1 -->
     						<div class="col-lg-12 mb-4">
          						<div class="card card_border">
            						<div>
              							<div class="accordion" id="accordionExample">
                							<table>
												<thead>
													<tr class="table100-head">
														<th>S.No.</th>
														<th>Employee Name</th>
														<th>Age</th>
														<th>Salary</th>
														<th>City</th>
														<th>Mobile</th>
														<th>Email</th>
														<th>Gender</th>
														<th>Edit</th>
														<th>Delete</th>
													</tr>
												</thead>
												<tbody>
													<%ArrayList<EmployeeBean> list = (ArrayList<EmployeeBean>)request.getAttribute("data"); 
        												for(EmployeeBean bean:list){%> 
														<tr>
															<td><%=bean.getId() %></td>
															<td><%=bean.getName() %></td>
															<td><%=bean.getAge() %></td>
															<td><%=bean.getSalary() %></td>
															<td><%=bean.getCity() %></td>
															<td><%=bean.getMob() %></td>
															<td><%=bean.getEmail() %></td>
															<td><%=bean.getGender() %></td>
															<td><a href="EditEmployeeServlet?id=<%=bean.getId() %>" style="text-decoration: none;"><button type="button" ><i class="fas fa-pencil-alt"></i></button></a></td>
															<td><a href="DeleteEmployeeServlet?id=<%=bean.getId() %>" style="text-decoration: none;"><button type="button" ><i class="fas fa-trash-alt"></i></button></a></td>
														</tr>
													<%}%>
												</tbody>
											</table>
              							</div>
            						</div>
          						</div>
        					</div>
      					</div>
    				</div>
  				</div>
			</div>
		</section>
</body>
</html>