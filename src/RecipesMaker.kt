fun main(args: Array<String>)
{
//  Aquí defino el menú a mostrar
  val menu_principal: String = """
    :: Bienvenido a Recipe Maker ::
    
    Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
    
  """.trimIndent()

//  Aquí defino la variable que guardará la respuesta del usuario
  var responseMenu:String?
  var responseIngr:String?

//  Declaro la lista de ingredientes y recetas
  val ingredientes: List<String> = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

//  Definición de Cantidad de Recetas (Rango)
  //val noRecetas: IntRange = 1..3
  var i:Int = 0

  var receta:String = ""

//  Con el do while muestro el menú y recibo del usuario la opción a manejar
  do
  {
//  Aquí muestro el menú
    println(menu_principal)
    responseMenu = readLine()

  if (responseMenu!!.equals("1"))
  { println("Opción $responseMenu seleccionada")
      for ((index,j) in ingredientes.withIndex())
      {
        println("$index: $j")
        responseIngr = readLine() //Leo la respuesta del ingr. seleccionado para la receta
        if (responseIngr!! == index.toString())
        { println("El ingrediente $index ($j) fue seleccionado")
          when (responseIngr!!.toInt())
          {
            0 -> receta += "Agua,\n"
            1 -> receta += "Leche,\n"
            2 -> receta += "Carne,\n"
            3 -> receta += "Verduras,\n"
            4 -> receta += "Frutas,\n"
            5 -> receta += "Cereal,\n"
            6 -> receta += "Huevos,\n"
            7 -> receta += "Aceite,\n"
            else -> println("\nÉsta opción no existe")
          }
        }
        else
        { println("El ingrediente $index ($j) No fue seleccionado") }
      }
  }
  else if (responseMenu.equals("2"))
  { println("Opción $responseMenu seleccionada:\nLa receta almacenada contiene los siguientes ingredientes:\n")
    println(receta)
  }

  }while (responseMenu!! != "3") //Salida del ciclo
  println("Opción $responseMenu seleccionada: Saliendo de programa...")
}