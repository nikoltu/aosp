//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.div_int_lit8;
import dot.junit.opcodes.div_int_lit8.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_div_int_lit8_13 t = new T_div_int_lit8_13();
        try {
            t.run();
            fail("expected ArithmeticException");
        } catch (ArithmeticException ae) {
            // expected
        }
    }
}