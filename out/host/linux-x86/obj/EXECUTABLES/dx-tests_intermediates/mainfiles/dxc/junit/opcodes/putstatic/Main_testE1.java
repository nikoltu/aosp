//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.putstatic;
import dxc.junit.opcodes.putstatic.jm.*;
import dxc.junit.*;
public class Main_testE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE1().testE1();
}
public void testE1() {
        try {
            T_putstatic_7 t = new T_putstatic_7();
            t.run();
            fail("expected IncompatibleClassChangeError");
        } catch (IncompatibleClassChangeError e) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}