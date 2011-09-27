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


#if ENABLE(VIDEO)

#include "V8MediaError.h"

namespace WebCore {
namespace MediaErrorInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> codeAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.MediaError.code._get");
    MediaError* imp = V8MediaError::toNative(info.Holder());
    return v8::Integer::New(imp->code());
  }

} // namespace MediaErrorInternal

static const BatchedAttribute MediaError_attrs[] = {
    {
        // Attribute 'code' (Type: 'readonly attribute' ExtAttr: '')
        "code",
        MediaErrorInternal::codeAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedConstant MediaError_consts[] = {
  { "MEDIA_ERR_ABORTED", static_cast<signed int>(1) },
  { "MEDIA_ERR_NETWORK", static_cast<signed int>(2) },
  { "MEDIA_ERR_DECODE", static_cast<signed int>(3) },
  { "MEDIA_ERR_SRC_NOT_SUPPORTED", static_cast<signed int>(4) },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8MediaErrorTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "MediaError",
      v8::Persistent<v8::FunctionTemplate>(), V8MediaError::internalFieldCount,
      MediaError_attrs, sizeof(MediaError_attrs)/sizeof(*MediaError_attrs),
      NULL, 0);
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  batchConfigureConstants(desc, proto, MediaError_consts, sizeof(MediaError_consts)/sizeof(*MediaError_consts));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8MediaError::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8MediaError_raw_cache_ = createRawTemplate();
  return V8MediaError_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8MediaError::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8MediaError_cache_ = ConfigureV8MediaErrorTemplate(GetRawTemplate());
  return V8MediaError_cache_;
}

MediaError* V8MediaError::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<MediaError*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8MediaError::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8MediaError::wrap(MediaError* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::MEDIAERROR, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<MediaError > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(MediaError* impl) {
  if (!impl)
    return v8::Null();
  return V8MediaError::wrap(impl);
}
} // namespace WebCore

#endif // ENABLE(VIDEO)