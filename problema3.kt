//Ingresar la calificacion del examen de programación y si es mayor o igual a siete decir
// que aprobo, sino que debe recuperar

fun main () {
    var cal1 = readln().toInt()
    if (cal1 >=7){
        println("aprobo")
    }
    else if (cal1 <7){
        println("recuperar")
    }
}
