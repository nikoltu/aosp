//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_short;
import dot.junit.opcodes.sput_short.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sput_short.d.T_sput_short_6");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
