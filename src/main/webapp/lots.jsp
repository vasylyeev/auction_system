<%@ page import="com.example.auction_system.model.Lot" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Welcome to the Auction System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="resources/css/styles.css">
</head>
<body>
<div class="container">
    <div class="title">
        <h1 class="text-center mt-5">Active Lots</h1>
    </div>

    <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 row-cols-xl-4">
        <% for (Lot lot : (List<Lot>) request.getAttribute("activeLots")) { %>
        <div class="col">
            <div class="card m-4" style="width: 18rem;">
                <div class="card-body">
                    <h2><%= lot.getName() %></h2>
                    <p>Starting Price: $<%= Math.round(lot.getStartingPrice()) %></p>
                    <p>Owner: <%=  lot.getOwner().getUsername() %></p>
                    <p><a href="lot-details?lotId=<%= lot.getId() %>">View Details</a></p>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
