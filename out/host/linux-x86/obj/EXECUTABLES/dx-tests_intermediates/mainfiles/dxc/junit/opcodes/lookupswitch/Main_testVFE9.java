//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lookupswitch;
import dxc.junit.opcodes.lookupswitch.jm.*;
import dxc.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE9().testVFE9();
}
public void testVFE9() {
        try {
            Class
                    .forName("dxc.junit.opcodes.lookupswitch.jm.T_lookupswitch_10");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
