//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.move_result_object;
import dot.junit.opcodes.move_result_object.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.move_result_object.d.T_move_result_object_3");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
