//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.opc_new;
import dxc.junit.opcodes.opc_new.jm.*;
import dxc.junit.*;
public class Main_testE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE2().testE2();
}
public void testE2() {
        // @uses dxc.junit.opcodes.opc_new.jm.TestStubs$TestStub
        try {
            T_opc_new_4 t = new T_opc_new_4();
            t.run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError iae) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}