<%--
  Created by IntelliJ IDEA.
  User: samsung
  Date: 5/13/20
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Home</title>
  <link rel="stylesheet" href="../css/home.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container-fluid">
  <header class="header row">
    <div class="col-xl-8 logo">
      <h1><a href="/index.jsp">LOGO</a></h1>
    </div>
    <div class="col-xl-4 menu">
      <ul>
        <li class="border-bottom-red"><a href="index.jsp">HOME</a></li>
        <li><a href="/jsp/login.jsp">LOGIN</a></li>
        <li><a href="/jsp/register.jsp">REGISTER</a></li>
        <li><a href="#footer-contact">CONTACT</a></li>
        <li class="icon"><a href="https://www.facebook.com/fc.ngoclich"><span class="fa-stack ">
                  <i class="fa fa-circle-thin fa-stack-2x"></i>
                  <i class="fa fa-facebook fa-stack-1x"></i>
                </span></a></li>
        <li class="icon"><a href=""> <span class="fa-stack "><i class="fa fa-circle-thin fa-stack-2x"></i>
                    <i class="fa fa-youtube fa-stack-1x"></i>
                </span></a></li>
      </ul>
    </div>
  </header>

  <div id="" class=" banner carousel slide" data-ride="carousel">
    <ul class="carousel-indicators">
      <li data-target="#demo" data-slide-to="0" class="active"></li>
      <li data-target="#demo" data-slide-to="1"></li>
      <li data-target="#demo" data-slide-to="2"></li>
    </ul>
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="https://journeycasual.weba.vn/shop/images/journeycasual/slider/BANNER-WEBSITE-sua-logo.jpg" alt="Los Angeles" width="1490" height="614">

      </div>
      <div class="carousel-item">
        <img src="https://file.hstatic.net/1000168174/article/bella_-_banner_web_tin_tt-final.jpg" alt="Chicago" width="1490" height="614">

      </div>
      <div class="carousel-item">
        <img src="https://file.hstatic.net/1000168174/article/bella_-_banner_tin_su_kien_-_nu_tam_xuan-_lookbook_design-15.jpg" alt="New York" width="1490" height="614">

      </div>
    </div>
    <a class="carousel-control-prev" href="#demo" data-slide="prev">
      <span class="carousel-control-prev-icon"></span>
    </a>
    <a class="carousel-control-next" href="#demo" data-slide="next">
      <span class="carousel-control-next-icon"></span>
    </a>
  </div>
  <div class="about">
    <h2>ABOUT</h2>
    <div><img src="#" alt=""></div>
    <p>The About page is the core description of your website.
      Here is where you let clients know what your website is about.
      You can edit all of this text and replace it with what you want to write.
      For example you can let them know how long you have been in business,
      what makes your company special, what are its core values and more. The About page is the core description
      of your website. Here is where you let clients know what your website is about. You can edit all of this
      text and replace it with what you want to write. For example you can let them know how long you have been in
      business, what makes your company special, what are its core values and more. The About page is the core
      description of your website. Here is where you let clients know what your website is about. You can edit all
      of this text and replace it with what you want to write. For example you can let them know how long you have
      been in business, what makes your company special, what are its core values and more.

      Edit your About page from the Pages tab by clicking the edit button.</p>
  </div>
  <hr>
  <div class="content">
    <div class="main-categories">
      <h2>MAIN CATEGORIES</h2>
      <ul>
        <li><a href="#">list anh</a></li>
        <li><a href="#">list anh</a></li>
        <li><a href="#">list anh</a></li>
      </ul>
    </div>
    <div class="new-arrival">
      <h2>NEW ARRIVAL</h2>
      <ul>
        <li><a href="#">list anh</a></li>
        <li><a href="#">list anh</a></li>
        <li><a href="#">list anh</a></li>
        <li><a href="#">list anh</a></li>
        <li><a href="#">list anh</a></li>
        <li><a href="#">list anh</a></li>
      </ul>
    </div>
  </div>
  <hr>
  <div class="contact" id="footer-contact">
    <h2>CONTACT</h2>
    <div class="contact-content row">
      <div class="my-information col-xl-6">
        Hanoi, Vietnam<br>
        999-7777-000<br>
        daovanphi25051994@gmail.com
      </div>
      <div class="customer-information col-xl-6">
        <form action="#" method="post">
          <input id="customer-name" type="text" name="name" placeholder="Name">
          <input id="customer-phone" type="text" name="phoneNumber" placeholder="Phone"><br>
          <input id="customer-email" type="text" name="emailAddress" placeholder="Email Address"><br>
          <textarea id="customer-contact-content" name="contactContent" placeholder="Message"></textarea><br>
          <input id="btn-contact" type="submit" value="CONTACT US">
        </form>
      </div>
    </div>
  </div>
  <div class="footer">
    <div class="footer-menu">
      <ul>
        <li class="border-bottom-red"><a href="/index.jsp">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Shop</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div>
    <div class="copy-right">
      <p>Copyrigh 2020 All rights reserved - phi dao <br> Powered By SITE123-Website creator</p>
    </div>
  </div>

</div>


<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
<script src="../js/home.js"></script>
</body>
</html>
