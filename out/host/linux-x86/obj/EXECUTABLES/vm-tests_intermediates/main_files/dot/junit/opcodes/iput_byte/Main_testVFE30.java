//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_byte;
import dot.junit.opcodes.iput_byte.d.*;
import dot.junit.*;
public class Main_testVFE30 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iput_byte.d.T_iput_byte_30");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
