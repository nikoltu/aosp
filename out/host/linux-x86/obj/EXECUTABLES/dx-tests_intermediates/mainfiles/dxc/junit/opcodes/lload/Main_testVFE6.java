//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lload;
import dxc.junit.opcodes.lload.jm.*;
import dxc.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE6().testVFE6();
}
public void testVFE6() {
        try {
            Class.forName("dxc.junit.opcodes.lload.jm.T_lload_4_w");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}