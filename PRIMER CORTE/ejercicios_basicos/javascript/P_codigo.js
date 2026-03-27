/*import prompt from 'prompt';

    var nombre = prompt("Ingrese su nombre: ");
    var edad = parseInt("Ingrese su edad: ");
    var esEStudiante = prompt("Eres estudiante? (si/no) ");
    var diaSemana = prompt("Ingrese el dia de la semana: ");;
    var tieneCuponDescuento = prompt("Tienes cupon de descuento? (si/no) ");

const tarifaBase = 40000;

function calcularPrecio(){
    if (edad<5){
        let precioFinal = 0;
    }else if (edad >5 && edad <= 12){
        let descuento = tarifaBase * 0.5;
        let precioFinal = tarifaBase - descuento;
    }else if(edad >= 13 && edad <= 26 && esEStudiante == true){
        let descuento = tarifaBase * 0.3;
        let precioFinal = tarifaBase - descuento;
    }else if(edad>= 60){
        let descuento = tarifaBase * 0.4;
        let precioFinal = tarifaBase - descuento;
}
}*/

var nombre = prompt("Ingrese su nombre: ");
var edad = parseInt(prompt("Ingrese su edad: "));
var esEstudiante = prompt("¿Es estudiante? (SI o NO): ").toLowerCase() === "Si";
var diaSemana = prompt("Ingrese día de la semana:").toLowerCase();
var tieneCuponDescuento = prompt("Tiene cupón? (SI o NO): ").toLowerCase() === "Si";

var tarifaBase = 40000;

var precioFinal;
var categoria = "";

if (edad < 5) {
    precioFinal = tarifaBase * 0;
    categoria = "Niños";
}

else if (edad >= 5 && edad <= 12) {
    precioFinal = tarifaBase * 0.5;
    categoria = "Niños";
}

else if (edad >= 13 && edad <= 26 && esEstudiante) {
    precioFinal = tarifaBase * 0.7;
    categoria = "Joven estudiante";
}

else if (edad >= 60) {
    precioFinal = tarifaBase * 0.6;
    categoria = "Adulto mayor";
}

else {
    precioFinal = tarifaBase;
    categoria = "Adulto";
}

if (diaSemana === "miercoles" && precioFinal > 0) {
    precioFinal = precioFinal * 0.8;
}

if (tieneCuponDescuento && precioFinal > 0) {
    precioFinal = precioFinal * 0.9;
}

alert("Hola " + nombre + ", " +  "categoría: " + categoria + ". " + "Precio final de tu entrada: " + precioFinal);



/*var nombre = "carlos"

if (nombre == "carlos"){
   alert("Bienvenido"+ nombre)}

let helado = "chocolate";

if(helado === "chocolate"){
    alert("SI es un helado de chocolate");
}else{
    alert("NO es un helado de chocolate");
}*/

/*var k = 8;

switch(k){
    case 5:
        alert("El numero es 5");
        break;
    case 8:
        alert("El numero es 8");
        break;
    case 10:
        alert("El numero es 10");
        break;
    default:
        alert("Numero incorrecto");
}*/