//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.div_long_2addr;
import dot.junit.opcodes.div_long_2addr.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_div_long_2addr_1 t = new T_div_long_2addr_1();
        try {
            t.run(12345678912345l, 0);
            fail("expected ArithmeticException");
        } catch (ArithmeticException ae) {
            // expected
        }
    }
}
