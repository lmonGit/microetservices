<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="fr">
    <head>
        <title>CONTACT</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Your description">
        <meta name="keywords" content="Your keywords">
        <meta name="author" content="Your name">

        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/font-awesome.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/touchTouch.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/owl.carousel.css" rel="stylesheet">
        <link href="css/owl.transitions.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">

        <script src="js/jquery.js"></script>
        <script src="js/jquery-migrate-1.2.1.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/superfish.js"></script>

        <script src="js/jquery.queryloader2.js"></script>

        <script src="js/jquery.appear.js"></script>

        <script src="js/jquery.ui.totop.js"></script>
        <script src="js/jquery.equalheights.js"></script>

        <script src="js/owl.carousel.js"></script>

        <script src="js/jquery.caroufredsel.js"></script>
        <script src="js/jquery.touchSwipe.min.js"></script>

        <script src="js/jquery.parallax-1.1.3.resize.js"></script>

        <script src="js/jquery.jlanding.js"></script>

        <script src="js/SmoothScroll.js"></script>

        <script src="js/jquery.prettyPhoto.js"></script>

        <script src="js/touchTouch.jquery.js"></script>

        <script src="js/cform.js"></script>

        <script src="js/scripts.js"></script>




        <link href="${pageContext.request.contextPath}/resources/Css/style.css" rel="stylesheet" >
        <title>Contact</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <!-- Elément Google Maps indiquant que la carte doit être affiché en plein écran et
        qu'elle ne peut pas être redimensionnée par l'utilisateur -->
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
        <!-- Inclusion de l'API Google MAPS -->
        <!-- Le paramètre "sensor" indique si cette application utilise détecteur pour déterminer la position de l'utilisateur -->
        <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
        <script type="text/javascript">
            function initialiser() {
                var latlng = new google.maps.LatLng(44.012089, 1.345793);
                //objet contenant des propriétés avec des identificateurs prédéfinis dans Google Maps permettant
                //de définir des options d'affichage de notre carte
                var options = {
                    center: latlng,
                    zoom: 19,
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                };

                //constructeur de la carte qui prend en paramêtre le conteneur HTML
                //dans lequel la carte doit s'afficher et les options
                var carte = new google.maps.Map(document.getElementById("carte"), options);
            }
        </script>


        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="multipage not-front" onload="initialiser()">

        <div id="load"></div>

        <div id="main">

            <div id="top1">
                <div class="top1_wrapper">
                    <div class="container">

                        <div class="top1 clearfix">

                            <div class="call1">Appeler aujourd'hui <span>05 63 66 61 16</span></div>

                            <div class="social_txt">Suivez-nous:</div>

                            <div class="social_wrapper">
                                <ul class="social clearfix">
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-wordpress"></i></a></li>
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                                    <li><a href="#"><i class="fa fa-instagram"></i></a></li>

                                </ul>
                            </div>

                        </div>

                    </div>
                </div>

                <div class="top2_wrapper" id="top2">
                    <div class="container">

                        <div class="top2 clearfix">

                            <header>
                                <div class="logo_wrapper">
                                    <a href="index.html" class="logo scroll-to">
                                        <img src="images/logomicroetservicesfinal.png" alt="" class="img-responsive">
                                    </a>
                                </div>
                            </header>

                            <div class="navbar navbar_ navbar-default">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <div class="navbar-collapse navbar-collapse_ collapse">
                                    <ul class="nav navbar-nav sf-menu clearfix">
                                        <li><a href="/microetservices-web/accueil">Accueil</a></li>
                                        <li class="sub-menu sub-menu-1"><a href="/microetservices-web/services">services<em></em></a>
                                            <ul>           
                                                <li><a href="/microetservices-web/servicesEntreprise">services pour l'entreprise</a></li>
                                                <li><a href="/microetservices-web/servicesParticulier">services pour le particulier</a>          
                                            </ul>
                                        </li>  

                                        <li class="sub-menu sub-menu-1"><a href="/microetservices-web/produits">produits<em></em></a>
                                            <ul>
                                                <li><a href="/microetservices-web/integration">Integration</a></li>
                                                <li><a href="/microetservices-web/peripheriques">Périphériques</a></li>
                                                <li><a href="/microetservices-web/multimedia">Multimédia</a></li>
                                                <li><a href="/microetservices-web/systemes">Systèmes</a></li>
                                                <li><a href="/microetservices-web/reseaux">Réseaux</a></li>
                                                <li><a href="/microetservices-web/accessoires">Accéssoires</a></li>
                                                <li><a href="/microetservices-web/connectiques">Connectiques</a></li>

                                            </ul>
                                        </li>


                                        <li><a href="/microetservices-web/portfolio">portfolio</a></li>    
                                        <li><a href="/microetservices-web/contact">contact</a></li>
                                    </ul>
                                </div>
                            </div>



                        </div>

                    </div>
                </div>

            </div>

            <div id="header">
                <div class="container">
                    <div class="header_wrapper">
                        <div class="page_title">Contact</div>
                        <img class='newparallax' alt='newparallax' src='images/gadgets.png' data-speed='-200' data-sizemode='nostretch' data-position='left'/>
                    </div>
                </div>
            </div>

            <div class="breadcrumbs1_wrapper">
                <div class="container">
                    <div class="breadcrumbs1"><a href="/microetservices-web/index">Accueil</a><span></span> <a href="/microetservices-web/contact">Contact</a><span></span></div>
                    <div class="repair_button"><a href="#" class="btn-default btn2">menu</a></div>
                </div>
            </div>

            <div id="content">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-9">

                            <div class="row">
                                <div class="col-sm-4">

                                    <div class="thumb2">
                                        <div class="thumbnail clearfix">
                                            <figure><img src="images/mapContact" alt="" class="img-responsive"></figure>
                                        </div>
                                    </div>

                                </div>
                                <div id='form'></div>        
                                <h2 >Formulaire de contact</h2>        
                                <div class="col-sm-8">

                                    <br>
                                    <div id="fields">
                                        <form id="ajax-contact-form" class="form-horizontal" action="javascript:alert('success!');">
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="inputName">Your Name</label>
                                                        <input type="text" class="form-control" id="inputName" name="name" value="Nom" onBlur="if (this.value == '')
                                                                    this.value = 'Full Name'" onFocus="if (this.value == 'Full Name')
                                                                                this.value = ''">
                                                    </div>
                                                </div>
                                                <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="inputLast">Last Name</label>
                                                        <input type="text" class="form-control" id="inputLast" name="last" value="Prénom" onBlur="if (this.value == '')
                                                                    this.value = 'Last Name'" onFocus="if (this.value == 'Last Name')
                                                                                this.value = ''">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="inputPhone">Phone</label>
                                                        <input type="text" class="form-control" id="inputPhone" name="phone" value="Téléphone" onBlur="if (this.value == '')
                                                                    this.value = 'Phone'" onFocus="if (this.value == 'Phone')
                                                                                this.value = ''">
                                                    </div>
                                                </div>
                                                <div class="col-sm-6">
                                                    <div class="form-group">
                                                        <label for="inputEmail">Email</label>
                                                        <input type="text" class="form-control" id="inputEmail" name="email" value="E-mail" onBlur="if (this.value == '')
                                                                    this.value = 'E-mail address'" onFocus="if (this.value == 'E-mail address')
                                                                                this.value = ''">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <div class="form-group">
                                                        <label for="inputMessage">Your Message</label>
                                                        <textarea class="form-control" rows="5" id="inputMessage" name="content" onBlur="if (this.value == '')
                                                                    this.value = 'Message'"
                                                                  onFocus="if (this.value == 'Message')
                                                                              this.value = ''">Message</textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            
                                            <button type="submit" class="btn-default btn-cf-submit">Envoyer</button>
                                        </form>
                                    </div>
                                    
                                    <div id='plan'></div>
                                    <h2>Le plan d'accés</h2>

                                    <div id="carte" style="width:100%; height:100%"></div>


                                    <br>
                                    <br>
                                    <div id='horaires'></div>
                                    <h2>Horaires d'ouverture du magasin</h2>

                                    <table>
                                        <th>Lundi</th>
                                        <tr>
                                            <td>08H00 - 12H00 * 14H00 - 18H00</td>
                                        </tr>
                                        <th>Mardi</th>
                                        <tr>
                                            <td>    08H00 - 12H00 * 14H00 - 18H00</td>
                                        </tr>
                                        <th>Mercredi</th>
                                        <tr>
                                            <td>    08H00 - 12H00 * 14H00 - 18H00</td>
                                        </tr>
                                        <th>Jeudi</th>
                                        <tr>
                                            <td>    08H00 - 12H00 * 14H00 - 18H00</td>
                                        </tr>
                                        <th>Vendredi</th>
                                        <tr>
                                            <td>    08H00 - 12H00 * 14H00 - 17H00</td>
                                        </tr>

                                    </table> 

                                    <br>


                                    <p>
                                        <a href="#" class="btn-default btn0">menu</a>
                                    </p>




                                </div>
                            </div>

                        </div>
                        <div class="col-sm-3">
                            <div class="sidebar">
                                <ul class="ul2">
                                    <li><a href="#form">Formulaire de contact</a></li>
                                    <li><a href="#plan">Plan d'accés</a></li>
                                    <li><a href="#horaires">Horaires</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div id="more1">
                <div class="container">

                    <h2>Micro & services - Toujours à votre écoute</h2>

                    <div class="title2">Le service est notre métier</div>

                    <p>
                        Ne cherchez plus nous avons sûrement la solution à votre problème. Micro et services nous sommes là pour vous. 
                    </p>

                </div>
            </div>

            <div id="more2">
                <div class="container">
                    <div class="icons">
                        <div class="row">
                            <div class="col-sm-4">
                                <div class="icon1 clearfix">
                                    <a href="#">
                                        <figure><img src="images/ic1.png" alt=""></figure>
                                        <div class="caption">
                                            <div class="txt1">PC</div>
                                            <div class="txt2">Maintennance, mis à jour de composants, offre logicielle</div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="icon1 clearfix">
                                    <a href="#">
                                        <figure><img src="images/ic2.png" alt=""></figure>
                                        <div class="caption">
                                            <div class="txt1">Ipad, téléphone mobile</div>
                                            <div class="txt2">Nous pouvons remplacer un écran d'ipad. Paramétrer un téléphone mobile</div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                            <div class="col-sm-4">
                                <div class="icon1 clearfix">
                                    <a href="#">
                                        <figure><img src="images/ic3.png" alt=""></figure>
                                        <div class="caption">
                                            <div class="txt1">Informatique d'entreprise</div>
                                            <div class="txt2">Routeur, câblage, serveur et logiciels pour l'entreprise, nous sommes en mesure de répondre à vos attentes</div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="bot1">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="logo2_wrapper">
                                <a href="index.html" class="logo2 scroll-to">
                                    <img src="images/logomicroetservicesfinal.png" alt="" class="img-responsive">
                                </a>
                            </div>
                        </div>
                        <div class="col-sm-9">
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="bot1_block">
                                        <div class="bot1_title">Micro et Services</div>
                                        120 Avenue Marceau Hamecher<br>82000 Montauban
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="bot1_block">
                                        <div class="bot1_title">Numéro de téléphone</div>
                                        05 63 66 61 16<br>05 81 04 17 20
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="bot1_block">
                                        <div class="bot1_title">E-mail </div>
                                        <a href="mailto:sav@microetservices.fr">sav@microetservices.fr</a><br>
                                    </div>
                                </div>
                            </div>

                            <div class="copyright">Copyright 2016. Micro et services, tous droits réservés .     <span>|</span>      <a href="#">Mentions légales</a>     <span>|</span>      <a href="#">termes d'utilisation</a></div>
                        </div>
                    </div>
                </div>
            </div>








        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>