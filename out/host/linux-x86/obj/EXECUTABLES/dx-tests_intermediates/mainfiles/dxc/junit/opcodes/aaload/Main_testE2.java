//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.aaload;
import dxc.junit.opcodes.aaload.jm.*;
import dxc.junit.*;
public class Main_testE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE2().testE2();
}
public void testE2() {
        T_aaload_1 t = new T_aaload_1();
        String[] arr = new String[] {"a", "b"};
        try {
            t.run(arr, -1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            // expected
        }
    }
}