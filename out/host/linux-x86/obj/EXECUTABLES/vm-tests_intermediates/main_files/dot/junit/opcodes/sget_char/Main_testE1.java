//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sget_char;
import dot.junit.opcodes.sget_char.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {

        T_sget_char_5 t = new T_sget_char_5();
        try {
            t.run();
            fail("expected IncompatibleClassChangeError");
        } catch (IncompatibleClassChangeError e) {
            // expected
        }
    }
}
