def menu():
    personas = []

    while True:
        print("Menú:")
        print("1. Crear persona")
        print("2. Eliminar persona")
        print("3. Listar personas")
        print("4. Buscar persona")
        print("0. Salir")
        opcion = input("Selecciona una opción: ")

        if opcion == '1':
            nombre = input("Ingrese el nombre de la persona: ")
            personas.append(nombre)
            print("Lista actual:", personas)
        elif opcion == '2':
            print("Lista actual de personas:", personas)
            try:
                indice = int(input("Ingrese el índice de la persona a eliminar: "))
                if 0 <= indice < len(personas):
                    personas.pop(indice)
                    print("Lista actual:", personas)
                else:
                    print("Índice no válido.")
            except ValueError:
                print("Índice no válido. Debe ingresar un número entero.")
        elif opcion == '3':
            print("Lista de personas:", personas)
        elif opcion == '4':
            nombre = input("Ingrese el nombre de la persona a buscar: ")
            if nombre in personas:
                print("Persona encontrada.")
            else:
                print("Persona no encontrada.")
        elif opcion == '0':
            print("Saliendo...")
            break
        else:
            print("Opción no válida.")

if __name__ == "__main__":
    menu()
