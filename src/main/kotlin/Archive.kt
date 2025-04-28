class Archive(private val name: String): ActionClass() {
    override fun add(){
        addNotes()
    }
    override fun toString(): String {
        return name
    }
    override fun show(){
        println("Список заметок архива $name:")
        println ("0. Создать заметку")
        showScreen()
    }

}

