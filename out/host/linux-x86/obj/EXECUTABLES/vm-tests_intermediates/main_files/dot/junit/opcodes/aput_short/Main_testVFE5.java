//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aput_short;
import dot.junit.opcodes.aput_short.d.*;
import dot.junit.*;
public class Main_testVFE5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aput_short.d.T_aput_short_6");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
