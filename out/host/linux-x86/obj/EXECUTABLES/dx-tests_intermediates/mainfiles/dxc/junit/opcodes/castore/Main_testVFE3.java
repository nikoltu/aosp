//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.castore;
import dxc.junit.opcodes.castore.jm.*;
import dxc.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE3().testVFE3();
}
public void testVFE3() {
        try {
            Class.forName("dxc.junit.opcodes.castore.jm.T_castore_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
