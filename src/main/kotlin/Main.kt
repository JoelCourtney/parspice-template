import parspice.ParSPICE

fun main() {
    val par = ParSPICE("build/libs/worker.jar", 50050)
    val results = par.run(MyWorker(), 1000, 4)
}