//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.daload;
import dxc.junit.opcodes.daload.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_daload_1 t = new T_daload_1();
        double[] arr = new double[2];
        arr[1] = 3.1415d;
        assertEquals(3.1415d, t.run(arr, 1));
    }
}