var toggle = true;

$('#refresh-proj').click(function() { 
  console.log("mega");
  $.get('/api/find', function (data) {
    console.log(data);

    $('#proj-title').text(data.name);
    $('#proj-description').text(data.desc);
  });
});


