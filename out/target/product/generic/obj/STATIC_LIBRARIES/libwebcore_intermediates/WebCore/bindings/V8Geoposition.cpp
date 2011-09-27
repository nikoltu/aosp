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

#include "V8Coordinates.h"
#include "V8Geoposition.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace GeopositionInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> coordsAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.Geoposition.coords._get");
    Geoposition* imp = V8Geoposition::toNative(info.Holder());
    return toV8(imp->coords());
  }

  static v8::Handle<v8::Value> timestampAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.Geoposition.timestamp._get");
    Geoposition* imp = V8Geoposition::toNative(info.Holder());
    return v8::Date::New(static_cast<double>(imp->timestamp()));
  }

} // namespace GeopositionInternal

static const BatchedAttribute Geoposition_attrs[] = {
    {
        // Attribute 'coords' (Type: 'readonly attribute' ExtAttr: '')
        "coords",
        GeopositionInternal::coordsAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'timestamp' (Type: 'readonly attribute' ExtAttr: '')
        "timestamp",
        GeopositionInternal::timestampAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8GeopositionTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "Geoposition",
      v8::Persistent<v8::FunctionTemplate>(), V8Geoposition::internalFieldCount,
      Geoposition_attrs, sizeof(Geoposition_attrs)/sizeof(*Geoposition_attrs),
      NULL, 0);
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8Geoposition::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8Geoposition_raw_cache_ = createRawTemplate();
  return V8Geoposition_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8Geoposition::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8Geoposition_cache_ = ConfigureV8GeopositionTemplate(GetRawTemplate());
  return V8Geoposition_cache_;
}

Geoposition* V8Geoposition::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<Geoposition*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8Geoposition::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8Geoposition::wrap(Geoposition* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::GEOPOSITION, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<Geoposition > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(Geoposition* impl) {
  if (!impl)
    return v8::Null();
  return V8Geoposition::wrap(impl);
}
} // namespace WebCore
