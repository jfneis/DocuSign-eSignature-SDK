<?php
/**
 * @copyright Copyright (C) DocuSign, Inc.  All rights reserved.
 *
 * This source code is intended only as a supplement to DocuSign SDK
 * and/or on-line documentation.
 * This sample is designed to demonstrate DocuSign features and is not intended
 * for production use. Code and policy for a production application must be
 * developed to meet the specific data and security requirements of the
 * application.
 *
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 */
	// start session and some helper functions
	include("include/session.php");
	// grab error message from session
	if(isset($_SESSION["errorMessage"])) {
		$error= $_SESSION["errorMessage"];
		unset($_SESSION["errorMessage"]);
	} else {
		$error = "Session Error Message not set";
	}
	$demoTitle = "Error";




?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>


        <title>InsuranceCo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
        <script type="text/javascript" src="scripts/webservice-status.js"></script>
        <link rel="stylesheet" type="text/css" href="css/style.css">

    </head><body>
        <div class="header" style=" background:url(images/fond.jpg); background-repeat:repeat-x; background-position:top">
            <div class="floatLeft" >
                <img src="images/logo.png" alt="InsuranceCo - Insuring the security of your future">
            </div>
            <div class="userBox">
                <table cellspacing="0" border="0">

                    <tr>
                        <td colspan="4" align="right">
                            <img id="credential_img" src="images/spinner.gif" /><span style="font-size: 0.75em;">(Credential webservice)</span>
                            <a href="sessionlog.php" target="_blank"><img src="images/script.png" style="border: 0px;" /><span style="font-size: 0.75em;">View InsuranceCo Event Log</span></a>
                        </td>
                    </tr>
                </table>
            </div>

                    </div>

        <div class="gutter"></div>

<div>			<h2>An Error Occurred</h2>
			<p>
				<?php echo $error; ?>
				</p>
				<p>
					<?php echo '<pre>' . xmlpp($_SESSION["lastRequest"], true) . '</pre>'; ?>
				</p>
</div>

        <div class="footer">
            InsuranceCo - Docusign        </div>
    </body></html>



