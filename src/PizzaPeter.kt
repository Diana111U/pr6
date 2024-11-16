class PizzaPeter(neapolitanPizzaPrice: Double,  romanPizzaPrice: Double,
                  sicilianPizzaPrice:Double,  tyroleanPizzaPrice:Double
) : PizzaCity(neapolitanPizzaPrice,romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice),Drink
{

    override fun drinkSale()
    {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if(readln()=="1")
        {
            println("С вас 200 рублей")
            CountOfCoffee++
            SumOfCoffee+=200
        }
        else
        {
            CountOfNoCoffee++
        }

    }


    override fun neapolitanPizzaSale()
    {
        neapolitanPizzaCount++
        if (CountOfCoffee > 0)
        {
            neapolitanPizzaWCoffee++
        }
        println("Спасибо за покупку неаполитанской пиццы в Санкт-Петербурге")
    }

    override fun romanPizzaSale()
    {
        romanPizzaCount++
        if (CountOfCoffee > 0)
        {
            romanPizzaWCoffee++
        }
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale()
    {
        sicilianPizzaCount++
        if (CountOfCoffee > 0)
        {
            sicilianPizzaWCoffee++
        }
       println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }

    override fun tyroleanPizzaSale()
    {
        tyropleanPizzaCount++
        if (CountOfCoffee > 0)
        {
            tyroleanPizzaWCoffee++
        }
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }
}