//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.putstatic;
import dxc.junit.opcodes.putstatic.jm.*;
import dxc.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE5().testVFE5();
}
public void testVFE5() {
        try {
            Class.forName("dxc.junit.opcodes.putstatic.jm.T_putstatic_18");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
