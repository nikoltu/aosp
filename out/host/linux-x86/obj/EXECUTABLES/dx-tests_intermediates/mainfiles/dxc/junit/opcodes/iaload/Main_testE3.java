//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.iaload;
import dxc.junit.opcodes.iaload.jm.*;
import dxc.junit.*;
public class Main_testE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE3().testE3();
}
public void testE3() {
        T_iaload_1 t = new T_iaload_1();
        int[] arr = new int[2];
        try {
            t.run(arr, -1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}