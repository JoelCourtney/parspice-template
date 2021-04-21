import parspice.sender.LongSender
import parspice.worker.SWorker

class MySWorker: SWorker<Long>(LongSender()) {
    override fun setup(input: Long) {}

    override fun task(i: Int) {}
}