//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.move_wide;
import dot.junit.opcodes.move_wide.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.move_wide.d.T_move_wide_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
