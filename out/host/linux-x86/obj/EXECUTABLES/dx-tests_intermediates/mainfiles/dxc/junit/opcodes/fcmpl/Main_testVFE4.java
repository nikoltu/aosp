//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fcmpl;
import dxc.junit.opcodes.fcmpl.jm.*;
import dxc.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE4().testVFE4();
}
public void testVFE4() {
        try {
            Class.forName("dxc.junit.opcodes.fcmpl.jm.T_fcmpl_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
