//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_super_range;
import dot.junit.opcodes.invoke_super_range.d.*;
import dot.junit.*;
public class Main_testE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_super_range.d.T_invoke_super_range_4
        //@uses dot.junit.opcodes.invoke_super_range.d.TSuper
        T_invoke_super_range_4 t = new T_invoke_super_range_4();
        try {
            t.run();
            fail("expected UnsatisfiedLinkError");
        } catch (UnsatisfiedLinkError ule) {
            // expected
        }
    }
}
