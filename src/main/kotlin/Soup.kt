abstract class Soup<T> (var portion: Int, var type: String, var nation: String, var ingridients: Map<String, T> ) {

    abstract fun order(): String
    abstract fun ready(): Int
    abstract fun issuedOrder(): String


}