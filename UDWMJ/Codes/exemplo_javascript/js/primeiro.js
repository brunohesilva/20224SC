document.write("Vamos contar");

for (i = 1; i <= 10; i++){
    document.write("Contando "+ i + "<br>");
}

function somaDois(x, y) {
    return x + y;
}

let resultado = somaDois(2, 2);
console.log(resultado)

var somaDois = function(x, y){
    return x + y;
}

var resultado2 = somaDois(1, 5);
console.log(resultado2)