//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.shl_int_lit8;
import dot.junit.opcodes.shl_int_lit8.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.shl_int_lit8.d.T_shl_int_lit8_10");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
