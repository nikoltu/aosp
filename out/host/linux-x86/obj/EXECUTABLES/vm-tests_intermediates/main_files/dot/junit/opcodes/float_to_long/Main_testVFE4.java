//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.float_to_long;
import dot.junit.opcodes.float_to_long.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try
        {
            Class.forName("dot.junit.opcodes.float_to_long.d.T_float_to_long_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
