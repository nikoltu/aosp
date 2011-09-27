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
#include "V8WebGLFloatArray.h"

namespace WebCore {
namespace WebGLFloatArrayInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> getCallback(const v8::Arguments& args) {
    INC_STATS("DOM.WebGLFloatArray.get");
    WebGLFloatArray* imp = V8WebGLFloatArray::toNative(args.Holder());
    unsigned index = toInt32(args[0]);
    return v8::Number::New(imp->get(index));
  }

} // namespace WebGLFloatArrayInternal

static const BatchedCallback WebGLFloatArray_callbacks[] = {
  {"get", WebGLFloatArrayInternal::getCallback},
  {"set", V8WebGLFloatArray::setCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8WebGLFloatArrayTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "WebGLFloatArray",
      V8WebGLArray::GetTemplate(), V8WebGLFloatArray::internalFieldCount,
      NULL, 0,
      WebGLFloatArray_callbacks, sizeof(WebGLFloatArray_callbacks)/sizeof(*WebGLFloatArray_callbacks));
      desc->SetCallHandler(V8WebGLFloatArray::constructorCallback);
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8WebGLFloatArray::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8WebGLFloatArray_raw_cache_ = createRawTemplate();
  return V8WebGLFloatArray_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8WebGLFloatArray::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8WebGLFloatArray_cache_ = ConfigureV8WebGLFloatArrayTemplate(GetRawTemplate());
  return V8WebGLFloatArray_cache_;
}

WebGLFloatArray* V8WebGLFloatArray::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<WebGLFloatArray*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8WebGLFloatArray::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8WebGLFloatArray::wrap(WebGLFloatArray* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::WEBGLFLOATARRAY, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<WebGLFloatArray > impl) {
  return toV8(impl.get());
}
} // namespace WebCore

#endif // ENABLE(3D_CANVAS)