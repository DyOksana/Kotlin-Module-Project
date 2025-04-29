class Archive(private val name: String): ActionClass() {
    override fun add(){
        addNotes()
    }

    override fun show(){
        showScreen("Список заметок архива $name:\n0. Создать заметку")
    }

    override fun toString(): String {
        return name
    }
}

