//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_byte;
import dot.junit.opcodes.sget_byte.d.*;
import dot.junit.*;
public class Main_testVFE14 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sget_byte.d.T_sget_byte_20");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
