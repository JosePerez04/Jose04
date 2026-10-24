import 'package:flutter/material.dart';

class MenuItems {
  final String title;
  final String subtitle;
  final String link;
  final IconData icon;

  const MenuItems({
    required this.title,
    required this.subtitle,
    required this.link,
    required this.icon,
  });
}

const appMenuItems = <MenuItems>[
  MenuItems(
    title: 'Botones',
    subtitle: 'Ejemplos de botones',
    link: '/buttons',
    icon: Icons.smart_button,
  ),
  MenuItems(
    title: 'Tarjetas',
    subtitle: 'Ejemplos de tarjetas',
    link: '/cards',
    icon: Icons.credit_card,
  ),
  MenuItems(
    title: 'Acerca de',
    subtitle: 'Mi información personal',
    link: '/about',
    icon: Icons.person,
  ),
  MenuItems(
    title: 'Iniciar sesión',
    subtitle: 'Formulario de acceso',
    link: '/login',
    icon: Icons.login,
  ),
];