import java.util.*

class petFoodRecommeder(var animalType: String="animal"){
    var day=""
    var animalFood=""
    fun animalType() {
        day = randomDay()
        when(animalType){
            "dog" ->animalFood =dogFood(day)
            "cat" -> animalFood = catFood(day)
            "fish" -> animalFood = fishFood(day)
            else -> animalFood = "Anything"
        }


    }
    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        day =  week[Random().nextInt(week.size)]
        return day
    }
    fun fishFood (day : String) : String {
        var food = ""
        when (day) {
            "Monday" -> food = "flakes"
            "Tuesday" -> food = "pellets"
            "Wednesday" -> food = "redworms"
            "Thursday" -> food = "granules"
            "Friday" -> food = "mosquitoes"
            "Saturday" -> food = "lettuce"
            "Sunday" -> food = "plankton"
        }
        return food
    }

    fun dogFood (day : String) : String {
        var food = ""
        when (day) {
            "Monday" -> food = "fish"
            "Tuesday" -> food = "chicken"
            "Wednesday" -> food = "cat"
            "Thursday" -> food = "rice"
            "Friday" -> food = "milk"
            "Saturday" -> food = "pumpkin"
            "Sunday" -> food = "onion"
        }
        return food
    }
    fun catFood (day : String) : String {
        var food = ""
        when (day) {
            "Monday" -> food = "mouse"
            "Tuesday" -> food = "rice"
            "Wednesday" -> food = "milk"
            "Thursday" -> food = "rice"
            "Friday" -> food = "chocolate"
            "Saturday" -> food = "Ice cream"
            "Sunday" -> food = "onion"
        }
        return food
    }
    init {
        animalType()
        println("Today is $day and the $animalType eat $animalFood")
    }
}

fun main(){
    petFoodRecommeder()
    petFoodRecommeder("dog")
    petFoodRecommeder("cat")
    petFoodRecommeder("fish")
}