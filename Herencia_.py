class Vehiculo:
    def __init__(self, fecha_fabricacion, vin_chasis, vin_motor):
        self.fecha_fabricacion = fecha_fabricacion
        self.vin_chasis = vin_chasis
        self.vin_motor = vin_motor

    def get_fecha_fabricacion(self):
        return self.fecha_fabricacion

    def get_vin_chasis(self):
        return self.vin_chasis

    def get_vin_motor(self):
        return self.vin_motor



class Automovil(Vehiculo):
    def __init__(self, fecha_fabricacion, vin_chasis, vin_motor, marca, modelo, precio):
        super().__init__(fecha_fabricacion, vin_chasis, vin_motor)
        self.marca = marca
        self.modelo = modelo
        self.precio = precio

    def get_marca(self):
        return self.marca

    def get_modelo(self):
        return self.modelo

    def get_precio(self):
        return self.precio

    def mostrar_datos(self):
        print("Datos del Automóvil:")
        print(f"Fecha de Fabricación: {self.get_fecha_fabricacion()}")
        print(f"VIN del Chasis: {self.get_vin_chasis()}")
        print(f"VIN del Motor: {self.get_vin_motor()}")
        print(f"Marca: {self.get_marca()}")
        print(f"Modelo: {self.get_modelo()}")
        print(f"Precio: ${self.get_precio()}")


if __name__ == "__main__":
    auto = Automovil("2012-10-23", "1JFJSNJ4K3MMFMDD", "1JFJSNJ4K3MMFMDD", "FORD", "XL", 5400000)
    auto.mostrar_datos()
