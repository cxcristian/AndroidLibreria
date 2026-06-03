package com.sena.retoventanas.ui.sections.DetalleReserva

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sena.retoventanas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetalleReservaSection(
    navController: NavController,
    nombre: String,
    autor: String,
    Nimage: Int,
    fecha: String
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Image(
                                painter = painterResource(id = R.drawable.arrow),
                                contentDescription = "Volver",
                                modifier = Modifier.size(24.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Detalle Reserva",
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.weight(1f)
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
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                color = Color(0x1A4CAF50),
                border = BorderStroke(1.dp, Color(0xFF4CAF50))
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.check),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Argumentos recibidos",
                        color = Color(0xFF4CAF50),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                Image(
                    painter = painterResource(id = Nimage),
                    contentDescription = nombre,
                    modifier = Modifier.size(120.dp)
                )

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "Nombre:", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)
                    Text(text = nombre, fontSize = 14.sp, color = Color.Black)

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(text = "Autor:", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)
                    Text(text = autor, fontSize = 14.sp, color = Color.Black)

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(text = "Fecha reserva:", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)
                    Text(text = fecha, fontSize = 14.sp, color = Color.Black)

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(text = "Codigo reserva:", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)
                    Text(text = "Res-2026-001", fontSize = 14.sp, color = Color.Black)

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(text = "Estado:", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)

                    Spacer(modifier = Modifier.height(4.dp))

                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = Color(0x1A4CAF50),
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

            Spacer(modifier = Modifier.height(16.dp))

            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                color = Color(0x1A2196F3),
                border = BorderStroke(1.dp, Color(0xFF2196F3))
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.information),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Estos datos fueron enviados desde la pantalla anterior como parámetros",
                        color = Color(0xFF2196F3),
                        fontSize = 14.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(
                    onClick = { navController.navigate("renovar/$nombre/$autor/$Nimage/$fecha") },
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rotate),
                        contentDescription = "",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "Renovar Reserva", color = Color.White, fontSize = 14.sp)
                }

                Button(
                    onClick = { navController.navigate("reserva?nombre=$nombre&intImage=$Nimage&autor=$autor&descripcion=&categoria=&fecha=$fecha") },
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.delete),
                        contentDescription = "",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "Cancelar Reserva", color = Color.White, fontSize = 14.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetalleReservaSectionPreview() {
    DetalleReservaSection(
        navController = NavController(androidx.compose.ui.platform.LocalContext.current),
        nombre = "El principito",
        autor = "Antoine de Saint-Exupéry",
        Nimage = R.drawable.no_tengo_boca,
        fecha = "15/06/2026"
    )
}
