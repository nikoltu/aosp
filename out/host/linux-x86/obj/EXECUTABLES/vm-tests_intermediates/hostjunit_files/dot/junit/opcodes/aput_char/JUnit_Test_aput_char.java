package dot.junit.opcodes.aput_char;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_aput_char extends DeviceTestCase {
public void testE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testE1.jar", "/data/local/tmp/Main_testE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_1.jar", "/data/local/tmp/T_aput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE1.jar:/data/local/tmp/T_aput_char_1.jar", "dot.junit.opcodes.aput_char.Main_testE1");}

public void testE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testE2.jar", "/data/local/tmp/Main_testE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_1.jar", "/data/local/tmp/T_aput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE2.jar:/data/local/tmp/T_aput_char_1.jar", "dot.junit.opcodes.aput_char.Main_testE2");}

public void testE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testE3.jar", "/data/local/tmp/Main_testE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_1.jar", "/data/local/tmp/T_aput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE3.jar:/data/local/tmp/T_aput_char_1.jar", "dot.junit.opcodes.aput_char.Main_testE3");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_1.jar", "/data/local/tmp/T_aput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_aput_char_1.jar", "dot.junit.opcodes.aput_char.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_1.jar", "/data/local/tmp/T_aput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_aput_char_1.jar", "dot.junit.opcodes.aput_char.Main_testN2");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_8.jar", "/data/local/tmp/T_aput_char_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_aput_char_8.jar", "dot.junit.opcodes.aput_char.Main_testN3");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_2.jar", "/data/local/tmp/T_aput_char_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_aput_char_2.jar", "dot.junit.opcodes.aput_char.Main_testVFE1");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_3.jar", "/data/local/tmp/T_aput_char_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_aput_char_3.jar", "dot.junit.opcodes.aput_char.Main_testVFE2");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_4.jar", "/data/local/tmp/T_aput_char_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_aput_char_4.jar", "dot.junit.opcodes.aput_char.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_5.jar", "/data/local/tmp/T_aput_char_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_aput_char_5.jar", "dot.junit.opcodes.aput_char.Main_testVFE4");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_6.jar", "/data/local/tmp/T_aput_char_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_aput_char_6.jar", "dot.junit.opcodes.aput_char.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_7.jar", "/data/local/tmp/T_aput_char_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_aput_char_7.jar", "dot.junit.opcodes.aput_char.Main_testVFE6");}

public void testVFE7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE7.jar", "/data/local/tmp/Main_testVFE7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_9.jar", "/data/local/tmp/T_aput_char_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE7.jar:/data/local/tmp/T_aput_char_9.jar", "dot.junit.opcodes.aput_char.Main_testVFE7");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/aput_char/d/T_aput_char_10.jar", "/data/local/tmp/T_aput_char_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/T_aput_char_10.jar", "dot.junit.opcodes.aput_char.Main_testVFE9");}


}
