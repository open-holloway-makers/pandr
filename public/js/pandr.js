var toggle = true;

$('#theDiv').click(function() { 
  if (toggle) {
    $('#theDiv').css('background-color', 'green'); 
  } else {
    $('#theDiv').css('background-color', 'orange');
  }
  toggle = !toggle;
});

$('#test-button').click(function() {
  $.get('/test', function(data) { 
    console.log(data);
  });
});
