//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.iaload;
import dxc.junit.opcodes.iaload.jm.*;
import dxc.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE3().testVFE3();
}
public void testVFE3() {
        try {
            Class.forName("dxc.junit.opcodes.iaload.jm.T_iaload_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}