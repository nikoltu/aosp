//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokespecial;
import dxc.junit.opcodes.invokespecial.jm.*;
import dxc.junit.*;
public class Main_testE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE1().testE1();
}
public void testE1() {
        //@uses dxc.junit.opcodes.invokespecial.jm.TSuper
        try {
            T_invokespecial_7 t = new T_invokespecial_7();
            assertEquals(5, t.run());
            fail("expected NoSuchMethodError");
        } catch (NoSuchMethodError e) {
            // expected
        } catch (VerifyError vfe) {
            // ok for dalvikvm; early resolution
            System.out.print("dvmvfe:");
        }
    }
}