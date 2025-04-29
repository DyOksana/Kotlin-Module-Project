import java.util.Scanner

abstract class  ActionClass {
    private var listOfInclude: MutableList<ActionClass> = mutableListOf()

    abstract fun show()

    abstract fun add()

    fun addArchive (){
        println("Введите название архива")
        val archiveName = readInputEmpty("Название архива")
        listOfInclude.add(Archive(archiveName))
    }

    fun addTextNotes ():String{
        println("Введите добавляемый текст")
        val textNote = readInputEmpty("Добавляемый текст")
        return textNote
    }

    fun addNotes (){
        println("Введите название заметки")
        val notesName = readInputEmpty("Название заметки")
        println("Введите текст заметки")
        val notesText = readInputEmpty("Текст заметки")
        listOfInclude.add(Notes(notesName, notesText))
    }

    private fun readInputEmpty(messageText: String):String{
        while (true) {
            val selectionString = Scanner(System.`in`).nextLine()
            if (selectionString.isNotEmpty()) {
                return selectionString
            } else {
                println("$messageText не может быть пустым!")
            }
        }
    }

    fun showScreen(menu0Text: String){
        println (menu0Text)
        val sizeList:Int = listOfInclude.size-1
        for (i in 0..sizeList){
            println("${i+1}. ${listOfInclude[i]}")
        }
        println("${sizeList+2}. Выход")
    }

    private fun selectItem(index: Int){
        listOfInclude.elementAt(index).show()
        listOfInclude.elementAt(index).choice()
    }

    fun choice(){
        while (true) {
            when(val selection: Int? = Scanner(System.`in`).nextLine().toIntOrNull()) {
                null -> println("Необходимо ввести цифру!")
                0-> add()
                in 1..listOfInclude.size -> selectItem(selection-1)
                listOfInclude.size + 1 -> break
                else-> println("Такого пункта нет в списке. Введите корректный символ")
            }
            show()
        }
    }

}