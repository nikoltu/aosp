//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.saload;
import dxc.junit.opcodes.saload.jm.*;
import dxc.junit.*;
public class Main_testE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE1().testE1();
}
public void testE1() {
        T_saload_1 t = new T_saload_1();
        short[] arr = new short[2];
        try {
            t.run(arr, 2);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}