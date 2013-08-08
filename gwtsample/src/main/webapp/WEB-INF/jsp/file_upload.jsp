<%@page pageEncoding="UTF-8"%>

<body>


<%@ include file="/WEB-INF/jsp/head_navi.jspf"%>



	<div class="container">
	
	
	   <!-- JavaScript Includes -->
   
        <script src="js/jquery.knob.js"></script>

        <!-- jQuery File Upload Dependencies -->
        <script src="js/jquery.ui.widget.js"></script>
        <script src="js/jquery.iframe-transport.js"></script>
        <script src="js/jquery.fileupload.js"></script>
		<script src="js/script.js"></script>
	
	
	
	
 		<form id="upload" method="post" action="file_upload?action=2" enctype="multipart/form-data">
            <div id="drop">
                Drop Here

                <a>Browse</a>
                <input type="file" name="fukudafile" multiple />
            </div>

            <ul>
                <!-- The file uploads will be shown here -->
            </ul>

        </form>

	
	</div>
	<!-- /container -->

</body>
</html>
