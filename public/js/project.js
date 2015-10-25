var toggle = true;

$('#refresh-proj').click(function() { 
  console.log("mega");
  $.get('/api/find', function (data) {
    console.log(data);

    $('#proj-title').text(data.name);
    $('#proj-description').text(data.desc);
  });
});

$('#near-project').click(function(){
    console.log("find project near you");
    $.get('/api/find', function( data ){
        console.log(data);
    });

});


