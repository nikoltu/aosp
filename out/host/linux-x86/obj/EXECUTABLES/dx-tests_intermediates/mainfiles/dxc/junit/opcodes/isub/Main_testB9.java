//autogenerated by util.CollectAllTests, do not change
package dxc.junit.opcodes.isub;
import dxc.junit.opcodes.isub.jm.*;
import dxc.junit.*;
public class Main_testB9 extends DxAbstractMain {
public static void main(String[] args) throws Exception {
new Main_testB9().testB9();
}
public void testB9() {
        T_isub_1 t = new T_isub_1();
        assertEquals(-1, t.run(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
