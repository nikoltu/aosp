//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.baload;
import dxc.junit.opcodes.baload.jm.*;
import dxc.junit.*;
public class Main_testE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE2().testE2();
}
public void testE2() {
        T_baload_1 t = new T_baload_1();
        try {
            t.run(null, 2);
            fail("expected NullPointerException");
        } catch (NullPointerException aie) {
            // expected
        }
    }
}