//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.jsr_w;
import dxc.junit.opcodes.jsr_w.jm.*;
import dxc.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE3().testVFE3();
}
public void testVFE3() {
        try {
            Class.forName("dxc.junit.opcodes.jsr_w.jm.T_jsr_w_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
