package dot.junit.opcodes.xor_int_lit16;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_xor_int_lit16 extends DeviceTestCase {
public void testB1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testB1.jar", "/data/local/tmp/Main_testB1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_3.jar", "/data/local/tmp/T_xor_int_lit16_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB1.jar:/data/local/tmp/T_xor_int_lit16_3.jar", "dot.junit.opcodes.xor_int_lit16.Main_testB1");}

public void testB2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testB2.jar", "/data/local/tmp/Main_testB2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_4.jar", "/data/local/tmp/T_xor_int_lit16_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testB2.jar:/data/local/tmp/T_xor_int_lit16_4.jar", "dot.junit.opcodes.xor_int_lit16.Main_testB2");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_1.jar", "/data/local/tmp/T_xor_int_lit16_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_xor_int_lit16_1.jar", "dot.junit.opcodes.xor_int_lit16.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_2.jar", "/data/local/tmp/T_xor_int_lit16_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_xor_int_lit16_2.jar", "dot.junit.opcodes.xor_int_lit16.Main_testN2");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_7.jar", "/data/local/tmp/T_xor_int_lit16_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_xor_int_lit16_7.jar", "dot.junit.opcodes.xor_int_lit16.Main_testN3");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_5.jar", "/data/local/tmp/T_xor_int_lit16_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_xor_int_lit16_5.jar", "dot.junit.opcodes.xor_int_lit16.Main_testVFE1");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_6.jar", "/data/local/tmp/T_xor_int_lit16_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_xor_int_lit16_6.jar", "dot.junit.opcodes.xor_int_lit16.Main_testVFE2");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/xor_int_lit16/d/T_xor_int_lit16_8.jar", "/data/local/tmp/T_xor_int_lit16_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_xor_int_lit16_8.jar", "dot.junit.opcodes.xor_int_lit16.Main_testVFE3");}


}
