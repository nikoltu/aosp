//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.astore;
import dxc.junit.opcodes.astore.jm.*;
import dxc.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE1().testVFE1();
}
public void testVFE1() {
        try {
            Class.forName("dxc.junit.opcodes.astore.jm.T_astore_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
