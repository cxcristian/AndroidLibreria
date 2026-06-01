package com.sena.retoventanas.ui.sections.MisReservaSection

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.sena.retoventanas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MisReservaSection(navController: NavController){
    val libros = listOf(
        listOf<Any>(
            "No tengo boca y debo gritar",
            R.drawable.no_tengo_boca,
            "Harland Ellison",
            "Relato oscuro y perturbador de ciencia ficción",
            "Ciencia Ficción"
        )
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.menu),
                            contentDescription = "Menú",
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Mis Reservas",
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.book2),
                            contentDescription = "Reservas",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(12.dp))

            Row (modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.pila_libros),
                    contentDescription = "",
                    modifier = Modifier.size(20.dp).align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Lista de reservas activas",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            libros.forEach { libro ->
                val nombre = libro[0] as String
                val imagen = libro[1] as Int
                val autor = libro[2] as String

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),

                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.Top
                        ) {
                            Image(
                                painter = painterResource(id = imagen),
                                contentDescription = nombre,
                                modifier = Modifier.size(100.dp)
                            )

                            Spacer(modifier = Modifier.width(12.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Libro:",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = Color.Black
                                )
                                Text(
                                    text = nombre,
                                    fontSize = 14.sp,
                                    color = Color.Black
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Fecha:",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = Color.Black
                                )
                                Text(
                                    text = "12/05/2026",
                                    fontSize = 14.sp,
                                    color = Color.Black
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Estado:",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.sp,
                                    color = Color.Black
                                )

                                Spacer(modifier = Modifier.height(4.dp))

                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = Color(0xFFE8F5E9),
                                    border = BorderStroke(1.dp, Color(0xFF4CAF50))
                                ) {
                                    Text(
                                        text = "Activa",
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                                        color = Color(0xFF4CAF50),
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Button(
                            onClick = { navController.navigate("Detalle/$nombre/$imagen/$autor") },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF9C27B0)
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.view),
                                contentDescription = "",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Ver reserva",
                                color = Color.White,
                                fontSize = 16.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))
            }

            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                color = Color(0x1A9C27B0)
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.information),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Aqui veras todas tus reservas activas",
                        color = Color(0xFF9C27B0),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MisReservaSectionPreview() {
    MisReservaSection(navController = NavController(androidx.compose.ui.platform.LocalContext.current))
}