//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_short;
import dot.junit.opcodes.aget_short.d.*;
import dot.junit.*;
public class Main_testN1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aget_short_1 t = new T_aget_short_1();
        short[] arr = new short[2];
        arr[1] = 10000;
        assertEquals(10000, t.run(arr, 1));
    }
}
