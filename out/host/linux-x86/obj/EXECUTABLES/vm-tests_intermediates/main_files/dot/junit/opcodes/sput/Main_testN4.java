//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput;
import dot.junit.opcodes.sput.d.*;
import dot.junit.*;
public class Main_testN4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.sput.d.T_sput_1
        //@uses dot.junit.opcodes.sput.d.T_sput_14
        T_sput_14 t = new T_sput_14();
        assertEquals(0, T_sput_14.getProtectedField());
        t.run();
        assertEquals(1000000, T_sput_14.getProtectedField());
    }
}
