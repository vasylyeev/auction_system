<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="title">
        <h1 class="text-center mt-5">Login</h1>
    </div>
    <form class="mx-auto" action="login" method="post" style="display: flex; flex-direction: column; justify-content: center; width: 300px;">
        <div class="form-group mt-2 ">
            <label for="username_input">Username</label>
            <input type="text" class="form-control" id="username_input" name="username" aria-describedby="emailHelp" placeholder="Enter username">
        </div>
        <div class="form-group mt-2 ">
            <label for="password_input">Password</label>
            <input type="password" class="form-control" id="password_input" name="password" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary mt-2 ">Submit</button>
        <a href="signup.jsp" class="btn btn-danger mt-2 ">Don't have account? Sign up.</a>
    </form>

    <%
        String error = request.getParameter("error");
        if (error != null && error.equals("1")) {
    %>
    <div class="alert alert-danger mt-3" role="alert">
        Invalid username or password. Please try again.
    </div>
    <% } %>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
