//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.rem_float;
import dot.junit.opcodes.rem_float.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.rem_float.d.T_rem_float_5");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
