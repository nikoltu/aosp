//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_wide;
import dot.junit.opcodes.sput_wide.d.*;
import dot.junit.*;
public class Main_testN4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sput_wide.d.T_sput_wide_1
        //@uses dot.junit.opcodes.sput_wide.d.T_sput_wide_14
        T_sput_wide_14 t = new T_sput_wide_14();
        assertEquals(0, T_sput_wide_14.getProtectedField());
        t.run();
        assertEquals(77, T_sput_wide_14.getProtectedField());
    }
}
