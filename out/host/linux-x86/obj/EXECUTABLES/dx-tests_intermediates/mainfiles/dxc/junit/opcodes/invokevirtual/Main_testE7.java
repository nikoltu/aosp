//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokevirtual;
import dxc.junit.opcodes.invokevirtual.jm.*;
import dxc.junit.*;
public class Main_testE7 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE7().testE7();
}
public void testE7() {
        // @uses dxc.junit.opcodes.invokevirtual.jm.TSuper
        // @uses dxc.junit.opcodes.invokevirtual.TProtected
        try {
            T_invokevirtual_20 t = new T_invokevirtual_20();
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