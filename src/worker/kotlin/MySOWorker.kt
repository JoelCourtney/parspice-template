import parspice.sender.DoubleArraySender
import parspice.sender.LongSender
import parspice.worker.SOWorker

class MySOWorker: SOWorker<Long, DoubleArray>(LongSender(), DoubleArraySender(3)) {
    override fun setup(input: Long) {}

    override fun task(i: Int) = doubleArrayOf(1.0, 2.0, i.toDouble())
}