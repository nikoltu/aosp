//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aput;
import dot.junit.opcodes.aput.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aput_1 t = new T_aput_1();
        int[] arr = new int[2];
        try {
            t.run(arr, 2, 100000000);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}