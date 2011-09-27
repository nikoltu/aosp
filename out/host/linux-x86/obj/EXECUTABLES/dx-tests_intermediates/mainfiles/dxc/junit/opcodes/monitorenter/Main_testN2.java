//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.monitorenter;
import dxc.junit.opcodes.monitorenter.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() throws InterruptedException {
        //@uses dxc.junit.opcodes.monitorenter.TestRunnable2
        final T_monitorenter_2 t1 = new T_monitorenter_2();
        Runnable r1 = new TestRunnable2(t1, 10);
        Runnable r2 = new TestRunnable2(t1, 20);
        Thread tr1 = new Thread(r1);
        Thread tr2 = new Thread(r2);
        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();
        assertTrue(t1.result);
    }
}