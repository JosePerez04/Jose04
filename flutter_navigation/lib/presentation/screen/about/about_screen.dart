import 'package:flutter/material.dart';

class AboutScreen extends StatelessWidget {
  const AboutScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Acerca de mí'),
      ),
      body: Center(
        child: ListView(
          padding: const EdgeInsets.all(20),
          children: const [
            CircleAvatar(
              radius: 45,
              child: Icon(
                Icons.person,
                size: 55,
              ),
            ),
            SizedBox(height: 20),
            Text(
              'José David Cogollo Perez',
              textAlign: TextAlign.center,
              style: TextStyle(
                fontSize: 22,
                fontWeight: FontWeight.bold,
              ),
            ),
            SizedBox(height: 20),
            ListTile(
              leading: Icon(Icons.school),
              title: Text('Programa académico'),
              subtitle: Text('Ingeniería de Sistemas'),
            ),
            ListTile(
              leading: Icon(Icons.email),
              title: Text('Correo electrónico'),
              subtitle: Text('josedavid.cogollo2026@gmail.com'),
            ),
            ListTile(
              leading: Icon(Icons.computer),
              title: Text('Proyecto'),
              subtitle: Text('Sistema de Gestión Académica'),
            ),
          ],
        ),
      ),
    );
  }
}