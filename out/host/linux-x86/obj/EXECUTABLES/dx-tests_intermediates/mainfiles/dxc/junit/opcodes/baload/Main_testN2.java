//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.baload;
import dxc.junit.opcodes.baload.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_baload_1 t = new T_baload_1();
        byte[] arr = new byte[2];
        arr[0] = 100;
        assertEquals(100, t.run(arr, 0));
    }
}