package com.example.moviesposterui

import androidx.lifecycle.ViewModel

class MoviesDataViewModel : ViewModel() {

    val movies = listOf(
        Movie("Baahubali: The Beginning", "https://tse1.mm.bing.net/th/id/OIP.Zv8EB7mhjPY_W03p3rXoUwHaK-?rs=1&pid=ImgDetMain&o=7&rm=3","Rating 8.9"),
        Movie("Baahubali 2: The Conclusion", "https://image.tmdb.org/t/p/original/bBOqSIIy72mWekwweNg0iqJw8Ot.jpg","Rating 8.9"),


        Movie("Businessman","https://stat2.bollywoodhungama.in/wp-content/uploads/2016/03/The-Businessman.jpg","Rating 8.7"),
        Movie("Kalki 2898 ad", "https://tse2.mm.bing.net/th/id/OIP.ZeLAWETJ9PgWyYJ0pi6mowHaLk?rs=1&pid=ImgDetMain&o=7&rm=3","Rating 8.7"),
        Movie("Pushpa The Rise", "https://m.media-amazon.com/images/M/MV5BZjA4ZDJmNmQtZTA4NS00NzhmLTg2ODktZjg3MDliZmUzYTZmXkEyXkFqcGdeQXVyODEyNjEwMDk@._V1_.jpg","Rating 8.7"),
        Movie("Salaar", "https://tse2.mm.bing.net/th/id/OIP.-nhE2tNr_N5AttAvhpbw_AHaKj?rs=1&pid=ImgDetMain&o=7&rm=3","Rating 8.7"),

        Movie("RRR", "https://image.tmdb.org/t/p/original/vOfLRYjTGCLjrwtj0gsXNrPtyGe.jpg","Rating 8.9"),


        Movie("KGF Chapter 1 (Telugu Dub)", "https://m.media-amazon.com/images/M/MV5BM2M0YmIxNzItOWI4My00MmQzLWE0NGYtZTM3NjllNjIwZjc5XkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg ","Rating 8.9"),
        Movie("KGF Chapter 2 (Telugu Dub)", "https://xl.movieposterdb.com/23_09/2022/10698680/xl_kgf-chapter-2-movie-poster_c89d5120.jpg","Rating 8.9"),
        Movie("Fight Club", "https://movieswithaplottwist.com/wp-content/uploads/2016/03/fight-club.25541.jpg","Rating 8.2"),
        Movie("F1 The Movie", "https://www.apple.com/tv-pr/articles/2025/03/apple-original-films-unveils-the-f1-movie-trailer/images/inline-image/inline-image-01/031325_F1_Trailer_Announcement_Inline_Image_01_inline_image_post.jpg.large.jpg","Rating 9.2"),


        Movie("Varanas",
            "https://media2.firstshowing.net/firstshowing/img17/Varanasiposter1mainepicbig591.jpg","Rating 9.0"),
        Movie("Spider Man 3",
            "https://tse4.mm.bing.net/th/id/OIP.9MEVqNFBjPM6i13qyuADeQHaLH?rs=1&pid=ImgDetMain&o=7&rm=3","Rating 9.2"),
        Movie("Titanic",
            "https://originalvintagemovieposters.com/wp-content/uploads/2020/02/TITANIC-8567-scaled-1392x2048.jpg","Rating 8.9"),
        Movie("Avatar",
            "https://th.bing.com/th/id/R.a55dd5066c720c301569eac4f0820c9f?rik=Y84cfdymWe2KoQ&riu=http%3a%2f%2f3.bp.blogspot.com%2f-H57vRpipBhs%2fT92h_GLMFAI%2fAAAAAAAAAAc%2fzLYxoSfXv9w%2fs1600%2favatar_movie_poster_final_01.jpg&ehk=jzJkCE7sP8U2tnS91vVNZ2sFDSdjyJXIi4QpgsOUBZY%3d&risl=&pid=ImgRaw&r=0","Rating 8.7"),
        Movie("Oppenheimer",
            "https://cdna.artstation.com/p/assets/images/images/063/096/684/large/william-j-harris-oppenheimer-movie-poster-2023.jpg?1684720979","Rating 8.6"),
        Movie("Avengers: Endgame", "https://m.media-amazon.com/images/I/81ExhpBEbHL.jpg","Rating 8.7"),
        Movie("Avengers: Infinity War", "https://tse1.mm.bing.net/th/id/OIP.3XuDLQIM_0KNcL-5ObbHkAHaK-?rs=1&pid=ImgDetMain&o=7&rm=3","Rating 9.2"),


        Movie("The Matrix", "https://tse3.mm.bing.net/th/id/OIP.QbvNaXF_Jd2YicUncwJP1wHaLH?rs=1&pid=ImgDetMain&o=7&rm=3","Rating 9.2"),
        Movie("Joker", "https://tse4.mm.bing.net/th/id/OIP.4SzxxHd6AhrJIjmE39oKZwHaKe?rs=1&pid=ImgDetMain&o=7&rm=3","Rating 9.2"),
        Movie("Deadpool", "https://3.bp.blogspot.com/-vRcHEAIXtGE/Vut0ph5OG-I/AAAAAAAAB0k/Be_1mMk8dYcz9_2AOtq8YZ5_Ugxk1JtaQ/s1600/tumblr_nskkwlHjZc1qd9jlto1_1280.png","Rating 9.2"),
        Movie("Spider-Man: No Way Home", "https://www.sonypictures.ca/sites/canada/files/2022-12/DP_6390172_SpiderMan_NoWayHome_2000x3000_EST_1333x2000_thumbnail-min-min.jpg","Rating 8.7"),
        Movie("Guardians of the Galaxy", "https://m.media-amazon.com/images/I/91KkWf50SoL.jpg","Rating 9.3"),
        Movie("Black Panther", "https://image.tmdb.org/t/p/original/fj7sX7w0MfIxWylcizp5ArPIMFs.jpg","Rating 8.2"),
        Movie("Doctor Strange", "https://lumiere-a.akamaihd.net/v1/images/p_doctorstrange_19918_516f94d3.jpeg?region=0%2C0%2C540%2C810","Rating 8.7"),
        Movie("Shutter Island", "https://m.media-amazon.com/images/M/MV5BYzhiNDkyNzktNTZmYS00ZTBkLTk2MDAtM2U0YjU1MzgxZjgzXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg","Rating 8.2"),
        Movie("The Godfather", "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_.jpg","Rating 8.7"),
    )
}