//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokespecial;
import dxc.junit.opcodes.invokespecial.jm.*;
import dxc.junit.*;
public class Main_testE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE4().testE4();
}
public void testE4() {
        //@uses dxc.junit.opcodes.invokespecial.jm.TSuper
        try {
            T_invokespecial_11 t = new T_invokespecial_11();
            assertEquals(5, t.run());
            fail("expected IncompatibleClassChangeError");
        } catch (IncompatibleClassChangeError e) {
            // expected
        } catch (VerifyError vfe) {
            // ok for dalvikvm;
            System.out.print("dvmvfe:");
        }
    }
}
