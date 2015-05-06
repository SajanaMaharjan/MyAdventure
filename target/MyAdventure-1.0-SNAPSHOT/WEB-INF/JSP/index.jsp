<%-- 
    Document   : index
    Created on : May 5, 2015, 11:11:16 PM
    Author     : sajana
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="A layout example that shows off a responsive pricing table.">

    <title>Pricing Table &ndash; Layout Examples &ndash; Pure</title>

    
 <%@include file="templates/header.jsp"%>



</head>
<body>







<div class="banner">
    <h1 class="banner-head">
       Travel Where you want.<br>
        Live the different way.
    </h1>
</div>

<div class="l-content">
    <div class="pricing-tables pure-g">
        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-free">
                <div class="pricing-table-header">
                    <h2>Risk</h2>

                    <span class="pricing-table-price">
                        <span>Risk Of DOing Nothing</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>Free setup</li>
                    <li>Custom sub-domain</li>
                    <li>Standard customer support</li>
                    <li>1GB file storage</li>
                    <li>1 database</li>
                    <li>Unlimited bandwidth</li>
                </ul>

                <button class="button-choose pure-button">Choose</button>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-biz pricing-table-selected">
                <div class="pricing-table-header">
                    <h2>Small Business</h2>

                    <span class="pricing-table-price">
                        $25 <span>per month</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>Free setup</li>
                    <li>Use your own domain</li>
                    <li>Standard customer support</li>
                    <li>10GB file storage</li>
                    <li>5 databases</li>
                    <li>Unlimited bandwidth</li>
                </ul>

                <button class="button-choose pure-button">Choose</button>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-3">
            <div class="pricing-table pricing-table-enterprise">
                <div class="pricing-table-header">
                    <h2>Enterprise</h2>

                    <span class="pricing-table-price">
                        $45 <span>per month</span>
                    </span>
                </div>

                <ul class="pricing-table-list">
                    <li>Free setup</li>
                    <li>Use your own domain</li>
                    <li>Premium customer support</li>
                    <li>Unlimited file storage</li>
                    <li>25 databases</li>
                    <li>Unlimited bandwidth</li>
                </ul>

                <button class="button-choose pure-button">Choose</button>
            </div>
        </div>
    </div> <!-- end pricing-tables -->

    <div class="information pure-g">
        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Get started today</h3>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Pay monthly or annually</h3>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ullamco laboris nisi ut aliquip ex ea commodo
                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">24/7 customer support</h3>
                <p>
                    Cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                </p>
            </div>
        </div>

        <div class="pure-u-1 pure-u-md-1-2">
            <div class="l-box">
                <h3 class="information-head">Cancel your plan anytime</h3>
                <p>
                    Duis aute irure dolor in reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </p>
            </div>
        </div>
    </div> <!-- end information -->
</div> <!-- end l-content -->




 <%@include file="templates/footer.jsp"%>

</body>
</html>

