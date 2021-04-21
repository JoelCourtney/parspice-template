import parspice.ParSPICE

fun main() {
    val par = ParSPICE("build/libs/worker.jar", 50050)
    val results = MyOWorker().init(5, 1000).run(par)
}