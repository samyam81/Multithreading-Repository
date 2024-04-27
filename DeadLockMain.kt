fun main(){
    val lock1:String="Kobbie"
    val lock2:String="Mainoo"

    val thread1 = Thread({
        synchronized(lock1) {
            try {
                Thread.sleep(1)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            synchronized(lock2) {
                println("lock acquired")
            }
        }
    }, "thread1")

    val thread2=Thread({
        synchronized(lock2){
            try{
                Thread.sleep(1)
            } catch (e:InterruptedException){
                e.printStackTrace()
            }
            synchronized(lock1){
                println("lock Acquired")
            }
        }
    },"thread2")
    thread2.start()
    thread1.start()
}
