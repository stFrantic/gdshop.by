<!DOCTYPE html>
<html>
<head>
    <%@ page language="java" contentType="text/html;charset=utf-8"%>
    <meta charset="utf-8">
    <title>Главная страница</title>
    <link rel="stylesheet" href="main.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<header>
    <header>
        <div class="collapse bg-dark" id="navbarHeader">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-md-7 py-4">
                        <h4 class="text-white">JDS - это...</h4>
                        <p class="text-muted">магазин нового уровня.Мы - партнеры таких крупныз фирм, как Kingstone,A4tech,Logitech,Razor,Microsoft,Apple и многие другие</p>
                    </div>
                    <div class="col-sm-4 offset-md-1 py-4">
                        <h4 class="text-white">Contact</h4>
                        <ul class="list-unstyled">
                            <li><a href="#" class="text-white">Каталог</a></li>
                            <li><a href="#" class="text-white">Корзина</a></li>
                            <li><a href="#" class="text-white">Профиль</a></li>
                            <li><a href="#" class="text-white">О нас</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="navbar navbar-dark bg-dark box-shadow">
            <div class="container d-flex justify-content-between">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
        </div>
    </header>
</header>
<main>
    <div class="card" style="width: 18rem;">
        <img class="card-img-top" src="income.jpg">
        <div class="card-body">
            <h5 class="card-title">Поступление товара</h5>
            <p class="card-text">Самое время пойти и прикупить себе что то новое!!</p>
            <a href="catalog.html" class="btn btn-primary">Каталог</a>
        </div>
    </div>
    <table class="table_dark">
        <caption>Курсы валют</caption>
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Покупка</th>
            <th scope="col">Продажа</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">USD</th>
            <td>1.96</td>
            <td>1.962</td>
        </tr>
        <tr>
            <th scope="row">EUR</th>
            <td>2.416</td>
            <td>2.42</td>
        </tr>
        <tr>
            <th scope="row">RUB</th>
            <td>3.42</td>
            <td>3.42</td>>
        </tr>
        </tbody>
    </table>
</main>
<footer> <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="main.html">О компании <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="mapping.html">Найти нас?</a>
            <li class="nav-item">
                <a class="nav-link" href="partnership.html">Стать партнером</a>
            </li>
        </ul>
</footer>
</body>
</html>