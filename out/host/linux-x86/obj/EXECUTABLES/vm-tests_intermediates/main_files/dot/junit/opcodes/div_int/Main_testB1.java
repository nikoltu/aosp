//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.div_int;
import dot.junit.opcodes.div_int.d.*;
import dot.junit.*;
public class Main_testB1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_div_int_1 t = new T_div_int_1();
        // result is MIN_VALUE because overflow occurs in this case
        assertEquals(Integer.MIN_VALUE, t.run(Integer.MIN_VALUE, -1));
    }
}
