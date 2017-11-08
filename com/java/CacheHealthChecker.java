import java.util.concurrent.CountDownLatch;

/**
 * Created by Owen on 2017/7/16.
 */
public class CacheHealthChecker extends BaseHealthChecker {

    public CacheHealthChecker(CountDownLatch latch) {
        super(latch, "Cache Service");
    }

    @Override
    public void verfiyServiceUp() {
        System.out.println("Checking " + this.getServiceName());
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + "is UP");
    }
}
