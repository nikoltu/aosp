//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.getfield;
import dxc.junit.opcodes.getfield.jm.*;
import dxc.junit.*;
public class Main_testE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testE4().testE4();
}
public void testE4() {
        try {
            T_getfield_8 t = new T_getfield_8();
            t.run();
            fail("expected NoSuchFieldError");
        } catch (NoSuchFieldError e) {
            // expected
        } catch (VerifyError vfe) { 
            // ok for dalvikvm; 
            System.out.print("dvmvfe:"); 
        }
    }
}