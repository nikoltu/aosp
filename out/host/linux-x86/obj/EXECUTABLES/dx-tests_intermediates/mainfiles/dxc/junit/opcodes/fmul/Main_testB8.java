//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.fmul;
import dxc.junit.opcodes.fmul.jm.*;
import dxc.junit.*;
public class Main_testB8 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB8().testB8();
}
public void testB8() {
        T_fmul_1 t = new T_fmul_1();
        assertEquals(-0f, t.run(Float.MIN_VALUE, -1.4E-45f));
    }
}
