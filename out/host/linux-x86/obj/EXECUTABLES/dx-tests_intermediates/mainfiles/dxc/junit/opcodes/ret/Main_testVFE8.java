//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.ret;
import dxc.junit.opcodes.ret.jm.*;
import dxc.junit.*;
public class Main_testVFE8 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testVFE8().testVFE8();
}
public void testVFE8() {
        try {
            Class.forName("dxc.junit.opcodes.ret.jm.T_ret_5_w");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}