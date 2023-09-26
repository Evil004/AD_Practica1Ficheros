import java.io.EOFException
import java.io.IOException
import java.io.RandomAccessFile
import java.io.Serializable
import java.util.*

class Disco : Serializable {
    /**
     * Devuelve el codigo del disco
     * @return
     */
    var codigo = 0
    var titulo: String? = null
    var autor: String? = null
    var precio = 0.0
    var cantidad = 0

    /**
     * Constructor de un Solucion.Disco sin argumentos
     */
    constructor() // fin de constructor sin argumentos

    /**
     * Constructor de un Solucion.Disco con argumentos
     * @param    codigo        codigo del disco
     * @param    titulo        titulo del disco
     * @param    autor        autor del disco
     * @param    precio        precio del disco
     * @param    cantidad    ejemplares disponibles del disco
     */
    constructor(codigo: Int, titulo: String?, autor: String?, precio: Double, cantidad: Int) {
        this.codigo = codigo
        this.titulo = titulo
        this.autor = autor
        this.precio = precio
        this.cantidad = cantidad
    } // fin de constructor con argumentos

    /**
     * Escribe los datos de un disco en una cadena y la devuelve
     * @return    cadena con los datos del disco
     */
    override fun toString(): String {
        var cadena = ""
        cadena += "TITULO: " + titulo + ". CODIGO: " + codigo + "\n"
        cadena += """
             AUTOR: ${autor}
             PRECIO: ${precio}. CANTIDAD: ${cantidad}
             """.trimIndent()
        return cadena
    } // fin de toString

    /**
     * Lee los datos de un disco de un stream de entrada
     */
    fun leeDeTeclado(teclado: Scanner?) {
        //IMPLEMENTAR
    } // fin leeDeTeclado

    /**
     * Escribe los datos de un disco en la posicion actual de un fichero
     * @param    stream    stream asociado al fichero
     */
    fun escribeEnFichero(stream: RandomAccessFile?) {
        //IMPLEMENTAR
    } // fin escribeEnFichero

    /**
     * Lee los datos de un disco de la posicion actual de un fichero
     * @param    stream    stream asociado al fichero
     * @throws    EOFException, IOException
     */
    @Throws(EOFException::class, IOException::class)
    fun leeDeFichero(stream: RandomAccessFile?) {
        //IMPLEMENTAR
    }

    companion object {
        /**
         * Clase que permite escribir y leer un Solucion.Disco de teclado y en un fichero de acceso directo
         */
        private const val serialVersionUID = 1L //¿Recordáis para qué sirve?
    }
}