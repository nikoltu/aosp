//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lstore_2;
import dxc.junit.opcodes.lstore_2.jm.*;
import dxc.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE3().testVFE3();
}
public void testVFE3() {
        try {
            Class.forName("dxc.junit.opcodes.lstore_2.jm.T_lstore_2_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
