//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.or_int_lit8;
import dot.junit.opcodes.or_int_lit8.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.or_int_lit8.d.T_or_int_lit8_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}