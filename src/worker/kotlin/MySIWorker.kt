import parspice.sender.IntSender
import parspice.sender.LongSender
import parspice.worker.SIWorker

class MySIWorker: SIWorker<Long, Int>(LongSender(), IntSender()) {
    override fun setup(input: Long) {}

    override fun task(i: Int) {}
}