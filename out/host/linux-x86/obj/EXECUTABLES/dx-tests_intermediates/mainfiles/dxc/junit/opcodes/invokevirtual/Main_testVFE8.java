//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokevirtual;
import dxc.junit.opcodes.invokevirtual.jm.*;
import dxc.junit.*;
public class Main_testVFE8 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE8().testVFE8();
}
public void testVFE8() {
        // @uses dxc.junit.opcodes.invokevirtual.jm.TSuper
        // @uses dxc.junit.opcodes.invokevirtual.jm.TPlain
        try {
            Class
                    .forName("dxc.junit.opcodes.invokevirtual.jm.T_invokevirtual_22");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
