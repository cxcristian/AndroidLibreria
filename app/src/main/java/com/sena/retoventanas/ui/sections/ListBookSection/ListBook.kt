package com.sena.retoventanas.ui.sections.ListBookSection
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sena.retoventanas.R

@Composable
fun ListBook(navController: NavController){
    val libros = listOf(
        listOf<Any>(
            "No tengo boca y debo gritar",
            R.drawable.no_tengo_boca,
            "Harland Ellison",
            "Relato oscuro y perturbador de ciencia ficción",
            "Ciencia Ficción"
        ),
        listOf<Any>(
            "Cielo muerto Sol negro",
            R.drawable.sol_muerto,
            "Miguel de Cervantes",
            "Obra poética de tono existencial y profundo",
            "Poesía"
        ),
        listOf<Any>(
            "Necronomicon",
            R.drawable.necronomicon,
            "Abdul Alhazred",
            "Ph'nglui mglw'nafh Cthulhu R'lyeh wgah'nagl fhtagn — ᚛᚛᚛ 𐤉𐤀𐤁𐤓𐤉𐤕𐤄 ...",
            "Prohibido"
        ),
        listOf<Any>(
            "El nombre del viento",
            R.drawable.nom_viento,
            "Patrick Rothfuss",
            "Novela épica de fantasía sobre el arte de contar historias",
            "Fantasía"
        )
    )


    Surface(modifier = Modifier.padding(10.dp)) {
        Column {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                Image(painter = painterResource(R.drawable.book2), contentDescription = "", modifier = Modifier.size(35.dp))
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Mis Libros", fontSize = 35.sp)
            }
            Spacer(modifier = Modifier.fillMaxWidth().size(10.dp))
            Text(text = "Elige un libro para ver más detalles", fontSize = 24.sp)

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(libros) { libro ->
                    listaLibros(
                        nombre = libro[0] as String,
                        intImage = libro[1] as Int,
                        autor = libro[2] as String,
                        descripcion = libro[3] as String,
                        categoria = libro[4] as String,
                        navController = navController
                    )
                }
            }
        }
    }
}

@Composable
fun listaLibros(
    nombre: String,
    intImage: Int,
    autor: String,
    descripcion: String,
    categoria: String,
    navController: NavController
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = intImage),
                contentDescription = nombre,
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))
             Text(
                text = nombre,
                modifier = Modifier.weight(1f).padding(horizontal = 8.dp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedButton (
                    onClick = {
                        navController.navigate("detail/$nombre/$intImage/$autor/$descripcion/$categoria")
                    },
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, Color(0xFF7C3AED)), // borde morado
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color(0xFF7C3AED) // texto morado
                    )
                ) {
                    Text(
                        text = "Ver Detalle",
                        fontSize = 14.sp
                    )

            }

        }
    }
}