//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.rsub_int_lit8;
import dot.junit.opcodes.rsub_int_lit8.d.*;
import dot.junit.*;
public class Main_testB2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_rsub_int_lit8_3 t = new T_rsub_int_lit8_3();
        assertEquals(Integer.MIN_VALUE, t.run(Integer.MIN_VALUE));
        assertEquals(128, t.run(Byte.MIN_VALUE));
    }
}