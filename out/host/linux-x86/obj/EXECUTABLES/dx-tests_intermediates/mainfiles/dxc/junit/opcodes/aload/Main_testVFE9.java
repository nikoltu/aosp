//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.aload;
import dxc.junit.opcodes.aload.jm.*;
import dxc.junit.*;
public class Main_testVFE9 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE9().testVFE9();
}
public void testVFE9() {
        try {
            Class.forName("dxc.junit.opcodes.aload.jm.T_aload_6_w");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}