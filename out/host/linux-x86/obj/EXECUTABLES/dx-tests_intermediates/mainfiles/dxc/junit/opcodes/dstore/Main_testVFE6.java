//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.dstore;
import dxc.junit.opcodes.dstore.jm.*;
import dxc.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE6().testVFE6();
}
public void testVFE6() {
        try {
            Class.forName("dxc.junit.opcodes.dstore.jm.T_dstore_4_w");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
