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

$('#signup-button').click(function (){
  var username  = $('#username-input').val();
  var firstname = $('#firstname-input').val();
  var lastname  = $('surname-input').val();
  var email     = $('email-input').val();

  if(username){
    $.get('/api/user/create?username=' + username + '&firstName=' + firstname + '&lastName=' + lastname + '&email=' + email, function(data){
      console.log('registered');

      window.location.replace('/login');
    });
  }
});

$('#test-button').click(function() {
  $.get('/api/test', function(data) { 
    console.log(data);
  });
});

