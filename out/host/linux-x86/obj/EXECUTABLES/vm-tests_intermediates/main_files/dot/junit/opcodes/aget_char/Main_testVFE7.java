//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_char;
import dot.junit.opcodes.aget_char.d.*;
import dot.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.aget_char.d.T_aget_char_9");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
