//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.shr_int_2addr;
import dot.junit.opcodes.shr_int_2addr.d.*;
import dot.junit.*;
public class Main_testB2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_shr_int_2addr_1 t = new T_shr_int_2addr_1();
        assertEquals(0x3FFFFFFF, t.run(Integer.MAX_VALUE, 1));
    }
}