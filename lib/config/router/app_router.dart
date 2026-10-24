import 'package:flutter_navigation/presentation/screen/home/home_screen.dart';
import 'package:flutter_navigation/presentation/screen/buttons/buttons_screen.dart';
import 'package:flutter_navigation/presentation/screen/cards/cards_screen.dart';
import 'package:flutter_navigation/presentation/screen/about/about_screen.dart';
import 'package:flutter_navigation/presentation/screen/login/login_screen.dart';
import 'package:go_router/go_router.dart';

final appRouter = GoRouter(
  initialLocation: '/',
  routes: [
    GoRoute(
      path: '/',
      builder: (context, state) => const HomeScreen(),
    ),
    GoRoute(
      path: '/buttons',
      builder: (context, state) => const ButtonsScreen(),
    ),
    GoRoute(
      path: '/cards',
      builder: (context, state) => const CardsScreen(),
    ),
    GoRoute(
      path: '/about',
      builder: (context, state) => const AboutScreen(),
    ),
    GoRoute(
      path: '/login',
      builder: (context, state) => const LoginScreen(),
    ),
  ],
);