
function loadImages(thePerson) {
  
  var userSelection=document.getElementById("userId").value; 
  var  baseUrl= "http://localhost:8080/"
  var  userUrl =baseUrl + userSelection;

  console.log(userUrl);

  var xhttp;
  xhttp=new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (xhttp.readyState === 4 && xhttp.status === 200) {
      //document.getElementById("demo").innerHTML = xhttp.responseText;
      console.log('\n\n\n');
 

      var jsonData = JSON.parse(xhttp.responseText);
      console.log(jsonData.length);
      var outPut = "<ul>";
      for (var prop in jsonData) {
        var theIntterJsonData = jsonData[prop];
        
        //console.log(theIntterJsonData.url);
        console.log("The inner data:  " + theIntterJsonData.url);

        outPut += "<h3>" + theIntterJsonData.description + "</h3>" + 
         " <p> <img height=500 width=500 src=" + baseUrl +"/images/" + theIntterJsonData.url + " title = " + theIntterJsonData.description + "> </img> </p>";
      }

      document.getElementById("demo1").innerHTML = outPut;

    }
  };
  xhttp.open("GET", userUrl, true);
  xhttp.send();
  
}