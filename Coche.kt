class Coche(
    val marca:String,
    override var kmHora: Double,
    override var motorEncendido: Boolean = false
):Vehiculo{

    override fun acelerar(kilometros: Double) {
        if(motorEncendido){
            kmHora += kilometros
            println("Acelerando... KM/H ACTUAL:$kmHora")
        }
    }
    override fun frenar(kilometros: Double) {
        if(motorEncendido && (kmHora - kilometros) > 0){
            kmHora -= kilometros
            println("Frenando... KM/H ACTUAL:$kmHora")
        }
        else if(motorEncendido){
            kmHora = 0.0
            println("Frenando... KM/H ACTUAL:$kmHora")
        }
    }

    private fun motorEncendido():String{
        return if(motorEncendido){
            "Si"
        } else{
            "No"
        }
    }

    fun encenderMotor(){motorEncendido = true}

    fun mostrarInformacion(){
        println("Marca: $marca KM/H:$kmHora motor encendido: ${motorEncendido()}")
    }

    override fun toString(): String {
        return "Marca: $marca KM/H:$kmHora motor encendido: ${motorEncendido()}"
    }
}