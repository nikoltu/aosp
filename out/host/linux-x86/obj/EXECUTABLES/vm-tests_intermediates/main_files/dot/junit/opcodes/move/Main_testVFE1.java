//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.move;
import dot.junit.opcodes.move.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.move.d.T_move_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}