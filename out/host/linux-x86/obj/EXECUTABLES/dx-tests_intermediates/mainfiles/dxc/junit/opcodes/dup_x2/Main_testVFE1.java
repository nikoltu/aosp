//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.dup_x2;
import dxc.junit.opcodes.dup_x2.jm.*;
import dxc.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE1().testVFE1();
}
public void testVFE1() {
        try {
            Class.forName("dxc.junit.opcodes.dup_x2.jm.T_dup_x2_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
