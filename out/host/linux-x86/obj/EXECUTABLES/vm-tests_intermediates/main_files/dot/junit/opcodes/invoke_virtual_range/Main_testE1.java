//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_virtual_range;
import dot.junit.opcodes.invoke_virtual_range.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_invoke_virtual_range_1 t = new T_invoke_virtual_range_1();
        String s = "s";
        try {
            t.run(null, s);
            fail("expected NullPointerException");
        } catch (NullPointerException npe) {
            // expected
        }
    }
}