//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.lneg;
import dxc.junit.opcodes.lneg.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_lneg_1 t = new T_lneg_1();
        assertEquals(-1l, t.run(1l));
    }
}
