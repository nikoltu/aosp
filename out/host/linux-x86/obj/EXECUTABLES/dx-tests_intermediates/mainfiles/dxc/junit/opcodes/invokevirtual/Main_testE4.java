//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokevirtual;
import dxc.junit.opcodes.invokevirtual.jm.*;
import dxc.junit.*;
public class Main_testE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE4().testE4();
}
public void testE4() {
        // @uses dxc.junit.opcodes.invokevirtual.jm.ATest
        T_invokevirtual_6 t = new T_invokevirtual_6();
        try {
            t.run();
            fail("expected AbstractMethodError");
        } catch (AbstractMethodError iae) {
            // expected
        }
    }
}
