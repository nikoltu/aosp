//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.const_string_jumbo;
import dot.junit.opcodes.const_string_jumbo.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.const_string_jumbo.d.T_const_string_jumbo_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
