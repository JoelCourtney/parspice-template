import parspice.sender.DoubleArraySender
import parspice.worker.IWorker

class MyIWorker: IWorker<DoubleArray>(DoubleArraySender(3)) {
    override fun setup() {}

    override fun task(input: DoubleArray) {}
}