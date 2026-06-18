<!--
	Why it is used:

	This is the entry gate of your system.

	What it does:
	Takes username/email + password
	Sends data to backend (Servlet/Controller)
	Checks if user is valid
	Redirects to dashboard if correct
	Why it is needed:

	Without login, anyone can enter the system. So this page:

	Controls security
	Identifies the user
	Starts the user session
	Simple flow:

	User - enters details - click login -backend verifies -success/fail
	
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>

<!-- HEADER -->
<div class="header">
    <img src="/images/logo.png">
    <h2>Skill Subscription Hub</h2>
</div>

<!-- LOGIN FORM -->
<div class="container">

    <h3>Login</h3>

    <form action="/login" method="post">

        <!-- enter email -->
        <input type="text" name="email" placeholder="Enter Email">

        <!-- enter password -->
        <input type="password" name="password" placeholder="Enter Password">

        <!-- submit login -->
        <button type="submit">Login</button>

    </form>

    <p>New user? <a href="/register">Register here</a></p>

</div>

</body>
</html>
