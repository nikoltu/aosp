//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fastore;
import dxc.junit.opcodes.fastore.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_fastore_1 t = new T_fastore_1();
        float[] arr = new float[2];
        t.run(arr, 0, 2.7f);
        assertEquals(2.7f, arr[0]);
    }
}