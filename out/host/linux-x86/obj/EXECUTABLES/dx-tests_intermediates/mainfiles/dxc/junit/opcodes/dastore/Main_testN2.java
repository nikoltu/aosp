//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.dastore;
import dxc.junit.opcodes.dastore.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_dastore_1 t = new T_dastore_1();
        double[] arr = new double[2];
        t.run(arr, 0, 2.7d);
        assertEquals(2.7d, arr[0]);
    }
}