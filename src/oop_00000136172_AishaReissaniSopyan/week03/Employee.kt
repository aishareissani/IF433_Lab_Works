package oop_00000136172_AishaReissaniSopyan.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}