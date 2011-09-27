package dot.junit.opcodes.sub_float;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_sub_float extends DeviceTestCase {
public void testB1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB1.jar", "/data/local/tmp/Main_testB1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB1.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB1");}

public void testB10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB10.jar", "/data/local/tmp/Main_testB10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB10.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB10");}

public void testB11() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB11.jar", "/data/local/tmp/Main_testB11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB11.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB11");}

public void testB2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB2.jar", "/data/local/tmp/Main_testB2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB2.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB2");}

public void testB3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB3.jar", "/data/local/tmp/Main_testB3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB3.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB3");}

public void testB4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB4.jar", "/data/local/tmp/Main_testB4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB4.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB4");}

public void testB5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB5.jar", "/data/local/tmp/Main_testB5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB5.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB5");}

public void testB6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB6.jar", "/data/local/tmp/Main_testB6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB6.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB6");}

public void testB7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB7.jar", "/data/local/tmp/Main_testB7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB7.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB7");}

public void testB8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB8.jar", "/data/local/tmp/Main_testB8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB8.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB8");}

public void testB9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testB9.jar", "/data/local/tmp/Main_testB9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB9.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testB9");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testN2");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_1.jar", "/data/local/tmp/T_sub_float_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_sub_float_1.jar", "dot.junit.opcodes.sub_float.Main_testN3");}

public void testN4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testN4.jar", "/data/local/tmp/Main_testN4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_5.jar", "/data/local/tmp/T_sub_float_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN4.jar:/data/local/tmp/T_sub_float_5.jar", "dot.junit.opcodes.sub_float.Main_testN4");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_2.jar", "/data/local/tmp/T_sub_float_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_sub_float_2.jar", "dot.junit.opcodes.sub_float.Main_testVFE2");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_3.jar", "/data/local/tmp/T_sub_float_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_sub_float_3.jar", "dot.junit.opcodes.sub_float.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_4.jar", "/data/local/tmp/T_sub_float_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_sub_float_4.jar", "dot.junit.opcodes.sub_float.Main_testVFE4");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sub_float/d/T_sub_float_6.jar", "/data/local/tmp/T_sub_float_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_sub_float_6.jar", "dot.junit.opcodes.sub_float.Main_testVFE5");}


}
