//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.double_to_int;
import dot.junit.opcodes.double_to_int.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.double_to_int.d.T_double_to_int_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}