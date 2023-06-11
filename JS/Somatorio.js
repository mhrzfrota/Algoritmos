
var n = parseInt(5);
vetor = [50,30,26,17,83];
var soma = parseInt(0);
console.log("Dado o vetor:")
for (var x = 0; x < n; x++) {
    console.log(vetor[x]);
}


for (var x = 0; x < n; x++) {
    soma = soma + vetor[x];
}

console.log("O somatório é: " + soma);

