//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sub_long_2addr;
import dot.junit.opcodes.sub_long_2addr.d.*;
import dot.junit.*;
public class Main_testB3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_sub_long_2addr_1 t = new T_sub_long_2addr_1();
        assertEquals(-9223372036854775808L, t.run(Long.MAX_VALUE, -1l));
    }
}