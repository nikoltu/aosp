//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.move_result_wide;
import dot.junit.opcodes.move_result_wide.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.move_result_wide.d.T_move_result_wide_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
