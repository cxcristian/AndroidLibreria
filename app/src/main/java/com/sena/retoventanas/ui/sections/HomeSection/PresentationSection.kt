package com.sena.retoventanas.ui.sections.HomeSection

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.retoventanas.R
import com.sena.retoventanas.ui.theme.Grey600
import com.sena.retoventanas.ui.theme.Purple300
import com.sena.retoventanas.ui.theme.Purple50
import com.sena.retoventanas.ui.theme.Purple700

@Composable
fun PresentationSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .background(Purple50.copy(alpha = 0.6f))
        ) {
            Image(
                painter = painterResource(id = R.drawable.main_home),
                contentDescription = ""
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "¡Bienvenido a tu Biblioteca!",
            color = Purple700,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Descubre, aprende y reserva tus libros favoritos",
            color = Grey600,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        FilledIconButton(
            onClick = {},
            colors = IconButtonDefaults.filledIconButtonColors(
                containerColor = Purple300,
                contentColor = Color.White
            )
        ) {
            Image(
                painter = painterResource(R.drawable.book),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Ver Libros")
        }
    }
}