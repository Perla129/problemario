//Ingresar valores por teclado y acumularlos en una variable detener el proceso
//cuando la suma supere los 78500, al final imprimir el resultado.

fun main() {
    var suma = 0
    var valor: Int

    do {
        print("Ingrese un valor (o 0 para terminar): ")
        valor = readLine()!!.toInt()
        suma += valor
    } while (suma <= 78500)

    println("La suma total es: $suma")
}