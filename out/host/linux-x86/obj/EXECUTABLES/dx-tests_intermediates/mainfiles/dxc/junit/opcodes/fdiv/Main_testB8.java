//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fdiv;
import dxc.junit.opcodes.fdiv.jm.*;
import dxc.junit.*;
public class Main_testB8 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB8().testB8();
}
public void testB8() {
        T_fdiv_1 t = new T_fdiv_1();
        assertEquals(Float.POSITIVE_INFINITY, t.run(1, Float.MIN_VALUE));
    }
}