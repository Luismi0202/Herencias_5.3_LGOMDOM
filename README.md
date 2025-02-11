# Herencias_5.3_LGOMDOM

Crea tres interfaces:

EncendidoApagado con métodos como encender() y apagar().
DispositivoElectronico con un método llamado reiniciar().
Vehiculo con dos propiedades: motorEncendido y kmHora; y los métodos acelerar(Int) y frenar(Int).
Implementa estas interfaces en varias clases como Telefono, Lavadora y Coche. Cada clase debería tener su propia implementación de los métodos de las interfaces que tengan sentido que implementen, simulando el comportamiento que le obligan a desarrollar a cada una.

Un coche solo acelera y frena si tiene el motor encendido. Por defecto un objeto coche estará apagado. Si a un coche le mandamos frenar y su valor final fuera negativo le asignaremos a kmHora el valor 0.
