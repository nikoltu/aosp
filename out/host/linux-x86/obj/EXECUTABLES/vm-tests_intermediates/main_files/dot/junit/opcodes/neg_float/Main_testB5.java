//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.neg_float;
import dot.junit.opcodes.neg_float.d.*;
import dot.junit.*;
public class Main_testB5 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_neg_float_1 t = new T_neg_float_1();
        assertEquals(-1.4E-45f, t.run(Float.MIN_VALUE));
    }
}