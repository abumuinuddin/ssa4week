var min=1;
var max=3
var userChoice=0;
var computerChoice=0;

var rockPaperScissor ={Rock: 1, Paper :2, Scissor :3 };


//1 Prompt the user to enter rock, paper, or scissors
//2 Randomly get computer's selection
//3 Display winnter or tie

alert('Rock Paper Scissor Game');
var name = prompt ('Enter your name');


do {
	
	userChoice= prompt ('Please Enter your choices: \n 1. Rock \n 2. Paper \n 3. Scissors');
	userChoice = parseInt(userChoice);
	console.log('you win');

} while (userChoice !== 1 && userChoice !==2  && userChoice !==3)

computerChoice= getRandomInt(min, max);

console.log('Computer\'s choice: ' + computerChoice);
//console.log('User\'s choice: ' + userChoice);



if (userChoice == computerChoice)
		    {
		       console.log( "It is a draw!");
		    }
		    
		    if (userChoice == 1)
		    {
		        if (computerChoice == 3)
		        {
		             console.log( "You win.");
		        } else {
		            console.log( "The computer win. Try again.");
		        }
		        
		    } else if (userChoice == 2) {
		        
		        if (computerChoice == 1)
		        {
		             console.log( "You win." );
		        } else if(computerChoice==3) {
		            console.log( "The computer win. Try again." );
		        }
		        
		    } else if (userChoice == 3) {
		      
		        if (computerChoice == 3)
		        {
		            console.log( "The computer win. Try again.");
		        }else{
		            console.log( "You win.");
		        }
		    }


// Returns a random integer between min (included) and max (excluded)
// Using Math.round() will give you a non-uniform distribution!
function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min)) + min;
}