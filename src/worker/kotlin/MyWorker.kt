import parspice.worker.OWorker
import parspice.sender.DoubleArraySender

class MyWorker: OWorker<DoubleArray>(DoubleArraySender(3)) {
    override fun setup() {}

    override fun task(i: Int) = doubleArrayOf(1.0, 2.0, i.toDouble())
}