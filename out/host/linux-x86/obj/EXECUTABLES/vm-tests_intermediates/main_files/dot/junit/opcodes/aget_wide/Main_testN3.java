//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aget_wide;
import dot.junit.opcodes.aget_wide.d.*;
import dot.junit.*;
public class Main_testN3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aget_wide_2 t = new T_aget_wide_2();
        double[] arr = new double[2];
        arr[0] = 3.1415d;
        assertEquals(3.1415d, t.run(arr, 0));
    }
}