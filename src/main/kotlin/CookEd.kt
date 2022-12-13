class CookEd: Cook {
    var comp: String = "und"
    constructor(fio: String, cat: Int, company: String) : super(cat, fio){
        comp = company
    }

    override fun toString(): String {
        return "Повар $fio учился в $comp и имеет категорию $category"
    }


}