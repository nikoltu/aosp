//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aput_byte;
import dot.junit.opcodes.aput_byte.d.*;
import dot.junit.*;
public class Main_testVFE6 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aput_byte.d.T_aput_byte_7");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
