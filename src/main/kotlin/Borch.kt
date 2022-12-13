open class Borch<T> (portion: Int, type: String, nation: String, ingridients: Map<String, T>): Soup<T>(portion, type, nation, ingridients) {

    override fun order(): String {
        return "Заказано $portion порций борща"
    }

    override fun ready(): Int {
        return portion
    }

    override fun issuedOrder(): String {
        return "Выдано $portion порций борща"
    }

    override fun toString(): String {
        return "Заказ на борщ: порций $portion, нужны ингридиенты: $ingridients"
    }

    fun typeMeat(type: String): String{
        return "Борщ с $type"
    }

    fun typeMeat(): String{
        return "Борщ вегетарианский"
    }

    fun vegetable(cabbage: String = "", tomato: String = ""): String {
        if (cabbage.length > 1 && tomato.length > 1) {
            return "Борщ с $cabbage и $tomato"
        }
        if (cabbage.length > 1 && tomato.length <= 1){
            return "Борщ с $cabbage"
        }
        else return "Борщ с $tomato"
    }

}