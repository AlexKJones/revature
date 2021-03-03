let x = prompt("Enter a number to test as a prime number:");
let result = isPrime(x, 2);

if (result)
    alert(x+ " is prime!");
else
    alert(x+ " is not prime");

function isPrime(number, divisor) {
  if (number == 1)
      return false;
  if (number == 2)
      return true;
  if (number < 0)
      return false;
  for (let i = 2; i < number; i ++){
    if (number % i === 0)
        return false
  }
  return true
}
