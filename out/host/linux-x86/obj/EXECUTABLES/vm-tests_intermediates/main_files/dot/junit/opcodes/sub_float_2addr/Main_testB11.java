//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sub_float_2addr;
import dot.junit.opcodes.sub_float_2addr.d.*;
import dot.junit.*;
public class Main_testB11 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_sub_float_2addr_1 t = new T_sub_float_2addr_1();
        assertEquals(Float.POSITIVE_INFINITY, t.run(Float.MAX_VALUE,
                -3.402823E+38F));
    }
}
