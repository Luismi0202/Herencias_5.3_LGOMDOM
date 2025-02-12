
fun main(){
    val azulito = Coche("Toyota",50.0)
    azulito.encenderMotor()
    azulito.acelerar(20.0)
    azulito.frenar(10.0)
    azulito.mostrarInformacion()
    println("******************************************")
    Thread.sleep(700)

    val lavadorita = Lavadora("Nosedelavadorasayuda")
    lavadorita.encender()
    lavadorita.agregarDetergente(700)
    lavadorita.agregarRopa(Ropa("Camiseta"))
    lavadorita.agregarRopa(Ropa("Pantalones"))
    lavadorita.limpiarRopa()
    lavadorita.reiniciar()
    println("******************************************")
    Thread.sleep(700)

    val telefonito = Telefono("54435345","Samsung","0390")
    telefonito.encender()
    telefonito.reiniciar()
    telefonito.apagar()
    telefonito.mostrarInfoTelefono()
}