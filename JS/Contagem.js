
var m = parseInt(10);
vetor = [1, 2.2, 4.5, 10, 7, 11.2, 33, 10.2, 5, 3];
console.log("Segue o vetor:")


for (var x = 0; x < m; x++) {
    console.log(vetor[x])
}

var valor = parseInt(0);
for (var x = 0; x < m; x++) {
    if (parseInt(vetor[x]) == vetor[x]) {
        valor = valor + 1;
    }
}


console.log("Existem " + valor + " valores inteiros entre o primeiro dado e " + m);
