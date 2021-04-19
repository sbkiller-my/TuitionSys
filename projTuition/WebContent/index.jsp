<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Welcome !</title>

  <!-- Bootstrap Core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom Fonts -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="vendor/fonts/1.css" rel="stylesheet" type="text/css">
  <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

  <!-- "WebContent/index.jsp"Custom CSS -->
  <link href="css/stylish-portfolio.css" rel="stylesheet">

</head>

<body id="page-top">


  <!-- Header -->
  <header class="masthead d-flex">
    <div class="container text-center my-auto">
	  <img src="img/tui.png"<br></img>
      <h1 class="mb-1">Super Tuition System</h1>
      <h3 class="mb-5">
        <em>Where Learning Never Ends</em>
      </h3>
      <a class="btn btn-primary btn-xl js-scroll-trigger" href="#login"><h4>ACCESS NOW</h4></a>
    </div>
    <div class="overlay"></div>
  </header>

  

  <!-- login -->	
  <section class="content-section bg-light  text-center" id="login">
    <div class="container">
      <div class="content-section-heading">
      <form action="loginServlet" method="post" class="login100-form validate-form flex-sb flex-w">
        <h3 class="text-secondary mb-0">Access To The System</h3>
        <h2 class="mb-5">Identify Yourself</h2>
      </div>
       <div class="row destacados">
    <div class="col-lg-6" style="cursor:pointer;" onclick="window.location='loginA.html';">
        <div>

            <img src="img/educator.jpg"  class="rounded-circle img-thumbnail"><br>
            	<br><h2>Educator</h2>
        </div>
    </div>
    <div class="col-lg-6" style="cursor:pointer;" onclick="window.location='loginM.html';">
        <div>	
				<img src="img/student.jpg" class="rounded-circle img-thumbnail"><br>
				<br><h2>Student</h2>
				
				</form>
        </div>
    </div>
</div>
    </div>
  </section>

  

  

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded js-scroll-trigger" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for this template -->
  <script src="js/stylish-portfolio.min.js"></script>

</body>

</html>
