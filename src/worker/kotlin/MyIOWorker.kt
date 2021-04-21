import parspice.worker.IOWorker
import parspice.sender.DoubleArraySender
import parspice.sender.IntSender

class MyIOWorker: IOWorker<Int, DoubleArray>(IntSender(), DoubleArraySender(3)) {
    override fun setup() {}

    override fun task(input: Int) = doubleArrayOf(1.0, 2.0, input.toDouble())
}