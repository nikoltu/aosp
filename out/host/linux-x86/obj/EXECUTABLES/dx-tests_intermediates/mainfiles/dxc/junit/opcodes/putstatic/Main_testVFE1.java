//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.putstatic;
import dxc.junit.opcodes.putstatic.jm.*;
import dxc.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE1().testVFE1();
}
public void testVFE1() {
        try {
            Class.forName("dxc.junit.opcodes.putstatic.jm.T_putstatic_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
