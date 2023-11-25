<%-- 
    Document   : navbar.jsp
    Created on : Nov 21, 2023, 11:00:48 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.employee.model.*"%>
<%@page import="java.util.*" %>

<%

ProductDTO pdto=new ProductDTO();
List <ProductDAO> products= pdto.getAllProducts();
ArrayList<CartDAO> cart_list = (ArrayList<CartDAO>) session.getAttribute("cart-list");
if (cart_list != null) {
	request.setAttribute("cart_list", cart_list);
}
%>
<!DOCTYPE html>
<!-- Created By CodingNepal - www.codingnepalweb.com -->
<html lang="en" dir="ltr">
    <head>
        <meta charset="UTF-8">
        <title>Royal Palm </title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <style>
            /* Googlefont Poppins CDN Link */
            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Poppins', sans-serif;
            }
            body{
                min-height: 100vh;
            }
            nav{
                position: fixed;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                height: 70px;
                background: #3E8DA8;
                box-shadow: 0 1px 2px rgba(0, 0, 0, 0.2);
                z-index: 99;
            }
            nav .navbar{
                height: 100%;
                max-width: 1250px;
                width: 100%;
                display: flex;
                align-items: center;
                justify-content: space-between;
                margin: auto;
                /* background: red; */
                padding: 0 50px;
            }
            .navbar .logo a{
                font-size: 30px;
                color: #fff;
                text-decoration: none;
                font-weight: 600;
            }
            nav .navbar .nav-links{
                line-height: 70px;
                height: 100%;
            }
            nav .navbar .links{
                display: flex;
            }
            nav .navbar .links li{
                position: relative;
                display: flex;
                align-items: center;
                justify-content: space-between;
                list-style: none;
                padding: 0 14px;
            }
            nav .navbar .links li a{
                height: 100%;
                text-decoration: none;
                white-space: nowrap;
                color: #fff;
                font-size: 15px;
                font-weight: 500;
            }
            .links li:hover .htmlcss-arrow,
            .links li:hover .js-arrow{
                transform: rotate(180deg);
            }

            nav .navbar .links li .arrow{
                /* background: red; */
                height: 100%;
                width: 22px;
                line-height: 70px;
                text-align: center;
                display: inline-block;
                color: #fff;
                transition: all 0.3s ease;
            }
            nav .navbar .links li .sub-menu{
                position: absolute;
                top: 70px;
                left: 0;
                line-height: 40px;
                background: #3E8DA8;
                box-shadow: 0 1px 2px rgba(0, 0, 0, 0.2);
                border-radius: 0 0 4px 4px;
                display: none;
                z-index: 2;
            }
            nav .navbar .links li:hover .htmlCss-sub-menu,
            nav .navbar .links li:hover .js-sub-menu{
                display: block;
            }
            .navbar .links li .sub-menu li{
                padding: 0 22px;
                border-bottom: 1px solid rgba(255,255,255,0.1);
            }
            .navbar .links li .sub-menu a{
                color: #fff;
                font-size: 15px;
                font-weight: 500;
            }
            .navbar .links li .sub-menu .more-arrow{
                line-height: 40px;
            }
            .navbar .links li .htmlCss-more-sub-menu{
                /* line-height: 40px; */
            }
            .navbar .links li .sub-menu .more-sub-menu{
                position: absolute;
                top: 0;
                left: 100%;
                border-radius: 0 4px 4px 4px;
                z-index: 1;
                display: none;
            }
            .links li .sub-menu .more:hover .more-sub-menu{
                display: block;
            }
            .navbar .search-box{
                position: relative;
                height: 40px;
                width: 40px;
            }
            .navbar .search-box i{
                position: absolute;
                height: 100%;
                width: 100%;
                line-height: 40px;
                text-align: center;
                font-size: 22px;
                color: #fff;
                font-weight: 600;
                cursor: pointer;
                transition: all 0.3s ease;
            }
            .navbar .search-box .input-box{
                position: absolute;
                right: calc(100% - 40px);
                top: 80px;
                height: 60px;
                width: 300px;
                background: #3E8DA8;
                border-radius: 6px;
                opacity: 0;
                pointer-events: none;
                transition: all 0.4s ease;
            }
            .navbar.showInput .search-box .input-box{
                top: 65px;
                opacity: 1;
                pointer-events: auto;
                background: #3E8DA8;
            }
            .search-box .input-box::before{
                content: '';
                position: absolute;
                height: 20px;
                width: 20px;
                background: #3E8DA8;
                right: 10px;
                top: -6px;
                transform: rotate(45deg);
            }
            .search-box .input-box input{
                position: absolute;
                top: 50%;
                left: 50%;
                border-radius: 4px;
                transform: translate(-50%, -50%);
                height: 35px;
                width: 280px;
                outline: none;
                padding: 0 15px;
                font-size: 16px;
                border: none;
            }
            .navbar .nav-links .sidebar-logo{
                display: none;
            }
            .navbar .bx-menu{
                display: none;
            }
            @media (max-width:920px) {
                nav .navbar{
                    max-width: 100%;
                    padding: 0 25px;
                }

                nav .navbar .logo a{
                    font-size: 27px;
                }
                nav .navbar .links li{
                    padding: 0 10px;
                    white-space: nowrap;
                }
                nav .navbar .links li a{
                    font-size: 15px;
                }
            }
            @media (max-width:800px){
                nav{
                    /* position: relative; */
                }
                .navbar .bx-menu{
                    display: block;
                }
                nav .navbar .nav-links{
                    position: fixed;
                    top: 0;
                    left: -100%;
                    display: block;
                    max-width: 270px;
                    width: 100%;
                    background:  #3E8DA8;
                    line-height: 40px;
                    padding: 20px;
                    box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
                    transition: all 0.5s ease;
                    z-index: 1000;
                }
                .navbar .nav-links .sidebar-logo{
                    display: flex;
                    align-items: center;
                    justify-content: space-between;
                }
                .sidebar-logo .logo-name{
                    font-size: 25px;
                    color: #fff;
                }
                .sidebar-logo  i,
                .navbar .bx-menu{
                    font-size: 25px;
                    color: #fff;
                }
                nav .navbar .links{
                    display: block;
                    margin-top: 20px;
                }
                nav .navbar .links li .arrow{
                    line-height: 40px;
                }
                nav .navbar .links li{
                    display: block;
                }
                nav .navbar .links li .sub-menu{
                    position: relative;
                    top: 0;
                    box-shadow: none;
                    display: none;
                }
                nav .navbar .links li .sub-menu li{
                    border-bottom: none;

                }
                .navbar .links li .sub-menu .more-sub-menu{
                    display: none;
                    position: relative;
                    left: 0;
                }
                .navbar .links li .sub-menu .more-sub-menu li{
                    display: flex;
                    align-items: center;
                    justify-content: space-between;
                }
                .links li:hover .htmlcss-arrow,
                .links li:hover .js-arrow{
                    transform: rotate(0deg);
                }
                .navbar .links li .sub-menu .more-sub-menu{
                    display: none;
                }
                .navbar .links li .sub-menu .more span{
                    /* background: red; */
                    display: flex;
                    align-items: center;
                    /* justify-content: space-between; */
                }

                .links li .sub-menu .more:hover .more-sub-menu{
                    display: none;
                }
                nav .navbar .links li:hover .htmlCss-sub-menu,
                nav .navbar .links li:hover .js-sub-menu{
                    display: none;
                }
                .navbar .nav-links.show1 .links .htmlCss-sub-menu,
                .navbar .nav-links.show3 .links .js-sub-menu,
                .navbar .nav-links.show2 .links .more .more-sub-menu{
                    display: block;
                }
                .navbar .nav-links.show1 .links .htmlcss-arrow,
                .navbar .nav-links.show3 .links .js-arrow{
                    transform: rotate(180deg);
                }
                .navbar .nav-links.show2 .links .more-arrow{
                    transform: rotate(90deg);
                }
            }
            @media (max-width:370px){
                nav .navbar .nav-links{
                    max-width: 100%;
                }
            }
        </style>
        <!-- <link rel="stylesheet" href="style.css"> -->
        <!-- Boxicons CDN Link -->
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
            <div class="navbar">
                <i class='bx bx-menu'></i>
                <div class="logo"><a href="#">Royal Palm</a></div>
                <div class="nav-links">
                    <div class="sidebar-logo">
                        <span class="logo-name">Royal Palm</span>
                        <i class='bx bx-x' ></i>
                    </div>
                    <ul class="links">
                        <li><a href="#">HOME</a></li>
            
                        
                        <li><a href="#">ABOUT US</a></li>
                        <li><a href="#">CONTACT US</a></li>
                        <li>
                            <a href="#">Admin</a> 
                            <i class='bx bxs-chevron-down js-arrow arrow '></i>
                            <ul class="js-sub-menu sub-menu">
                                <li><a href="#" data-bs-toggle="modal" data-bs-target="#ModalForm">Login</a></li>
                                <li><a href="Registration.jsp">Registration</a></li>


                                <li class="more">
                                    <span><a href="#">More</a>
                                        <i class='bx bxs-chevron-right arrow more-arrow'></i>
                                    </span>
                                     <ul class="more-sub-menu sub-menu">
                                        <li><a href="ProductAdd.jsp">Add Product</a></li>
                                        <li><a href="#">Update Password</a></li>
                                        <li><a href="#">Glassmorphism</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li><a href="#"><i class='bx bx-user'></i> Profile</a></li>
                        <li><a href="#"><i class='bx bx-log-out'></i> Logout</a></li>
                        <li><a href="#"><i class='bx bx-cart'></i> Cart</a></li>
                    </ul>
                </div>

                <div class="search-box">
                    <i class='bx bx-search'></i>
                    <div class="input-box">
                        <input type="text" placeholder="Search...">
                    </div>
                </div>
            </div>
        </nav>
        
        
        
