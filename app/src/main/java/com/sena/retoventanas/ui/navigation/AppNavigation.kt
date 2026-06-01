package com.sena.retoventanas.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sena.retoventanas.ui.screens.ConfirmationScreen
import com.sena.retoventanas.ui.screens.DetailScreen
import com.sena.retoventanas.ui.screens.DetalleReservaScreen
import com.sena.retoventanas.ui.screens.HomeScreen
import com.sena.retoventanas.ui.screens.ListBookScreen
import com.sena.retoventanas.ui.screens.MisReservasScreen
import com.sena.retoventanas.ui.screens.RenovarScreen

@Composable
fun AppNavigation(modifier: Modifier){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home",
    ){
        composable(route = "home"){
            HomeScreen(navController)
        }
        composable(route = "listBook"){
            ListBookScreen(navController)
        }
        composable(
            route = "detail/{nombre}/{intImage}/{autor}/{descripcion}/{categoria}",
            arguments = listOf(
                navArgument("nombre") { type = NavType.StringType },
                navArgument("intImage") { type = NavType.IntType },
                navArgument("autor") { type = NavType.StringType },
                navArgument("descripcion") { type = NavType.StringType },
                navArgument("categoria") { type = NavType.StringType }
            )
        ){ backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            val intImage = backStackEntry.arguments?.getInt("intImage") ?: 0
            val autor = backStackEntry.arguments?.getString("autor") ?: ""
            val descripcion = backStackEntry.arguments?.getString("descripcion") ?: ""
            val categoria = backStackEntry.arguments?.getString("categoria") ?: ""
            DetailScreen(navController, nombre, intImage, autor, descripcion, categoria)
        }
        composable(
            route = "confirmation/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
            ){ backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre")?:""
            ConfirmationScreen(navController, nombre)
        }
        composable (route ="reserva"){
            MisReservasScreen(navController)
        }
        composable(
            route = "renovar/{fecha}",
            arguments = listOf(navArgument("fecha") { type = NavType.StringType })
        ){ backStackEntry ->
            val fecha = backStackEntry.arguments?.getString("fecha") ?: ""
            RenovarScreen(navController, fecha)
        }
        composable(
            route = "detalle/{nombre}/{autor}/{Nimage}/{fecha}",
            arguments = listOf(
                navArgument("nombre") { type = NavType.StringType },
                navArgument("autor") { type = NavType.StringType },
                navArgument("Nimage") { type = NavType.IntType },
                navArgument("fecha") { type = NavType.StringType }
            )
        ){ backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""
            val autor = backStackEntry.arguments?.getString("autor") ?: ""
            val Nimage = backStackEntry.arguments?.getInt("Nimage") ?: 0
            val fecha = backStackEntry.arguments?.getString("fecha") ?: ""
            DetalleReservaScreen(navController, nombre, autor, Nimage, fecha)
        }
    }
}