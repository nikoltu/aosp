//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fneg;
import dxc.junit.opcodes.fneg.jm.*;
import dxc.junit.*;
public class Main_testB3 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB3().testB3();
}
public void testB3() {
        T_fneg_1 t = new T_fneg_1();
        assertEquals(Float.NEGATIVE_INFINITY, t.run(Float.POSITIVE_INFINITY));
    }
}
