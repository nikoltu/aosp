//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.putstatic;
import dxc.junit.opcodes.putstatic.jm.*;
import dxc.junit.*;
public class Main_testN2 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testN2().testN2();
}
public void testN2() {
        T_putstatic_2 t = new T_putstatic_2();
        assertEquals(0d, T_putstatic_2.st_d1);
        t.run();
        assertEquals(1000000d, T_putstatic_2.st_d1);
    }
}
