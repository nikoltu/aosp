//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.or_int;
import dot.junit.opcodes.or_int.d.*;
import dot.junit.*;
public class Main_testB2 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_or_int_1 t = new T_or_int_1();
        assertEquals(0xffffffff, t.run(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}