//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.bastore;
import dxc.junit.opcodes.bastore.jm.*;
import dxc.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE6().testVFE6();
}
public void testVFE6() {
        try {
            Class.forName("dxc.junit.opcodes.bastore.jm.T_bastore_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
