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
    println(numMaxReproducciones(null, 2))
}
