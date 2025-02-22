from .animal import Animal
from datetime import datetime

class Ave(Animal):
    def __init__(self, nombre, peso, año_nacimiento, propietario):
        super().__init__(nombre, peso)
        self.año_nacimiento = año_nacimiento
        self.propietario = propietario

    def calcular_edad(self):
        año_actual = datetime.now().year
        return año_actual - self.año_nacimiento

    def __str__(self):
        return f"{super().__str__()}, Año Nacimiento: {self.año_nacimiento}, Propietario: {self.propietario}, Edad: {self.calcular_edad()} años"
