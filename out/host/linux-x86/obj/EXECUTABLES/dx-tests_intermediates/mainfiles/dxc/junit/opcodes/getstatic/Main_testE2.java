//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.getstatic;
import dxc.junit.opcodes.getstatic.jm.*;
import dxc.junit.*;
public class Main_testE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE2().testE2();
}
public void testE2() {
        // @uses dxc.junit.opcodes.getstatic.TestStubs        
        try {
            T_getstatic_6 t = new T_getstatic_6();
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
