//Realizar un algoritmo para determinar el sueldo de un empleado, teniendo en
//cuenta que si trabajo menos de 5 años la entigüedad sera del 30% y si trabajo igual o
//mas de 5 años del 50%. Sueldoacobrar = sueldo + (sueldo * %)

fun main () {

    val years_trabajados = readln().toInt()
    val salary = readln().toInt()
    val porcentaje = 0

    if (years_trabajados<5){
        porcentaje = 0.30
    }
    else if (years_trabajados>5){
        porcentaje = 0.50
    }
    val salario_cobrar = salary + (salary * porcentaje)
    println(salario_cobrar)
}
