

class Telefono(
    val numero:String,
    val modelo: String,
    val pin: String,
):EncendidoApagado,DispositivoElectronico {
    init{
        require(pin.length == 4 && pinValido(pin)){"El pin tiene que ser de 4 digitos"}
    }

    private fun pinValido(pinIngresado:String):Boolean{
        for(caracter in pinIngresado){
            if(!caracter.isDigit()){
                return false
            }
        }
        return true
    }
    override fun encender() {
        println("Android")
        Thread.sleep(250)
        var continuar = true

        do {
            var pinIngresado: String? = null
            var intentos = 0

            do {
                pinIngresado = pedirPin()
                intentos++
            } while (pinIngresado == null && intentos != 5)

            if(pin == pinIngresado){
                continuar = false
            }

            else{
                println("Intentos agotados, vuelve más tarde")
                Thread.sleep(350)
            }
        }while(continuar == true)

        println("¡Bienvenido de vuelta!")
    }

    override fun apagar() {
        println("Apagando...")
        repeat(50) { println(" ") }
    }

    override fun reiniciar() {
        println("Reiniciando...")
        repeat(50) { println(" ") }
        encender()
    }

    fun mostrarInfoTelefono(){
        println("Número: $numero Modelo:$modelo")
    }

    private fun pedirPin():String?{
        var opcionValida = false
        var pinIngresado = ""
            do{
            println("Dime tu pin")
            try{
                pinIngresado = readln()
                if(pinIngresado.toString().length != 4){
                    println("¡El pin ingresado no tiene 4 caracteres! Vuelve a introducir")
                }
                if(!pinValido(pinIngresado)){
                    println("El pin ingresado no es un pin válido. Vuelve a introducir.")
                }
                else{
                    opcionValida = true
                }
            }catch(e: IllegalArgumentException){
                println("Error, pin inválido. Vuelva a introducir.")
            }
        }while(!opcionValida)
        if(pin == pinIngresado){
            return pinIngresado
        }
        else{
            return null
        }
    }
}