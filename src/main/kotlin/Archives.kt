class Archives: ActionClass(){
    override fun add(){
        addArchive()
    }
    override fun show(){
        println("Список архивов:")
        println ("0. Создать архив")
        showScreen()
    }

}