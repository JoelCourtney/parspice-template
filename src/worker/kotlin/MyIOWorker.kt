import parspice.worker.IOWorker
import parspice.sender.DoubleArraySender

class MyIOWorker: IOWorker<DoubleArray, DoubleArray>(DoubleArraySender(3), DoubleArraySender(3)) {
    override fun setup() {}

    override fun task(input: DoubleArray) = input
}