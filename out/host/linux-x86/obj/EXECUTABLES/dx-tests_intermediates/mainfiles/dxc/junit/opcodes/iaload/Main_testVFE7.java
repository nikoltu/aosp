//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.iaload;
import dxc.junit.opcodes.iaload.jm.*;
import dxc.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE7().testVFE7();
}
public void testVFE7() {
        try {
            Class.forName("dxc.junit.opcodes.iaload.jm.T_iaload_8");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
