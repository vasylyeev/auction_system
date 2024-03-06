<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.auction_system.model.Lot" %>
<%@ page import="com.example.auction_system.model.Offer" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.auction_system.service.LotService" %>
<%@ page import="com.example.auction_system.service.OfferService" %>

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
        <h1 class="text-center mt-5">Lot detail</h1>
    </div>
    <div class="d-flex" style="justify-content: center">
        <div class="card d-flex" style="width: max-content;">
            <div class="card-body">
                <p>Name: Lot 1</p>
                <p>startingPrice: $100</p>
                <p>active: Yes</p>
                <div class="offers">
                    <p>Offers:</p>
                    <ul class="list-group">
                        <li class="list-group-item">Name, $100</li>
                        <li class="list-group-item">Name, $100</li>
                        <li class="list-group-item">Name, $100</li>
                        <li class="list-group-item">Name, $100</li>
                        <li class="list-group-item">Name, $100</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <form class="d-flex mt-2" style="justify-content: center">
        <div class="form-group ">
            <input type="email" class="form-control" id="price" placeholder="Enter price">
        </div>
        <button type="submit" class="btn btn-primary" style="margin-left: 20px">Submit</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>