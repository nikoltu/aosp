//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_boolean;
import dot.junit.opcodes.aget_boolean.d.*;
import dot.junit.*;
public class Main_testE3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aget_boolean_1 t = new T_aget_boolean_1();
        boolean[] arr = new boolean[2];
        try {
            t.run(arr, -1);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}
