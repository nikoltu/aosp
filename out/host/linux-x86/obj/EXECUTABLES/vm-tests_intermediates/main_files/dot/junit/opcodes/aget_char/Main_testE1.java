//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_char;
import dot.junit.opcodes.aget_char.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aget_char_1 t = new T_aget_char_1();
        char[] arr = new char[2];
        try {
            t.run(arr, 2);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}