<%
if (!products.isEmpty()) {
%>
<br><br>
<div class="container">
    <div class="row row-cols-1 row-cols-md-4 mt-5 g-4">
        <% for (ProductDAO p : products) { %>
        <div class="col">  
            <div class="card">
                <img src="images/<%=p.getImage()%>" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title"><%=p.getName() %></h5>
                    <h5 class="card-title">Price: $<%=p.getPrice() %></h5>
                    <h5 class="card-title">Category: <%=p.getCategory()%></h5>
                    <div class="mt-3 d-flex justify-content-between">
			<a class="btn btn-success" href="AddToCart?id=<%=p.getId()%>">Add to Cart</a> 
                        <a class="btn btn-primary" href="order-now?quantity=1&id=<%=p.getId()%>">Buy Now</a>
		    </div>
                </div>
            </div>
        </div>
        <% } %>
    </div>
</div>
<%
} else {
%>
    <h1>There is no products</h1>
<%
}
%>

        <script >
            // search-box open close js code
            let navbar = document.querySelector(".navbar");
            let searchBox = document.querySelector(".search-box .bx-search");
      // let searchBoxCancel = document.querySelector(".search-box .bx-x");

            searchBox.addEventListener("click", () => {
                navbar.classList.toggle("showInput");
                if (navbar.classList.contains("showInput")) {
                    searchBox.classList.replace("bx-search", "bx-x");
                } else {
                    searchBox.classList.replace("bx-x", "bx-search");
                }
            });

      // sidebar open close js code
            let navLinks = document.querySelector(".nav-links");
            let menuOpenBtn = document.querySelector(".navbar .bx-menu");
            let menuCloseBtn = document.querySelector(".nav-links .bx-x");
            menuOpenBtn.onclick = function () {
                navLinks.style.left = "0";
            }
            menuCloseBtn.onclick = function () {
                navLinks.style.left = "-100%";
            }


      // sidebar submenu open close js code
            let htmlcssArrow = document.querySelector(".htmlcss-arrow");
            htmlcssArrow.onclick = function () {
                navLinks.classList.toggle("show1");
            }
            let moreArrow = document.querySelector(".more-arrow");
            moreArrow.onclick = function () {
                navLinks.classList.toggle("show2");
            }
            let jsArrow = document.querySelector(".js-arrow");
            jsArrow.onclick = function () {
                navLinks.classList.toggle("show3");
            }
        </script>
        
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </body>
</html>
