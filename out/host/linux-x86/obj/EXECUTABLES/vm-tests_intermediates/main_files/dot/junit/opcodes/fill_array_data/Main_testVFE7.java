//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.fill_array_data;
import dot.junit.opcodes.fill_array_data.d.*;
import dot.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("dot.junit.opcodes.fill_array_data.d.T_fill_array_data_9");
            fail("expected a verification exception");
        } catch (Throwable t) {
            DxUtil.checkVerifyException(t);
        }
    }
}
