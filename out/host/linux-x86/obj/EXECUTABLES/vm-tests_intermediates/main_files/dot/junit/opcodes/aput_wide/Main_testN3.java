//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.aput_wide;
import dot.junit.opcodes.aput_wide.d.*;
import dot.junit.*;
public class Main_testN3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_aput_wide_2 t = new T_aput_wide_2();
        double[] arr = new double[2];
        t.run(arr, 0, 3.1415d);
        assertEquals(3.1415d, arr[0]);
    }
}