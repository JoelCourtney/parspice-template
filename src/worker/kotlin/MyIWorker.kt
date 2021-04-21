import parspice.sender.IntSender
import parspice.worker.IWorker

class MyIWorker: IWorker<Int>(IntSender()) {
    override fun setup() {}

    override fun task(input: Int) {}
}