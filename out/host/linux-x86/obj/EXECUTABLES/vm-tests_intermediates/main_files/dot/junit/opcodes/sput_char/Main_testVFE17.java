//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_char;
import dot.junit.opcodes.sput_char.d.*;
import dot.junit.*;
public class Main_testVFE17 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sput_char.d.T_sput_char_23");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
