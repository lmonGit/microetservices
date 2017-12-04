//

/*----------------------------------------------------*/
/* MOBILE DETECT FUNCTION
/*----------------------------------------------------*/
var isMobile = {
    Android: function() {
        return navigator.userAgent.match(/Android/i);
    },
    BlackBerry: function() {
        return navigator.userAgent.match(/BlackBerry/i);
    },
    iOS: function() {
        return navigator.userAgent.match(/iPhone|iPad|iPod/i);
    },
    Opera: function() {
        return navigator.userAgent.match(/Opera Mini/i);
    },
    Windows: function() {
        return navigator.userAgent.match(/IEMobile/i);
    },
    any: function() {
        return (isMobile.Android() || isMobile.BlackBerry() || isMobile.iOS() || isMobile.Opera() || isMobile.Windows());
    }
};



/////////////////////// ready
$(document).ready(function() {
  /*----------------------------------------------------*/
  // Newparallax.
  /*----------------------------------------------------*/
  $(".newparallax").each(function() {
      $(this).jnewparallax();
  });

  /*----------------------------------------------------*/
  // Owl slider.
  /*----------------------------------------------------*/
  var owl = $("#owl-carousel");
  owl.owlCarousel({
    autoPlay : 8000,
    mouseDrag : false,
    touchDrag : false,
    navigationText : false,
    navigation : true,
    singleItem : true,
    transitionStyle : "fade"
  });

  // touchTouch
  var o = $('.thumb0 .thumbnail a');
  if (o.length > 0) {
    o.touchTouch();
  }


  /*----------------------------------------------------*/
  // carouFredSel.
  /*----------------------------------------------------*/
  var o = $('#banner .carousel.main ul');
  if (o.length > 0) {
    o.carouFredSel({
      auto: {
        timeoutDuration: 8000
      },
      responsive: true,
      prev: '.banner_prev',
      next: '.banner_next',
      width: '100%',
      scroll: {
        // fx : "crossfade",
        items: 1,
        duration: 1000,
        easing: "easeOutExpo"
      },
      items: {
            width: '330',
        height: 'variable', //  optionally resize item-height
        visible: {
          min: 1,
          max: 4
        }
      },
      mousewheel: false,
      swipe: {
        onMouse: true,
        onTouch: true
        }
    });
  };

  $(window).bind("resize",updateSizes_vat).bind("load",updateSizes_vat);
  function updateSizes_vat(){
    $('#banner .carousel.main ul').trigger("updateSizes");

  }
  updateSizes_vat();


  /*----------------------------------------------------*/
  // Fixed headerbar.
  /*----------------------------------------------------*/
  var doc     = $(document),
      header  = $('#top1');

  doc.on('scroll', function(){

      if(doc.scrollTop() > 100){
          header.addClass('headerbar-small');
      } else{
          header.removeClass('headerbar-small');
      }

  });

  /*----------------------------------------------------*/
  // PRELOADER CALLING
  /*----------------------------------------------------*/
  $("body.onepage").queryLoader2({
      //barColor: "#fff",
      //backgroundColor: "#000",
      percentage: true,
      barHeight: 3,
      completeAnimation: "fade",
      minimumTime: 200
  });



	/*----------------------------------------------------*/
	// PARALLAX CALLING
	/*----------------------------------------------------*/
	$(window).bind('load', function () {
		parallaxInit();
	});
	function parallaxInit() {
		testMobile = isMobile.any();

		if (testMobile == null)
		{
			$('.parallax .bg1').addClass("bg-fixed").parallax("50%", 0.5);
      $('.parallax .bg2').addClass("bg-fixed").parallax("50%", 0.5);
      // $('.parallax .bg3').addClass("bg-fixed").parallax("50%", 0.5);
      // $('.parallax .bg4').addClass("bg-fixed").parallax("50%", 0.5);
		}
	}
	parallaxInit();




  /*----------------------------------------------------*/
  // prettyPhoto
  /*----------------------------------------------------*/
  $("a[rel^='prettyPhoto']").prettyPhoto({animation_speed:'normal',theme:'dark',social_tools:false,allow_resize: true,default_width: 500,default_height: 344});


  /*----------------------------------------------------*/
  // MENU SMOOTH SCROLLING
  /*----------------------------------------------------*/
  $(".navbar_ .nav a, .menu_bot a, .scroll-to").bind('click',function(event){

      //$(".navbar_ .nav a a").removeClass('active');
      //$(this).addClass('active');
      // var headerH = $('#top1').outerHeight();
      var headerH = $('#top1').outerHeight();

      if ($(this).attr("href")=="#home") {
        $("html, body").animate({
          scrollTop: 0 + 'px'
          // scrollTop: $($(this).attr("href")).offset().top + 'px'
        }, {
            duration: 1200,
            easing: "easeInOutExpo"
        });
      }
      else {
        $("html, body").animate({
          scrollTop: $($(this).attr("href")).offset().top - headerH + 'px'
          // scrollTop: $($(this).attr("href")).offset().top + 'px'
        }, {
            duration: 1200,
            easing: "easeInOutExpo"
        });
      }



      event.preventDefault();
  });

  /*----------------------------------------------------*/
  // Appear
  /*----------------------------------------------------*/
  $('.animated').appear(function() {
    // console.log("111111111111");
      var elem = $(this);
      var animation = elem.data('animation');
      if ( !elem.hasClass('visible') ) {
        var animationDelay = elem.data('animation-delay');
        if ( animationDelay ) {
          setTimeout(function(){
              elem.addClass( animation + " visible" );
          }, animationDelay);
        } else {
          elem.addClass( animation + " visible" );
        }
      }
  });

  // Animate number
  $('.animated-number').appear(function() {
    var elem = $(this);
    var b = elem.text();
    var d = elem.data('duration');
    var animationDelay = elem.data('animation-delay');
    if ( !animationDelay ) { animationDelay = 0; }
    elem.text("0");

    setTimeout(function(){
      elem.animate({ num: b }, {
        duration: d,
        step: function (num){
          this.innerHTML = (num).toFixed(0)
        }
      });
    }, animationDelay);
  });









});

/////////////////////// load
$(window).load(function() {

  /*----------------------------------------------------*/
  // LOAD
  /*----------------------------------------------------*/
  //$('#load').fadeOut(2000).remove();
  $("#load").fadeOut( 200, function() {
      $(this).remove();
  });

  /*----------------------------------------------------*/
  // Move to specific location after reload.
  /*----------------------------------------------------*/
  var hashURL = location.hash;
  if(hashURL != "" && hashURL.length > 1 && $('body').hasClass('onepage') ){
    // console.log('qqqqqq');
    var headerH = $('#top1').outerHeight();
    $("html, body").animate({
      scrollTop: $(hashURL).offset().top - headerH + 'px'
    }, {
        duration: 1200,
        easing: "easeInOutExpo"
    });
  }





});