//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_super_range;
import dot.junit.opcodes.invoke_super_range.d.*;
import dot.junit.*;
public class Main_testE4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_super_range.d.T_invoke_super_range_6
        //@uses dot.junit.opcodes.invoke_super_range.ATest
        T_invoke_super_range_6 t = new T_invoke_super_range_6();
        try {
            t.run();
            fail("expected AbstractMethodError");
        } catch (AbstractMethodError iae) {
            // expected
        }
    }
}