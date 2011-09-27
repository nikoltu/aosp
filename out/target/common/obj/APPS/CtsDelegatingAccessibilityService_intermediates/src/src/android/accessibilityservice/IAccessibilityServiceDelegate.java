/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: cts/tests/accessibilityservice/src/android/accessibilityservice/IAccessibilityServiceDelegate.aidl
 */
package android.accessibilityservice;
/**
 * Interface for interacting with the accessibility service mock.
 */
public interface IAccessibilityServiceDelegate extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.accessibilityservice.IAccessibilityServiceDelegate
{
private static final java.lang.String DESCRIPTOR = "android.accessibilityservice.IAccessibilityServiceDelegate";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.accessibilityservice.IAccessibilityServiceDelegate interface,
 * generating a proxy if needed.
 */
public static android.accessibilityservice.IAccessibilityServiceDelegate asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.accessibilityservice.IAccessibilityServiceDelegate))) {
return ((android.accessibilityservice.IAccessibilityServiceDelegate)iin);
}
return new android.accessibilityservice.IAccessibilityServiceDelegate.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onAccessibilityEvent:
{
data.enforceInterface(DESCRIPTOR);
android.view.accessibility.AccessibilityEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.accessibility.AccessibilityEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onAccessibilityEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onInterrupt:
{
data.enforceInterface(DESCRIPTOR);
this.onInterrupt();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.accessibilityservice.IAccessibilityServiceDelegate
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Delegate an {@link android.view.accessibility.AccessibilityEvent}.
     */
public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onAccessibilityEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Delegate an interrupt request.
     */
public void onInterrupt() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onInterrupt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onAccessibilityEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onInterrupt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * Delegate an {@link android.view.accessibility.AccessibilityEvent}.
     */
public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) throws android.os.RemoteException;
/**
     * Delegate an interrupt request.
     */
public void onInterrupt() throws android.os.RemoteException;
}
