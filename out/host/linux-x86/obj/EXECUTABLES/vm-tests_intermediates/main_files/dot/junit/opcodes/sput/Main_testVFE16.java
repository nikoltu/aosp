//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput;
import dot.junit.opcodes.sput.d.*;
import dot.junit.*;
public class Main_testVFE16 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.sput.d.T_sput_22");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
