//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lstore;
import dxc.junit.opcodes.lstore.jm.*;
import dxc.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE4().testVFE4();
}
public void testVFE4() {
        try {
            Class.forName("dxc.junit.opcodes.lstore.jm.T_lstore_6");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}