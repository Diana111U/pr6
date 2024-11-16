import kotlin.math.max


abstract class PizzaCity( val neapolitanPizzaPrice:Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice:Double, val tyroleanPizzaPrice:Double)
{
   var neapolitanPizzaCount=0
   var romanPizzaCount=0
   var sicilianPizzaCount=0
   var tyropleanPizzaCount=0

    //Количество показанных чеков и общая сумма скидок
    var SumOfSale : Int = 0
    var CountOfChecks : Int = 0

    //Количество проданных кофе и общая сумма выручки за кофе
    var SumOfCoffee : Int = 0
    var CountOfCoffee : Int = 0

    //Подсчитать в процентном соотношении, сколько человек показывают фотографию чека, а сколько – нет
    var CountOfNoCheks:Int =0

    //Подсчитать в процентном соотношении,сколько человек покупают кофе, а сколько – отказываются.
    var CountOfNoCoffee:Int =0

    //Выводить на экран статистику, показывающую, к какой пицце чаще покупают кофе
    var neapolitanPizzaWCoffee = 0
    var romanPizzaWCoffee = 0
    var sicilianPizzaWCoffee = 0
    var tyroleanPizzaWCoffee = 0


    abstract fun neapolitanPizzaSale()

    abstract fun romanPizzaSale()

    abstract fun sicilianPizzaSale()

    abstract fun tyroleanPizzaSale()

    fun showStatistics() {
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyropleanPizzaCount")

        val money =
            neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice + sicilianPizzaCount * sicilianPizzaPrice + tyropleanPizzaCount * tyroleanPizzaPrice
        println("Всего заработано денег: $money")

        println("Количество показанных чеков: $CountOfChecks, общая сумма скидок: $SumOfSale")

        println("Количество проданных кофе: $CountOfCoffee, общая сумма выручки за кофе: $SumOfCoffee")

        println("Выручка с учетом скидок и проданных кофе: ${money - SumOfSale + SumOfCoffee}")



        //Подсчитать в процентном соотношении, сколько человек покупают кофе, а сколько – отказываются.
        if ((CountOfCoffee + CountOfNoCoffee) != 0) {
            println(
                "Процентное соотношение, сколько человек покупают кофе, а сколько – отказываются. " +
                        "\nПокупают:${(100 * CountOfCoffee) / (CountOfCoffee + CountOfNoCoffee)} %" +
                        "\nОтказывают: ${(100 * CountOfNoCoffee) / (CountOfCoffee + CountOfNoCoffee)} %"
            )
        }

        //Подсчитать в процентном соотношении, сколько человек показывают фотографию чека, а сколько – нет.
        if ((CountOfChecks + CountOfNoCheks) != 0) {
            println(
                "Процентное соотношение, сколько человек показывают чек , а сколько – нет. " +
                        "\nПоказывают:${(100 * CountOfChecks) / (CountOfChecks + CountOfNoCheks)} %" +
                        "\nНе показывают: ${(100 * CountOfNoCheks) / (CountOfChecks + CountOfNoCheks)} %"
            )

            //Выводить на экран статистику, показывающую, к какой пицце чаще покупают кофе
            val maxPizzaWCoffee = max(max(max(neapolitanPizzaWCoffee,romanPizzaWCoffee),sicilianPizzaWCoffee), tyroleanPizzaWCoffee)
            println("К $maxPizzaWCoffee")
        }
    }
}