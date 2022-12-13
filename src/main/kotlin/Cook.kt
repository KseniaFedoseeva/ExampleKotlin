open class Cook (fio: String): Personal(fio)  {

    var category: Int =1
    constructor(cat : Int, fio: String) : this(fio){
        category = cat

    }

    final override fun openInfo():String {
       return "Имя повара: $fio"
    }
}