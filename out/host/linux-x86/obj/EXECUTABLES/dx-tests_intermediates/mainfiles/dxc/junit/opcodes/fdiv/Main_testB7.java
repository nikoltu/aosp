//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fdiv;
import dxc.junit.opcodes.fdiv.jm.*;
import dxc.junit.*;
public class Main_testB7 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB7().testB7();
}
public void testB7() {
        T_fdiv_1 t = new T_fdiv_1();
        assertEquals(Float.NEGATIVE_INFINITY, t.run(-2.7f, 0));
    }
}