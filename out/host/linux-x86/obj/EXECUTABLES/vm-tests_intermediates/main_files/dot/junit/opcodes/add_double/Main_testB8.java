//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.add_double;
import dot.junit.opcodes.add_double.d.*;
import dot.junit.*;
public class Main_testB8 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_add_double_1 t = new T_add_double_1();
        assertEquals(Double.POSITIVE_INFINITY, t.run(Double.MAX_VALUE,
                Double.MAX_VALUE));
    }
}