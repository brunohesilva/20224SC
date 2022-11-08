function preview( html )
{
    var doc = $("#preview")[0].contentWindow.document
    var body = $('body',doc)
    body.html( html );    
}