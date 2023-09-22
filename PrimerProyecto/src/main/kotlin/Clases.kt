public data class Cancion(var title: String, var genre: String, var year: Int, var played: Int){

    fun isPopular(): Boolean = played > 1000

    override fun toString(): String {
        return "$title, fue lanzado en $year"
    }
}

public data class Artist(val nombre: String, val cancion: Cancion?){
    fun mostrarInfo(){
        if (cancion == null) println("El artista $nombre no tiene canciones a su nombre.")
        else println("La canción del $nombre se llama ${cancion.title}")
    }

}
fun numMaxReproducciones(cancion: Cancion?, reproduccionesTotales: Int) :Int{
    return cancion?.played?:reproduccionesTotales
}
fun main() {
    var artist = Artist("taylor swift",Cancion("anti-hero","pop",2022,1120000000))
    var artistList = ArrayList<Artist>()
    artistList.add(Artist("anuel",Cancion("lambebicho","reggaeton",2020,100000)))
    artistList.add(Artist("paco sanz",Cancion("xd","pop",2020,100000)))
    artistList.add(Artist("pepe",Cancion("lolaso","heavy punk",2000,100000)))
    artistList.add(Artist("queen",Cancion("dont stop me now","rock",1982,1000000000)))


    artistList.filter{ artist -> artist.cancion?.genre == "reggaeton" || artist.cancion?.genre!!.contains("punk")  }.forEach{ println(it) }

    artistList.filter { it.cancion?.year!! > 2000 }.map { it.cancion!!.played += 200 }

}
