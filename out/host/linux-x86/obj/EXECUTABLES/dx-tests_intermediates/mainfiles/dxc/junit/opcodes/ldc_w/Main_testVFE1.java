//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ldc_w;
import dxc.junit.opcodes.ldc_w.jm.*;
import dxc.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE1().testVFE1();
}
public void testVFE1() {
        try {
            Class.forName("dxc.junit.opcodes.ldc_w.jm.T_ldc_w_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
