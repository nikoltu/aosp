//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokestatic;
import dxc.junit.opcodes.invokestatic.jm.*;
import dxc.junit.*;
public class Main_testE8 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE8().testE8();
}
public void testE8() {
        // @uses dxc.junit.opcodes.invokestatic.jm.TestClassAbstract
        try {
            T_invokestatic_16 t = new T_invokestatic_16();
            t.run();
            fail("expected IncompatibleClassChangeError");
        } catch (IncompatibleClassChangeError iae) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}
