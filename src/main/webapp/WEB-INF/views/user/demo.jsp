<%--
* Created by Rojberr
* CoreUI - Free Bootstrap Admin Template
* @version v3.4.0
* @link https://coreui.io
* Copyright (c) 2020 creativeLabs Łukasz Holeczek
* Licensed under MIT (https://coreui.io/license)
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="./" />
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, shrink-to-fit=no"
    />
    <meta
            name="description"
            content="Beetle Tracker - Open Source Issue and Bug Tracker"
    />
    <meta name="author" content="Rojberr, Michal & other Contributors" />
    <meta
            name="keyword"
            content="Bootstrap,Bug,Tracker,Open,Source,Issues,Issue,jQuery,CSS,HTML,RWD,Dashboard"
    />
    <title>Beetle Tracker - Demo</title>
    <link
            rel="apple-touch-icon"
            sizes="57x57"
            href="assets/favicon/apple-icon-57x57.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="60x60"
            href="assets/favicon/apple-icon-60x60.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="72x72"
            href="assets/favicon/apple-icon-72x72.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="76x76"
            href="assets/favicon/apple-icon-76x76.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="114x114"
            href="assets/favicon/apple-icon-114x114.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="120x120"
            href="assets/favicon/apple-icon-120x120.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="144x144"
            href="assets/favicon/apple-icon-144x144.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="152x152"
            href="assets/favicon/apple-icon-152x152.png"
    />
    <link
            rel="apple-touch-icon"
            sizes="180x180"
            href="assets/favicon/apple-icon-180x180.png"
    />
    <link
            rel="icon"
            type="image/png"
            sizes="192x192"
            href="assets/favicon/android-icon-192x192.png"
    />
    <link
            rel="icon"
            type="image/png"
            sizes="32x32"
            href="assets/favicon/favicon-32x32.png"
    />
    <link
            rel="icon"
            type="image/png"
            sizes="96x96"
            href="assets/favicon/favicon-96x96.png"
    />
    <link
            rel="icon"
            type="image/png"
            sizes="16x16"
            href="assets/favicon/favicon-16x16.png"
    />
    <link rel="manifest" href="assets/favicon/manifest.json" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta
            name="msapplication-TileImage"
            content="assets/favicon/ms-icon-144x144.png"
    />
    <meta name="theme-color" content="#ffffff" />
    <!-- Main styles for this application-->
    <link href="css/style.css" rel="stylesheet" />
    <!-- Global site tag (gtag.js) - Google Analytics-->
    <!-- I'm using my own tag to track the number of views and so on ...-->
    <script
            async=""
            src="https://www.googletagmanager.com/gtag/js?id=G-PK0TKBF07V"
    ></script>
    <script>
        window.dataLayer = window.dataLayer || [];

        function gtag() {
            dataLayer.push(arguments);
        }
        gtag("js", new Date());
        // Shared ID
        gtag("config", "G-PK0TKBF07V");
    </script>
    <link
            href="node_modules/@coreui/chartjs/dist/css/coreui-chartjs.css"
            rel="stylesheet"
    />
</head>
<body class="c-app flex-row align-items-center">
<div class="container">
    <div class="row justify-content-center">
        <div class="col-6">
            <div class="card">
                <div class="card-header bg-facebook content-center">
                    <svg class="c-icon c-icon-3xl text-white my-4">
                        <use
                                xlink:href="node_modules/@coreui/icons/sprites/brand.svg#cib-facebook-f"
                        ></use>
                    </svg>
                    <div class="c-chart-wrapper">
                        <canvas id="social-box-chart-1" height="90"></canvas>
                    </div>
                </div>
                <div class="card-body justify-content-center align-items-center">
                    <p class="text-center border-bottom">
                        Select a user to start your session
                    </p>
                    <div
                            class="card-body p-0 buffer justify-content-center align-items-center"
                    >
                        <div class="card">
                            <div class="card-body p-3 d-flex align-items-center">
                                <div class="bg-primary p-3 mfe-3">
                                    <svg class="c-icon c-icon-xl">
                                        <use
                                                xlink:href="node_modules/@coreui/icons/sprites/free.svg#cil-settings"
                                        ></use>
                                    </svg>
                                </div>
                                <div>
                                    <div class="text-value text-primary">Admin</div>
                                    <div
                                            class="text-muted text-uppercase font-weight-bold small"
                                    >
                                        Manages all avaiable users and issues
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div
                            class="card-body p-0 buffer justify-content-md-center align-items-center"
                    >
                        <div class="card">
                            <div class="card-body p-3 d-flex align-items-center">
                                <div class="bg-primary p-3 mfe-3">
                                    <svg class="c-icon c-icon-xl">
                                        <use
                                                xlink:href="node_modules/@coreui/icons/sprites/free.svg#cil-settings"
                                        ></use>
                                    </svg>
                                </div>
                                <div>
                                    <div class="text-value text-primary">Manager</div>
                                    <div
                                            class="text-muted text-uppercase font-weight-bold small"
                                    >
                                        Manages issues and users
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div
                            class="card-body p-0 buffer justify-content-md-center align-items-center"
                    >
                        <div class="card">
                            <div class="card-body p-3 d-flex align-items-center">
                                <div class="bg-primary p-3 mfe-3">
                                    <svg class="c-icon c-icon-xl">
                                        <use
                                                xlink:href="node_modules/@coreui/icons/sprites/free.svg#cil-settings"
                                        ></use>
                                    </svg>
                                </div>
                                <div>
                                    <div class="text-value text-primary">User</div>
                                    <div
                                            class="text-muted text-uppercase font-weight-bold small"
                                    >
                                        Add and manage your issues
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div
                            class="card-body p-0 buffer justify-content-md-center align-items-center"
                    >
                        <div class="card">
                            <div class="card-body p-3 d-flex align-items-center">
                                <div class="bg-primary p-3 mfe-3">
                                    <svg class="c-icon c-icon-xl">
                                        <use
                                                xlink:href="node_modules/@coreui/icons/sprites/free.svg#cil-settings"
                                        ></use>
                                    </svg>
                                </div>
                                <div>
                                    <div class="text-value text-primary">Guest</div>
                                    <div
                                            class="text-muted text-uppercase font-weight-bold small"
                                    >
                                        Report an issue without an account
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <p class="text-center">
                        <a href="<c:url value='/contact'/> "> Contact us</a>
                    </p>
                    <p class="text-center">
                        <a href="<c:url value='/user/register'/> ">
                            I already have an account</a></p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- CoreUI and necessary plugins-->
<script src="node_modules/@coreui/coreui/dist/js/coreui.bundle.min.js"></script>
<!--[if IE]><!-->
<script src="node_modules/@coreui/icons/js/svgxuse.min.js"></script>
<!--<![endif]-->
</body>
</html>
