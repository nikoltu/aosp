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

#include "ExceptionCode.h"
#include "V8CSSCharsetRule.h"
#include "V8CSSRule.h"

namespace WebCore {
namespace CSSCharsetRuleInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> encodingAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CSSCharsetRule.encoding._get");
    CSSCharsetRule* imp = V8CSSCharsetRule::toNative(info.Holder());
    return v8StringOrNull(imp->encoding());
  }

  static void encodingAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CSSCharsetRule.encoding._set");
    CSSCharsetRule* imp = V8CSSCharsetRule::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    ExceptionCode ec = 0;
    imp->setEncoding(v, ec);
    if (UNLIKELY(ec))
        V8Proxy::setDOMException(ec);
    return;
  }

} // namespace CSSCharsetRuleInternal

static const BatchedAttribute CSSCharsetRule_attrs[] = {
    {
        // Attribute 'encoding' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString ConvertNullStringTo')
        "encoding",
        CSSCharsetRuleInternal::encodingAttrGetter,
        CSSCharsetRuleInternal::encodingAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8CSSCharsetRuleTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "CSSCharsetRule",
      V8CSSRule::GetTemplate(), V8CSSCharsetRule::internalFieldCount,
      CSSCharsetRule_attrs, sizeof(CSSCharsetRule_attrs)/sizeof(*CSSCharsetRule_attrs),
      NULL, 0);
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8CSSCharsetRule::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CSSCharsetRule_raw_cache_ = createRawTemplate();
  return V8CSSCharsetRule_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8CSSCharsetRule::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CSSCharsetRule_cache_ = ConfigureV8CSSCharsetRuleTemplate(GetRawTemplate());
  return V8CSSCharsetRule_cache_;
}

CSSCharsetRule* V8CSSCharsetRule::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<CSSCharsetRule*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8CSSCharsetRule::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8CSSCharsetRule::wrap(CSSCharsetRule* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::CSSCHARSETRULE, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<CSSCharsetRule > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(CSSCharsetRule* impl) {
  if (!impl)
    return v8::Null();
  return V8CSSCharsetRule::wrap(impl);
}
} // namespace WebCore