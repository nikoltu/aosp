//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_boolean;
import dot.junit.opcodes.sput_boolean.d.*;
import dot.junit.*;
public class Main_testN1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_sput_boolean_1 t = new T_sput_boolean_1();
        assertEquals(false, T_sput_boolean_1.st_i1);
        t.run();
        assertEquals(true, T_sput_boolean_1.st_i1);
    }
}