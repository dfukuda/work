
<body>

	<div class="navbar navbar-inverse navbar-fixed-top">


		<div class="navbar-inner">
			<div class="container">
				<button type="button" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

					<!--  
					<a class="brand" href="#">HGM</a>
					<div class="nav-collapse collapse">
						<ul class="nav">
							<li class="active"><a href="#">Home</a></li>
							<li><a href="#about">About</a></li>
							<li><a href="#contact">Contact</a></li>
						</ul>
					</div>
				 	-->
			</div>
		</div>
	</div>


	<div class="container">

		<h1>Login</h1>


		<form name="f" class="form-horizontal" action="<c:url value='j_spring_security_check'/>" method="POST">
			<div class="control-group">
				<!-- Username -->
				<label class="control-label" for="username">User ID</label>
				<div class="controls">
					<input type="text" id="user_id" name="j_username" placeholder=""
						class="input-xlarge" required>
				</div>
			</div>

			<div class="control-group">
				<!-- Password-->
				<label class="control-label" for="password">Password</label>
				<div class="controls">
					<input type="password" id="password" name="j_password" placeholder=""
						class="input-xlarge" required>
				</div>
			</div>

 			<div class="control-group">
                 <div class="controls">
                   <button class="btn btn-success">Login</button>
                 </div>
            </div>

		</form>

		<p>
			If you have a question, Please contact to<br>
		</p>



	</div>
	<!-- /container -->


</body>
</html>
