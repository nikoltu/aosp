//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.opc_new;
import dxc.junit.opcodes.opc_new.jm.*;
import dxc.junit.*;
public class Main_testE5 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE5().testE5();
}
public void testE5() {
        // @uses dxc.junit.opcodes.opc_new.jm.TestAbstractClass
        T_opc_new_9 t = new T_opc_new_9();
        try {
            t.run();
            fail("expected Error");
        } catch (Error iae) {
            // expected
        }
    }
}