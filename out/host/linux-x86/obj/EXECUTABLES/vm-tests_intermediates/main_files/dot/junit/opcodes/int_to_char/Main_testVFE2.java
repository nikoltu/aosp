//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.int_to_char;
import dot.junit.opcodes.int_to_char.d.*;
import dot.junit.*;
public class Main_testVFE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.int_to_char.d.T_int_to_char_2");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
