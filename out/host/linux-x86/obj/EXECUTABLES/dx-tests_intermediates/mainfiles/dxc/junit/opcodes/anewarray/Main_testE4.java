//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.anewarray;
import dxc.junit.opcodes.anewarray.jm.*;
import dxc.junit.*;
public class Main_testE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE4().testE4();
}
public void testE4() {
        try {
            T_anewarray_7 t = new T_anewarray_7();
            t.run();
            fail("expected IllegalAccessError");
        } catch (IllegalAccessError e) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}