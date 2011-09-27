/*
    This file is part of the WebKit open source project.
    This file has been generated by generate-bindings.pl. DO NOT MODIFY!

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Library General Public
    License as published by the Free Software Foundation; either
    version 2 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Library General Public License for more details.

    You should have received a copy of the GNU Library General Public License
    along with this library; see the file COPYING.LIB.  If not, write to
    the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
    Boston, MA 02111-1307, USA.
*/
#include "config.h"
#include "RuntimeEnabledFeatures.h"
#include "V8Proxy.h"
#include "V8Binding.h"
#include "V8BindingState.h"
#include "V8DOMWrapper.h"
#include "V8IsolatedContext.h"

#undef LOG


#if ENABLE(3D_CANVAS)

#include "V8WebGLArray.h"
#include "V8WebGLUnsignedByteArray.h"

namespace WebCore {
namespace WebGLUnsignedByteArrayInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> getCallback(const v8::Arguments& args) {
    INC_STATS("DOM.WebGLUnsignedByteArray.get");
    WebGLUnsignedByteArray* imp = V8WebGLUnsignedByteArray::toNative(args.Holder());
    unsigned index = toInt32(args[0]);
    return v8::Integer::New(imp->get(index));
  }

} // namespace WebGLUnsignedByteArrayInternal

static const BatchedCallback WebGLUnsignedByteArray_callbacks[] = {
  {"get", WebGLUnsignedByteArrayInternal::getCallback},
  {"set", V8WebGLUnsignedByteArray::setCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8WebGLUnsignedByteArrayTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "WebGLUnsignedByteArray",
      V8WebGLArray::GetTemplate(), V8WebGLUnsignedByteArray::internalFieldCount,
      NULL, 0,
      WebGLUnsignedByteArray_callbacks, sizeof(WebGLUnsignedByteArray_callbacks)/sizeof(*WebGLUnsignedByteArray_callbacks));
      desc->SetCallHandler(V8WebGLUnsignedByteArray::constructorCallback);
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8WebGLUnsignedByteArray::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8WebGLUnsignedByteArray_raw_cache_ = createRawTemplate();
  return V8WebGLUnsignedByteArray_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8WebGLUnsignedByteArray::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8WebGLUnsignedByteArray_cache_ = ConfigureV8WebGLUnsignedByteArrayTemplate(GetRawTemplate());
  return V8WebGLUnsignedByteArray_cache_;
}

WebGLUnsignedByteArray* V8WebGLUnsignedByteArray::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<WebGLUnsignedByteArray*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8WebGLUnsignedByteArray::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8WebGLUnsignedByteArray::wrap(WebGLUnsignedByteArray* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::WEBGLUNSIGNEDBYTEARRAY, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<WebGLUnsignedByteArray > impl) {
  return toV8(impl.get());
}
} // namespace WebCore

#endif // ENABLE(3D_CANVAS)