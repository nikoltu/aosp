//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.getstatic;
import dxc.junit.opcodes.getstatic.jm.*;
import dxc.junit.*;
public class Main_testE7 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE7().testE7();
}
public void testE7() {
        // @uses dxc.junit.opcodes.getstatic.jm.T_getstatic_1
        try {
            T_getstatic_12 t = new T_getstatic_12();
            t.run();
            //fail("expected IllegalAccessError");
        } catch (IllegalAccessError e) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}