//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fmul;
import dxc.junit.opcodes.fmul.jm.*;
import dxc.junit.*;
public class Main_testB1 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB1().testB1();
}
public void testB1() {
        T_fmul_1 t = new T_fmul_1();
        assertEquals(Float.NaN, t.run(Float.MAX_VALUE, Float.NaN));
    }
}
