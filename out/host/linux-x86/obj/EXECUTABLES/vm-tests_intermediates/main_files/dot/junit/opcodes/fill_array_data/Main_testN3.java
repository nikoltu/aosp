//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.fill_array_data;
import dot.junit.opcodes.fill_array_data.d.*;
import dot.junit.*;
public class Main_testN3 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[10];
        T_fill_array_data_1 t = new T_fill_array_data_1();
        t.run(arr);
        for(int i = 0; i < 5; i++)
            assertEquals(i + 1, arr[i]);
        for(int i = 5; i < 10; i++)
            assertEquals(0, arr[i]);
     }
}