class Lavadora(
    val marca: String
):DispositivoElectronico,EncendidoApagado{

    private var cantidadDetergente = 0
    private var deposito = mutableListOf<Ropa>()

    fun mostrarInfo(){
        println("Marca: $marca Cantidad de detergente: $cantidadDetergente")
    }

    fun agregarDetergente(cantidadAgregada:Int){
        cantidadDetergente += cantidadAgregada
        println("Cantidad actual de detergente: $cantidadDetergente")
    }

    fun agregarRopa(ropa:Ropa){
        deposito.add(ropa)
        println("Deposito actual: $deposito")
    }

    fun agregarRopa(ropas: MutableList<Ropa>){
        for(ropa in ropas){
            deposito.add(ropa)
        }
        println("Deposito actual: $deposito")
    }

    fun limpiarRopa(){
        if(cantidadDetergente > 500){
        for(ropa in deposito){
            if(ropa.estadoRopa == EstadoRopa.Sucia){
                ropa.estadoRopa = EstadoRopa.Limpia
            }
            deposito.remove(ropa)
        }
        cantidadDetergente -= 500
        }
        else{
            println("No hay suficiente cantidad de detergente (min 500 cl)")
        }
    }

    override fun reiniciar() {
        println("Reiniciando la lavadora...")
        encender()
    }

    override fun encender() {
        println("Encendiendo lavadora...")
    }

    override fun apagar() {
        println("Apagando lavadora...")
        repeat(50) { println(" ") }
    }
}