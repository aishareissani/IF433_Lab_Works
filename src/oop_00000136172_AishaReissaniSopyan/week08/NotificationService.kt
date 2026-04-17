package oop_00000136172_AishaReissaniSopyan.week08

class NotificationService{
    fun sendEmail(emailAddress: String){
        println("Mengirim email: $emailAddress")
    }

    fun processUser(user: UserProfile){
        // sendEmail(user.email)

        if(user.email != null){
            sendEmail(user.email)
        }else{
            println("User ${user.name} tidak memiliki email.")
        }
    }
}