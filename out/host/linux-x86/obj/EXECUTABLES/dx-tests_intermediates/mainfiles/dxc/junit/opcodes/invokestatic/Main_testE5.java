//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokestatic;
import dxc.junit.opcodes.invokestatic.jm.*;
import dxc.junit.*;
public class Main_testE5 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE5().testE5();
}
public void testE5() {
        // @uses dxc.junit.opcodes.invokestatic.jm.TestClass
        try {
            T_invokestatic_8 t = new T_invokestatic_8();
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
