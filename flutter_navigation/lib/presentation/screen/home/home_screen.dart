import 'package:flutter/material.dart';
import 'package:flutter_navigation/config/menu/menu_items.dart';
import 'package:go_router/go_router.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('App Navigation'),
      ), 
      body: ListView.builder(
        itemCount: appMenuItems.length,
        itemBuilder: (context, index) {
          final menuItem = appMenuItems[index];

          return _CustomListTile(menuItems: menuItem);
        },
      ),
    ); 
  }
}

class _CustomListTile extends StatelessWidget {
  final MenuItems menuItems;

  const _CustomListTile({
    required this.menuItems,
  });

  @override
  Widget build(BuildContext context) {
    final colors = Theme.of(context).colorScheme;

    return ListTile(
      leading: Icon(
        menuItems.icon,
        color: colors.primary,
      ),
      trailing: const Icon(
        Icons.arrow_forward_ios_outlined,
      ),
      title: Text(menuItems.title),
      subtitle: Text(menuItems.subtitle),
      onTap: () {
        context.push(menuItems.link);
      },
    ); 
  }
}