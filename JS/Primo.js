
function isPrime(number) {
  if (number <= 1) {
    return false;
  }

  for (let i = 2; i < number; i++) {
    if (number % i === 0) {
      return false;
    }
  }

  return true;
}

var numero = 17;
console.log("Dado o numero "+numero);
if (isPrime(numero)) {
  console.log("É primo")
} else {
  console.log("Não é primo")
}
