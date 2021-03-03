
// let input = prompt("Enter a phrase:");
// 
// console.log(isPalindrome(input));
// 
// function isPalindrome(phrase) {
//     ...
// }

let isAPalindrome = function(input){
  let length = input.length
  let c = 0
  
  while (c <= length/2){
    if (input[c] !== input[length - 1 - c]){
      return false
    } c = c + 1
  } return true
}

prompt = prompt("Enter a Phrase")
console.log(prompt)

if (isAPalindrome(prompt)){
  alert(prompt + " is a palindrome! Refresh to try again.")
} else {
  alert(prompt + " is NOT a palindrome! Refresh to try again.")
}
