import parspice.sender.DoubleArraySender
import parspice.sender.IntSender
import parspice.sender.LongSender
import parspice.worker.SIOWorker

class MySIOWorker: SIOWorker<Long, Int, DoubleArray>(LongSender(), IntSender(), DoubleArraySender(3)) {
    override fun setup(input: Long) {}

    override fun task(i: Int) = doubleArrayOf(1.0, 2.0, i.toDouble())
}