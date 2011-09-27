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

#include "V8CSSPrimitiveValue.h"
#include "V8RGBColor.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace RGBColorInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> redAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.RGBColor.red._get");
    RGBColor* imp = V8RGBColor::toNative(info.Holder());
    return toV8(imp->red());
  }

  static v8::Handle<v8::Value> greenAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.RGBColor.green._get");
    RGBColor* imp = V8RGBColor::toNative(info.Holder());
    return toV8(imp->green());
  }

  static v8::Handle<v8::Value> blueAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.RGBColor.blue._get");
    RGBColor* imp = V8RGBColor::toNative(info.Holder());
    return toV8(imp->blue());
  }

} // namespace RGBColorInternal

static const BatchedAttribute RGBColor_attrs[] = {
    {
        // Attribute 'red' (Type: 'readonly attribute' ExtAttr: '')
        "red",
        RGBColorInternal::redAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'green' (Type: 'readonly attribute' ExtAttr: '')
        "green",
        RGBColorInternal::greenAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'blue' (Type: 'readonly attribute' ExtAttr: '')
        "blue",
        RGBColorInternal::blueAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8RGBColorTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "RGBColor",
      v8::Persistent<v8::FunctionTemplate>(), V8RGBColor::internalFieldCount,
      RGBColor_attrs, sizeof(RGBColor_attrs)/sizeof(*RGBColor_attrs),
      NULL, 0);
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8RGBColor::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8RGBColor_raw_cache_ = createRawTemplate();
  return V8RGBColor_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8RGBColor::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8RGBColor_cache_ = ConfigureV8RGBColorTemplate(GetRawTemplate());
  return V8RGBColor_cache_;
}

RGBColor* V8RGBColor::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<RGBColor*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8RGBColor::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8RGBColor::wrap(RGBColor* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::RGBCOLOR, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<RGBColor > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(RGBColor* impl) {
  if (!impl)
    return v8::Null();
  return V8RGBColor::wrap(impl);
}
} // namespace WebCore
