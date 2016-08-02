
function domPrompt (){
	var theNewDiv = document.createElement("div");
	theNewDiv.innerHTML = "<p>This is the dynamic content created by the innerHTML property</p>";

	document.body.appendChild(theNewDiv);
}


function domAlert(msg){

	var theNewDiv = document.createElement("div");
	theNewDiv.innerHTML = "<p>This is the dynamic content created by the innerHTML property</p>";
	theNewDiv.style.color='red';
	theNewDiv.setAttribute("class", "alert_class");
	document.body.appendChild(theNewDiv);
}


var promptInputId =  document.getElementById('promptInput');
promptInput.onkeydown = function(evt){
	console.log(evt.key);
	if (evt.key=='Enter'){
		console.log(promptInputId.value);
	}
}

domPrompt ();
domAlert();