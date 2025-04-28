class Notes(private val name: String, private var textNote: String):ActionClass(){
    override fun show() {
        println("Текст заметки $name:\n$textNote")
        println("0. Добавить текст")
        println("1. Выход")
    }

    override fun add(){
        val newText = addTextNotes()
        textNote += "\n$newText"
    }
    override fun toString(): String {
        return name
    }
}