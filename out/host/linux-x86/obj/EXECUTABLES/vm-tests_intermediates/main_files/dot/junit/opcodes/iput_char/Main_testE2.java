//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.iput_char;
import dot.junit.opcodes.iput_char.d.*;
import dot.junit.*;
public class Main_testE2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_iput_char_13 t = new T_iput_char_13();
        try {
            t.run();
            fail("expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}