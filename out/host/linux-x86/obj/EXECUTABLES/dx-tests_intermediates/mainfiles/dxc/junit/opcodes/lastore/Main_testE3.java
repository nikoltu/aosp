//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lastore;
import dxc.junit.opcodes.lastore.jm.*;
import dxc.junit.*;
public class Main_testE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE3().testE3();
}
public void testE3() {
        T_lastore_1 t = new T_lastore_1();
        long[] arr = new long[2];
        try {
            t.run(arr, -1, 100000000000l);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}
