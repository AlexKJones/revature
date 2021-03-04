let x = prompt("Enter a first number to add:");
let y = prompt("Enter a second number to add:");

console.log('x is ', x)
console.log('y is ', y)

function peanoAddition(x, y) {
  if (x > 0 && y > 0){
    for (let i = 0; x > 0; i++){
      x--
      y++
      if (x == 0){
        return y
    }
  }
    if (x == 0){
      return y
    } else
    if (y == 0){
      return x
    } else
    if (x < 0){
      for (let i = 1; 0 > x; i++){
        x++
        if (x == 0){
          return y - i
    }}} else
    if (y < 0){
      for (let i = 1; 0 > y; i++){
        y++
        if (y == 0){
          return x - i
    }}}
}}

console.log(peanoAddition(x, y))
alert('solution is ' + peanoAddition(x, y))
