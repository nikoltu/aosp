//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.athrow;
import dxc.junit.opcodes.athrow.jm.*;
import dxc.junit.*;
public class Main_testE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE1().testE1();
}
public void testE1() {
        T_athrow_4 t = new T_athrow_4();
        try {
            t.run();
            fail("expected NullPointerException");
        } catch (NullPointerException npe) {
            // expected
        }
    }
}
