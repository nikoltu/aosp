//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.int_to_long;
import dot.junit.opcodes.int_to_long.d.*;
import dot.junit.*;
public class Main_testVFE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.int_to_long.d.T_int_to_long_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
