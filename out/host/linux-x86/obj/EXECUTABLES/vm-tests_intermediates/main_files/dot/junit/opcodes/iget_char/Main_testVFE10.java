//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iget_char;
import dot.junit.opcodes.iget_char.d.*;
import dot.junit.*;
public class Main_testVFE10 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.iget_char.d.T_iget_char_16");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
