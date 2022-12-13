class Gaspatcho<T>(portion: Int, type: String, nation: String, ingridients: Map<String, T>): Soup<T>(portion, type, nation, ingridients) {


    override fun order(): String {
        return "Заказано $portion порций гаспачо"
    }

    override fun ready(): Int {
        return portion
    }

    override fun issuedOrder(): String {
        return "Выдано $portion порций гаспачо"
    }
}