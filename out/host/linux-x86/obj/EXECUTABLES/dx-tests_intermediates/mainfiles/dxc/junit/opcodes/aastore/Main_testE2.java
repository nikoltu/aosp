//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.aastore;
import dxc.junit.opcodes.aastore.jm.*;
import dxc.junit.*;
public class Main_testE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE2().testE2();
}
public void testE2() {
        T_aastore_1 t = new T_aastore_1();
        String[] arr = new String[2];
        try {
            t.run(arr, -1, "abc");
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}
