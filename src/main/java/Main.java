import parspice.ParSPICE;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ParSPICE par = new ParSPICE("build/libs/worker.jar", 50050);
        var job = (new MyOWorker()).init(4, 1000);
        List<double[]> results = job.run(par);
    }
}
