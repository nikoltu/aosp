//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.invokestatic;
import dxc.junit.opcodes.invokestatic.jm.*;
import dxc.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE4().testVFE4();
}
public void testVFE4() {
        try {
            Class
                    .forName("dxc.junit.opcodes.invokestatic.jm.T_invokestatic_11");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}