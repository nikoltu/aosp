//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.aaload;
import dxc.junit.opcodes.aaload.jm.*;
import dxc.junit.*;
public class Main_testE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE3().testE3();
}
public void testE3() {
        T_aaload_1 t = new T_aaload_1();
        String[] arr = null;
        try {
            t.run(arr, 0);
            fail("expected NullPointerException");
        } catch (NullPointerException npe) {
            // expected
        }
    }
}