//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokespecial;
import dxc.junit.opcodes.invokespecial.jm.*;
import dxc.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE5().testVFE5();
}
public void testVFE5() {
        //@uses dxc.junit.opcodes.invokespecial.jm.TSuper
        try {
            Class
                    .forName("dxc.junit.opcodes.invokespecial.jm.T_invokespecial_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}