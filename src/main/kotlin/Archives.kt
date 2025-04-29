class Archives: ActionClass(){
    override fun add(){
        addArchive()
    }
    override fun show(){
        showScreen("Список архивов:\n0. Создать архив")
    }

}