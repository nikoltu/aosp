//autogenerated by util.CollectAllTests, do not change
package dxc.junit.verify.t482_14;
import dxc.junit.verify.t482_14.jm.*;
import dxc.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE1().testVFE1();
}
public void testVFE1() {
        try {
            Class.forName("dxc.junit.verify.t482_14.jm.T_t482_14_1");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
