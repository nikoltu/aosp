//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.dmul;
import dxc.junit.opcodes.dmul.jm.*;
import dxc.junit.*;
public class Main_testB8 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB8().testB8();
}
public void testB8() {
        T_dmul_1 t = new T_dmul_1();
        assertEquals(-0d, t.run(Double.MIN_VALUE, -1.4E-45f));
    }
}