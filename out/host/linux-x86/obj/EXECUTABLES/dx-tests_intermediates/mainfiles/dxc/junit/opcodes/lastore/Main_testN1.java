//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lastore;
import dxc.junit.opcodes.lastore.jm.*;
import dxc.junit.*;
public class Main_testN1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN1().testN1();
}
public void testN1() {
        T_lastore_1 t = new T_lastore_1();
        long[] arr = new long[2];
        t.run(arr, 1, 100000000000l);
        assertEquals(100000000000l, arr[1]);
    }
}