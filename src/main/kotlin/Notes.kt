class Notes(private val name: String, private var textNote: String):ActionClass(){
    override fun add(){
        val newText = addTextNotes()
        textNote += "\n$newText"
    }

    override fun show() {
        showScreen("Текст заметки $name:\n$textNote\n0. Добавить текст")
    }

    override fun toString(): String {
        return name
    }
}