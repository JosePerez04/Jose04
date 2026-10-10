import 'dart:async';
import 'dart:math';

class Pedido {
  int id;
  String nombre;

  Pedido(this.id, this.nombre);
}

class PedidoNoEncontrado implements Exception {
  String mensaje;

  PedidoNoEncontrado(this.mensaje);

  @override
  String toString() => mensaje;
}

class ServicioPedido {
  Map<int, Pedido> pedidos = {
    1: Pedido(1, "Portatil"),
    2: Pedido(2, "Pantalla"),
    3: Pedido(3, "Teclado"),
  };

  Random random = Random();

  Future<Pedido> buscarPedido(int id) async {
    
    await Future.delayed(
      Duration(seconds: 1 + random.nextInt(3)),
    );

    
    if (random.nextBool()) {
      throw Exception("Error de conexion");
    }

   
    if (!pedidos.containsKey(id)) {
      throw PedidoNoEncontrado(
        "No existe el pedido $id",
      );
    }

    return pedidos[id]!;
  }

  Future<void> buscarVariosPedidos(List<int> ids) async {
    var resultados = await Future.wait(
      ids.map((id) async {
        try {
          var pedido = await buscarPedido(id).timeout(
            const Duration(seconds: 2),
          );

          return "Pedido: ${pedido.id} - ${pedido.nombre}";
        } on TimeoutException {
          return "Pedido $id: Tiempo de espera agotado";
        } on PedidoNoEncontrado catch (e) {
          return "Pedido $id: $e";
        } catch (e) {
          return "Pedido $id: Error de conexion";
        }
      }),
    );

    for (var resultado in resultados) {
      print(resultado);
    }

    print("Fin de busqueda");
  }
}

void main() async {
  var servicio = ServicioPedido();

  await servicio.buscarVariosPedidos([1, 2, 5]);
}