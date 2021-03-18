
let word = prompt("Welcome to Hangman! Player 1, please enter a word for Player2 to guess.").toUpperCase();
let count = 0
let guessess = 0
let repeat = 0

let revealedLetters = new Array(word.length); 

revealedLetters.fill(false);

const maxStrikes = 6; 
let strikes = 0; // the number of incorrect guesses made so far

let strikeLetters = new Array(maxStrikes); // this will contain every letter
 // that has been incorrectly guessed.
 let reveal = []
 for (let i = 0; i < word.length; i++){
   reveal.push("-")
 }
 drawWordProgress(); 
function drawStrikeLetters() {
    // using the if (not success) in my process guess to accomplish this.
}

// Manipulates the DOM to write the successfully guessed letters of the word,
 // replacing them with dashes if not yet guessed
function drawWordProgress() {
    
    let rev = document.createElement("b")
    
    rev.innerHTML = reveal
    document.getElementById("revLetters").appendChild(rev)
}
function drawWordNewProgress() {
    let rev = document.createElement("b")
    rev.innerHTML = reveal
    // bah and kah are used to address excess nodes in revLetters
    bah = document.getElementById("revLetters")
    kah = bah.childNodes
    while (kah.length > 1) {
      document.getElementById("revLetters").removeChild(bah.childNodes[0])
    }
    
    document.getElementById("revLetters").removeChild(bah.childNodes[0])
    document.getElementById("revLetters").appendChild(rev)
}
// Function to display current gallows img
function drawGallows() { 
    // your DOM manipulation code here 
    // should update an <img> element in the appropriate hangman.html
     // section to point to "images/strike-"+strikes+".png"
     // document.getElementById('gallows').createElement(<img src="images/strike-"+strikes+".png" alt="Gallows image" height="42" width="42">)
   document.getElementById('gallow').setAttribute("src", "images/strike-"+strikes+".png")
}

function processGuess(){
  if (count < word.length && strikes < 6) {
  event.preventDefault();
  let userValue = document.getElementById("letter").value
  userValue = userValue.toUpperCase()
  
  let newGuess = document.createElement("b")
  newGuess.innerHTML = userValue + " "
  
  if (userValue.length > 1){
    alert("Please just one letter at a time, please")
    document.getElementById("letter").value=("")
    return
  }
  
  document.getElementById("guesses").appendChild(newGuess)
  document.getElementById("letter").value=("")
  console.log(word)
  console.log(word.length)
  let success = false
  if (strikes < maxStrikes) {
    // iterate through each letter in word and change success to true
    // if good guess
    repeat = 0
    guessess = 0
      for (let i = 0; i < word.length; i++){
        if (userValue === word[i]){
        repeat = repeat + 1
        reveal[i] = userValue
        success = true
        count++
        drawWordNewProgress()
      }
      // if successful guess
      if (success === true){
        guessess++
      }
      // increase strikes if not a successful guess
    } 
    
    if (success === false) {
      document.getElementById("wrong").appendChild(newGuess)
      strikes = strikes + 1
    }
      drawGallows()
      console.log(strikes)
      if (count === word.length){
        alert("You win!")
        alert("Refresh page to play again!")
      }
  } else
      alert("The game is over!"); 
} else {
  alert("Hey, The game is over! Lets play again!")
}
}
drawGallows()
let form = document.getElementById("getInput")
form.addEventListener("submit", processGuess)
