//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aput_byte;
import dot.junit.opcodes.aput_byte.d.*;
import dot.junit.*;
public class Main_testE1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aput_byte_1 t = new T_aput_byte_1();
        byte[] arr = new byte[2];
        try {
            t.run(arr, 2, (byte) 100);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // expected
        }
    }
}