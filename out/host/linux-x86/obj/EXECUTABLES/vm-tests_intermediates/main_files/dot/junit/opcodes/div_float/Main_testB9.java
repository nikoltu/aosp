//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.div_float;
import dot.junit.opcodes.div_float.d.*;
import dot.junit.*;
public class Main_testB9 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_div_float_1 t = new T_div_float_1();
        assertEquals(Float.NEGATIVE_INFINITY, t.run(Float.MAX_VALUE, -1E-9f));
    }
}
