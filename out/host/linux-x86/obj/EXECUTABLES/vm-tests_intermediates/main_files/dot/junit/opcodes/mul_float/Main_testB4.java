//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.mul_float;
import dot.junit.opcodes.mul_float.d.*;
import dot.junit.*;
public class Main_testB4 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_mul_float_1 t = new T_mul_float_1();
        assertEquals(Float.NEGATIVE_INFINITY, t.run(Float.POSITIVE_INFINITY,
                Float.NEGATIVE_INFINITY));
    }
}