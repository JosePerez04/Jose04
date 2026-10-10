void main() {

 
  final persona1 = Persona(
    nombre: 'Jose',
    apellido: 'Perez',
    edad: 22,
  );

  print(persona1);

  
  final Map<String, dynamic> rawJson = {
    'nombre': 'Jose',
    'apellido': 'Perez',
    'edad': 22,
  };

  final persona2 = Persona.fromJson(rawJson);

  print(persona2);

  persona1.saludar();

  
  persona1.mostrarEdad(24);

  
  persona1.despedirse();

  
  persona1.mostrarNombre('David');
}


class Persona {

  String nombre;
  String apellido;
  int edad;

  
  Persona({
    required this.nombre,
    required this.apellido,
    required this.edad,
  });

  
  Persona.fromJson(Map<String, dynamic> json)
      : nombre = json['nombre'] ?? 'No name found',
        apellido = json['apellido'] ?? 'No last name found',
        edad = json['edad'] ?? 0;

  
  @override
  String toString() {
    return '$nombre $apellido, edad: $edad';
  }

  
  void saludar() {
    print('Hola, mi nombre es $nombre');
  }

  
  void mostrarEdad(int nuevaEdad) {
    print('La edad es $nuevaEdad años');
  }

  
  void despedirse() => print('Hasta luego');

  
  void mostrarNombre(String nuevoNombre) =>
      print('El nombre es $nuevoNombre');
}
