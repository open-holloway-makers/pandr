$('#signup-button').click(function() {
  var username = $('#username-input').val();
  var firstname = $('#firstname-input').val();
  var surname = $('#surname-input').val();
  var email = $('#email-input').val();

  var usernameParam = '?username=' + username;
  var firstnameParam = '&firstname=' + firstname;
  var surnameParam = '&surname=' + surname;
  var emailParam = '&email=' + email;

  if (username) {
    $.post('/api/user/create' + usernameParam + firstnameParam + 
        surnameParam + emailParam, function(data) {
      if (data === true) {
        window.location.replace("/");
      }
    });
  }
});
