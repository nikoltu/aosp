//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.i2s;
import dxc.junit.opcodes.i2s.jm.*;
import dxc.junit.*;
public class Main_testN6 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN6().testN6();
}
public void testN6() {
        T_i2s_1 t = new T_i2s_1();
        assertEquals(-32768, t.run(32768));
    }
}
