//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lookupswitch;
import dxc.junit.opcodes.lookupswitch.jm.*;
import dxc.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE2().testVFE2();
}
public void testVFE2() {
        try {
            Class.forName("dxc.junit.opcodes.lookupswitch.jm.T_lookupswitch_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}