//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.baload;
import dxc.junit.opcodes.baload.jm.*;
import dxc.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE5().testVFE5();
}
public void testVFE5() {
        try {
            Class.forName("dxc.junit.opcodes.baload.jm.T_baload_6");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
