//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.new_array;
import dot.junit.opcodes.new_array.d.*;
import dot.junit.*;
public class Main_testVFE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.new_array.d.T_new_array_9");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
