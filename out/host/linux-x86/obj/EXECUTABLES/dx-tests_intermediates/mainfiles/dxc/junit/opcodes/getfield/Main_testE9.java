//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.getfield;
import dxc.junit.opcodes.getfield.jm.*;
import dxc.junit.*;
public class Main_testE9 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE9().testE9();
}
public void testE9() {
        // @uses dxc.junit.opcodes.getfield.jm.TestStubs
        try {
            T_getfield_17 t = new T_getfield_17();
            t.run(new dxc.junit.opcodes.getfield.jm.TestStubs());
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError e) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}
