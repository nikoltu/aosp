//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.and_int_2addr;
import dot.junit.opcodes.and_int_2addr.d.*;
import dot.junit.*;
public class Main_testVFE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.and_int_2addr.d.T_and_int_2addr_4");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
