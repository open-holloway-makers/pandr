var toggle = true;

$('#theDiv').click(function() { 
  if (toggle) {
    $('#theDiv').css('background-color', 'green'); 
  } else {
    $('#theDiv').css('background-color', 'orange');
  }
  toggle = !toggle;
});
