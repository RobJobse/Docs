



$(function () {  // is done when full page is loaded so all the elemnts exist !!

  var $orders = $('#orders'); // cached dom item
  var $nr = $('#nr');
  var $naam = $('#naam');

  $.ajax({
    type: 'GET',
    url: '/typemaps',
    success: function (data) {
      $.each(data, function(i, item){
        $orders.append('<li>nr: '+ item.nr+', naam: '+ item.naam + '</li>')
      });
    },
    error: function(){
    	alert('Error loading typemaps api data !!')
    }
  });

  $("#add-order").click( function() {
    var dataObj = {
        nr: $nr.val(),
        naam: $naam.val()
    };

	  $.ajax({
		    type: 'POST',
		    url: '/typemaps',
		    data: dataObj,
		    success: function (response) {
          $orders.append('<li>nr: '+ response.nr+', naam: '+ response.naam + '</li>')
		    },
		    error: function(){
		    	alert('Error saving dataObject to typemaps api !!')
		    }
	  });
  });

});
