//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.move_from16;
import dot.junit.opcodes.move_from16.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.move_from16.d.T_move_from16_8");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
