//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fcmpg;
import dxc.junit.opcodes.fcmpg.jm.*;
import dxc.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE4().testVFE4();
}
public void testVFE4() {
        try {
            Class.forName("dxc.junit.opcodes.fcmpg.jm.T_fcmpg_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
