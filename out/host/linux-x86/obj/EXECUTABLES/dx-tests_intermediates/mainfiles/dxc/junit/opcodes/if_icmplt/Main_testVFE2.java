//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.if_icmplt;
import dxc.junit.opcodes.if_icmplt.jm.*;
import dxc.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE2().testVFE2();
}
public void testVFE2() {
        try {
            Class.forName("dxc.junit.opcodes.if_icmplt.jm.T_if_icmplt_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
