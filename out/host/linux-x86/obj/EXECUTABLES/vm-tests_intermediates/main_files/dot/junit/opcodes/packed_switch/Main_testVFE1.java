//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.packed_switch;
import dot.junit.opcodes.packed_switch.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.packed_switch.d.T_packed_switch_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
