//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.opc_instanceof;
import dxc.junit.opcodes.opc_instanceof.jm.*;
import dxc.junit.*;
public class Main_testE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE2().testE2();
}
public void testE2() {
        T_opc_instanceof_7 t = new T_opc_instanceof_7();
        try {
            t.run();
            fail("expected NoClassDefFoundError");
        } catch (NoClassDefFoundError e) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}
