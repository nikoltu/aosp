//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_wide;
import dot.junit.opcodes.sput_wide.d.*;
import dot.junit.*;
public class Main_testN3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_sput_wide_12 t = new T_sput_wide_12();
        assertEquals(0, T_sput_wide_12.st_i1);
        t.run();
        assertEquals(77, T_sput_wide_12.st_i1);
    }
}