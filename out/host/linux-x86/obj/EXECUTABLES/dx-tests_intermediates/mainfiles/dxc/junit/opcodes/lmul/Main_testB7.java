//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lmul;
import dxc.junit.opcodes.lmul.jm.*;
import dxc.junit.*;
public class Main_testB7 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB7().testB7();
}
public void testB7() {
        T_lmul_1 t = new T_lmul_1();
        assertEquals(-9223372036854775808L, t.run(Long.MIN_VALUE, -1));
    }
}
