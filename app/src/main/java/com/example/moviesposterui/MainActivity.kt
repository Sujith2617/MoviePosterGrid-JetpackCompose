package com.example.moviesposterui


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MoviesDataViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainActivityListScreen(viewModel)

        }
    }
}

@Composable
fun MainActivityListScreen(viewModel: MoviesDataViewModel){

    LazyVerticalGrid(modifier = Modifier.fillMaxSize().systemBarsPadding(),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)) {

        items(viewModel.movies){ movies ->

            MovieCard(movies)
        }

    }
}


@Composable
fun MovieCard(movie: Movie){

    val context = LocalContext.current

    Card(modifier = Modifier.wrapContentHeight()
        .padding(6.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        onClick = {
        Toast.makeText(context,"${movie.name} Cant Play Due To Copyright Issue ", Toast.LENGTH_SHORT).show()
    })
    {

        AsyncImage(model = movie.posterUrl,
            contentDescription = movie.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(260.dp)
                .clip(shape = RoundedCornerShape(4.dp))
        )

        Text(movie.name, modifier = Modifier.padding(5.dp), fontWeight = FontWeight.Bold)
        Text(movie.rating, modifier = Modifier.padding(5.dp),
            fontWeight = FontWeight.SemiBold,
            color = Color.Blue
        )


    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMainActivityListScreen(){
    MainActivityListScreen(viewModel = MoviesDataViewModel())
    }

