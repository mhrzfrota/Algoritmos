
function quicksort(array) {

    if (array.length <= 1) {
        return array;
    } else {

        const pivot = array[Math.floor(Math.random() * array.length)];


        const menores = [];
        const maiores = [];
        const iguais = [];

        for (let i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                menores.push(array[i]);
            } else if (array[i] > pivot) {
                maiores.push(array[i]);
            } else {
                iguais.push(array[i]);
            }
        }


        const ordenadosMenores = quicksort(menores);
        const ordenadosMaiores = quicksort(maiores);


        return ordenadosMenores.concat(iguais).concat(ordenadosMaiores);
    }
}


var n = parseInt(10);

vetor = [5, 7, 1, 2, 6, 8, 3, 9, 4, 10];
console.log("Dado o Vetor:")
for (var x = 0; x < n; x++) {

    console.log(vetor[x]);

}

console.log("Array original: " + vetor);

const arrayOrdenado = quicksort(vetor);
console.log("Array ordenado: " + arrayOrdenado);
