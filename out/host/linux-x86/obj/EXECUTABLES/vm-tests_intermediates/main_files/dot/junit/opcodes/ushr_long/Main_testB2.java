//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.ushr_long;
import dot.junit.opcodes.ushr_long.d.*;
import dot.junit.*;
public class Main_testB2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_ushr_long_1 t = new T_ushr_long_1();
        assertEquals(0x3FFFFFFFFFFFFFFFl, t.run(Long.MAX_VALUE, 1));
    }
}