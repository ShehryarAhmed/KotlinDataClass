package dataa.classs.programing

fun main(args: Array<String>) {

    val emp1 = emplyee("ALI",12)
    val emp2 = emplyee("ALI",12)
    emp1.age = 12
    println(emp1.age)
    println(emp1 == emp2)

    val car1 = Car("Black","Honda",2016)
    val car2 = Car("Black","Honda",2016)

    println(car1 == car2)

    val car3 = car1.copy();
    val car4 = car1.copy(year=20);
    println(car4)

}

//regular class
class emplyee(var name:String, age:Int =10){

    var age = age
    get() {
        println("getter")
        return field
    }
    set(value) {
        println("setter")
        field = value
    }
}

data class Car(val Color:String, val model:String, val year:Int){}