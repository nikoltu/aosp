//autogenerated by util.CollectAllTests, do not change
package dxc.junit.verify.t482_4;
import dxc.junit.verify.t482_4.jm.*;
import dxc.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE3().testVFE3();
}
public void testVFE3() {
        try {
            Class.forName("dxc.junit.verify.t482_4.jm.T_t482_4_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
