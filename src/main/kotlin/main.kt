import java.util.*
import kotlin.collections.HashMap


fun main(args: Array<String>) {

    val cook = Cook("Иванов Иван Евгеньевич")
    val cook1 = Cook("Иванов Иван Евгеньевич")
    println(cook.openInfo())

    val cookEd = CookEd("Иван Р.О.", 3, "FdF")
    println(cookEd)


    val i: Waiter = Waiter()
    i.name = "R"
    println(i.name)
    println("Введите название супа: Гаспачо или Борщ")



    val scan = Scanner(System.`in`)
    val chose = scan.nextLine()
    println("Введите количество порций")
    val portion = scan.nextInt()
    val borchIngr = mutableMapOf("вода, л." to 1, "говядина, кг" to 0.5)
    val gaspachoIngr = mutableMapOf("вода, л." to 0.5, "томаты, кг" to 1)

    when(chose){
        "Борщ" -> {val borch = Borch(portion, "горячий", "русская", borchIngr)
        println(borch.toString())
        borch.typeMeat("курицей")
        println(borch.typeMeat("курицей"))
       println(borch.vegetable(tomato = "2 помидора"))}
        "Гаспачо".lowercase() -> {val gaspacho = Gaspatcho(portion, "холодный", "испанская", gaspachoIngr)}
        else -> println("Выберите суп из предложенных")
    }

    val tableWear = TableWear()
    tableWear.tableWear(portion, "2 ложки", "2 тарелки")

    val say = {mes: String -> println(mes)}
    say("Приятного аппетита")










}