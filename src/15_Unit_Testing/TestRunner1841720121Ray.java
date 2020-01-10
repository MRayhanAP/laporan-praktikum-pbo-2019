package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Asus
 */
public class TestRunner1841720121Ray {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720121Ray.class);
        showMessageResultRay(mResult, MessageProcessorTest1841720121Ray.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Kategori1841720121RayTest.class);
        showMessageResultRay(mResult, Kategori1841720121RayTest.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Anggota1841720121RayTest.class);
        showMessageResultRay(mResult, Anggota1841720121RayTest.class.getSimpleName());
    }

    private static void showMessageResultRay(Result mResult, String mClassName) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", mClassName, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
