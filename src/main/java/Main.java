import parspice.ParSPICE;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ParSPICE par = new ParSPICE("build/libs/worker.jar", 50050);
        List<double[]> results = par.run(new MyOWorker(), 1000, 4);
    }
}
