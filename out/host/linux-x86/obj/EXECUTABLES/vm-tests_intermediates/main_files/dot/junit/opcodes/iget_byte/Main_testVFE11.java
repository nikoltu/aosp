//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_byte;
import dot.junit.opcodes.iget_byte.d.*;
import dot.junit.*;
public class Main_testVFE11 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iget_byte.d.T_iget_byte_17");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}