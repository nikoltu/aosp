//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.double_to_float;
import dot.junit.opcodes.double_to_float.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.double_to_float.d.T_double_to_float_6");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}