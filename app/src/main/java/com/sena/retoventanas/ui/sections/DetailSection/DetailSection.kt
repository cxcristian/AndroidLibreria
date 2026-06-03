package com.sena.retoventanas.ui.sections.DetailSection

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sena.retoventanas.R
import com.sena.retoventanas.ui.theme.Grey600
import com.sena.retoventanas.ui.theme.Orange50
import com.sena.retoventanas.ui.theme.Orange500
import com.sena.retoventanas.ui.theme.Orange700

@Composable
fun DetailSection(
    nombre: String,
    intImage: Int,
    autor: String,
    descripcion: String,
    categoria: String,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Orange50.copy(alpha = 0.6f), RoundedCornerShape(12.dp))
                .padding(12.dp)
                .align(Alignment.CenterHorizontally),
            contentAlignment = Alignment.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.book_mark),
                    contentDescription = "",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Parámetro recibido",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Orange700
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Image(
            painter = painterResource(id = intImage),
            contentDescription = nombre,
            modifier = Modifier.size(130.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Nombre: ", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text(text = nombre, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Autor: $autor", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Categoría: $categoria", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Descripción:", fontWeight = FontWeight.Bold, fontSize = 16.sp)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = descripcion, fontSize = 14.sp, color = Grey600)

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("confirmation/$nombre/$intImage/$autor/$descripcion/$categoria") },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Orange500)
        ) {
            Image(
                painter = painterResource(R.drawable.book_mark),
                contentDescription = "",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Reservar Libro", color = Color.White, fontSize = 18.sp)
        }
    }
}