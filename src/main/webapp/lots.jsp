<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.auction_system.model.Lot" %>
<%@ page import="com.example.auction_system.model.User" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.example.auction_system.service.LotService" %>

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

<%
    User owner1 = new User("vasylyeev", "password");
    User owner2 = new User("kuzmenko", "password");

    List<Lot> lots = Arrays.asList()
%>

<div class="container">
    <div class="title">
        <h1 class="text-center mt-5">Active Lots</h1>
    </div>

    <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 row-cols-xl-4">
        <div class="col">
            <div class="card m-4" style="width: 18rem;">
                <div class="card-body">
                    <h2>Lot 1</h2>
                    <p>Starting Price: $100</p>
                    <p>Owner: Denys Vasyliev</p>
                    <p><a href="lot-details">View Details</a></p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card m-4" style="width: 18rem;">
                <div class="card-body">
                    <h2>Lot 2</h2>
                    <p>Starting Price: $50</p>
                    <p>Owner: Oleksandr Kuzmenko</p>
                    <p><a href="lot-details?lotId=1">View Details</a></p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card m-4" style="width: 18rem;">
                <div class="card-body">
                    <h2>Lot 3</h2>
                    <p>Starting Price: $200</p>
                    <p>Owner: Evhen Semenyak</p>
                    <p><a href="lot-details?lotId=1">View Details</a></p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card m-4" style="width: 18rem;">
                <div class="card-body">
                    <h2>Lot 4</h2>
                    <p>Starting Price: $150</p>
                    <p>Owner: Sofia Trokhymchuk</p>
                    <p><a href="lot-details?lotId=1">View Details</a></p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card m-4" style="width: 18rem;">
                <div class="card-body">
                    <h2>Lot 5</h2>
                    <p>Starting Price: $90</p>
                    <p>Owner: Denys Vasyliev</p>
                    <p><a href="lot-details?lotId=1">View Details</a></p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card m-4" style="width: 18rem;">
                <div class="card-body">
                    <h2>Lot 6</h2>
                    <p>Starting Price: $20</p>
                    <p>Owner: Denys Vasyliev</p>
                    <p><a href="lot-details?lotId=1">View Details</a></p>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>
