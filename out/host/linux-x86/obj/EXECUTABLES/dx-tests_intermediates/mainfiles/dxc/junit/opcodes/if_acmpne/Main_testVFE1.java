//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.if_acmpne;
import dxc.junit.opcodes.if_acmpne.jm.*;
import dxc.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE1().testVFE1();
}
public void testVFE1() {
        try {
            Class.forName("dxc.junit.opcodes.if_acmpne.jm.T_if_acmpne_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
