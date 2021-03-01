let min = 3;
let max = 10;
let target = Math.random() * (max - min + 1); 
target = Math.floor(target) + min;
let guess = 0

console.log(target)
while (guess !== target) {
  guess = prompt('Try to guess the number between 3 and 10!')
  if (guess < 3 || guess > 10) {
    alert('Hey the number has to be between 3 and 10 try again!')
  }  else if (guess < target){
    alert('Incorrect the number is higher than ' + guess)
  } else if (guess > target){
    alert('Incorrect the number is lower than ' + guess)
  } else {
    alert('You did it! the number was ' + guess)
    alert('refresh the page for a new number to guess')
    break
  }
}