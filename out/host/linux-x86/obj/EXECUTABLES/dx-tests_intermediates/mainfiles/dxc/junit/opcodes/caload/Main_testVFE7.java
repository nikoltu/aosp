//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.caload;
import dxc.junit.opcodes.caload.jm.*;
import dxc.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE7().testVFE7();
}
public void testVFE7() {
        try {
            Class.forName("dxc.junit.opcodes.caload.jm.T_caload_8");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
