open class TableWear {

    fun tableWear(person: Int, vararg tableWear: String) {
        println("Количество гостей: $person. Для гостей нужна посуда:")
        for (t in tableWear){
           println(t)
        }

    }

}