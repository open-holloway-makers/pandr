var toggle = true;

$('#theDiv').click(function() { 
  if (toggle) {
    $('#theDiv').css('background-color', 'green'); 
  } else {
    $('#theDiv').css('background-color', 'orange');
  }
  toggle = !toggle;
});

$('#login-button').click(function() {
  var username = $('#username-input').val();
  if (username) {
    $.get('/api/login?username=' + username, function(data) {
      if (data === true) {
        window.location.replace("/list");
      }
    });
  }
});

$('#test-button').click(function() {
  $.get('/api/test', function(data) { 
    console.log(data);
  });
});
