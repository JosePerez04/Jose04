import 'package:flutter/material.dart';

class CardsScreen extends StatelessWidget {
  const CardsScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Tarjetas'),
      ),
      body: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          Card(
            child: ListTile(
              leading: const Icon(Icons.person),
              title: const Text('Tarjeta de perfil'),
              subtitle: const Text('Información de una persona'),
            ),
          ),
          Card(
            child: ListTile(
              leading: const Icon(Icons.school),
              title: const Text('Tarjeta académica'),
              subtitle: const Text('Información de los estudios'),
            ),
          ),
          Card(
            child: ListTile(
              leading: const Icon(Icons.notifications),
              title: const Text('Notificaciones'),
              subtitle: const Text('Aquí aparecen los avisos'),
            ),
          ),
          Card(
            child: ListTile(
              leading: const Icon(Icons.computer),
              title: const Text('Proyecto'),
              subtitle: const Text('Sistema de Gestión Académica'),
            ),
          ),
        ],
      ),
    );
  }
}