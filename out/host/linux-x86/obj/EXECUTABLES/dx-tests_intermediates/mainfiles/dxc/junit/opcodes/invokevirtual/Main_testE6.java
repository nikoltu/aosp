//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokevirtual;
import dxc.junit.opcodes.invokevirtual.jm.*;
import dxc.junit.*;
public class Main_testE6 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE6().testE6();
}
public void testE6() {
        // @uses dxc.junit.opcodes.invokevirtual.jm.TSuper
        // @uses dxc.junit.opcodes.invokevirtual.TProtected
        try {
            T_invokevirtual_18 t = new T_invokevirtual_18();
            t.run(new TProtected());
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError iae) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}