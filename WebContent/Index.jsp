<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<title>Employee Details</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords" content="My School Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script>
        addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Lora:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
        rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">	 
</head>	
<body>
 <header>
        <div class="container">
            <div class="header d-lg-flex justify-content-between align-items-center py-2 px-sm-2 px-1">
                <!-- logo -->
                <div id="logo">
                    <h1><a href="Index.jsp">Employee</a></h1>
                </div>
                
            </div>
        </div>
    </header>
	    <div class="inner-banner-w3ls py-5" id="home">
        <div class="container py-xl-5 py-lg-3">
            <!-- login  -->
            <div class="modal-body my-5 pt-4">
                <h3 class="title-w3 mb-5 text-center text-wh font-weight-bold">Select Your Choice</h3>
                <h5 class="title-w3 mb-5 text-center text-wh font-weight-bold" style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></h5>
                
                <form action="<%=request.getContextPath()%>/AddEmployee.jsp" method="post">
                  
                    <button type="submit" class="btn button-style-w3">Add Employee</button>
                </form>
                
                <form action="<%=request.getContextPath()%>/ViewEmployeeServlet" method="post">
                 
                    <button type="submit" class="btn button-style-w3">View Employee</button>
                </form>
                 <form action="<%=request.getContextPath()%>/ViewEmployeeServlet" method="post">
                  
                    <button type="submit" class="btn button-style-w3">Update Employee</button>
                </form>
                 <form action="<%=request.getContextPath()%>/ViewEmployeeServlet" method="post">
                  
                    <button type="submit" class="btn button-style-w3">Delete Employee</button>
                </form>
            </div>
            <!-- //login -->
        </div>
    </div>
    <%--<jsp:include page="Footer.jsp"/> --%>
	 
</body>
</html>