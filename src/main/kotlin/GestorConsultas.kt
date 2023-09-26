import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
import java.io.RandomAccessFile


class GestorConsultas {
    lateinit var stream: RandomAccessFile;

    init {
        createFile("discosDAML.dat")
    }

    fun createFile(fileName:String){
        try {
            val exists = File(fileName).exists()
            stream = RandomAccessFile(fileName, "rw")
            if (!exists) {
                createDefaultDisks()
            }
        } catch (e: FileNotFoundException) {
            System.out.println("Error al abrir el fichero: $fileName")
            System.exit(0)
        }



    }
    fun createDefaultDisks() {
        var disco1 =  Disco(1, "Que voy a hacer", "Los Planetas", 20.0, 5);
        disco1.escribeEnFichero(stream);
        var disco2 = Disco(2, "La voz del presidente", "Viva Suecia", 35.0, 1);
        disco2.escribeEnFichero(stream);
        var disco3 = Disco(3, "La revolución sexual", "La casa azul", 20.0, 10);
        disco3.escribeEnFichero(stream);
        var disco4 = Disco(4, "Finisterre", "Vetusta Morla", 40.0, 5);
        disco4.escribeEnFichero(stream);
        var disco5 = Disco(5, "Paradise","Coldplay", 35.0, 2);
        disco5.escribeEnFichero(stream);
    }

    fun cierraGestor() {
        try {
            stream.close()
        } catch (e: IOException) {
            println("No se ha podido cerrar el fichero")
        }
    }

    private fun findByCode(code: Int): Long {
        val disc = Disco()
        //IMPLEMENTAR
        return 0;
    }

    private fun seekOnFile(posicion: Long) {
        try {
            stream.seek(posicion)
        } catch (e: IOException) {
            println("Error posicionando el puntero al inicio del fichero")
            System.exit(0)
        }
    }

    fun getArrayOfAuthors(): Array<String> {
        val Disco = Disco()
        //IMPLEMENTAR
        return arrayOf();
    }


    private fun hashArray(autores: HashSet<String>): Array<String?> {
        val lista = arrayOfNulls<String>(autores.size)
        var i = 0
        for (`val` in autores) lista[i++] = `val`
        return lista
    }

    fun findByAuthor(author: String?): Array<String> {
        val Disco = Disco()
        //IMPLEMENTAR
        return arrayOf()
    }

    fun increaseStockToDisk(code: Int): String {
        val position: Long = findByCode(code)
        //IMPLEMENTAR
        return ""
    }

    fun decreaseStockToDisk(disk: Int): String {
        val position: Long = findByCode(disk)
        //IMPLEMENTAR
        return ""
    }

}