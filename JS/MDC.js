
var a = parseInt(75);
var b = parseInt(45);


const menor = (a < b) ? a : b;


let mdc = menor;

while (mdc > 0) {

    if (a % mdc === 0 && b % mdc === 0) {
        break;
    } else {
        mdc--;
    }
}

console.log("O máximo divisor comum de " + a + " e " + b + " é " + mdc);
