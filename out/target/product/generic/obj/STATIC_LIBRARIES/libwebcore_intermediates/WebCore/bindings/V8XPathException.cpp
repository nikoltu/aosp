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


#if ENABLE(XPATH)

#include "V8XPathException.h"

namespace WebCore {
namespace XPathExceptionInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> codeAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.XPathException.code._get");
    XPathException* imp = V8XPathException::toNative(info.Holder());
    return v8::Integer::New(imp->code());
  }

  static v8::Handle<v8::Value> nameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.XPathException.name._get");
    XPathException* imp = V8XPathException::toNative(info.Holder());
    return v8String(imp->name());
  }

  static v8::Handle<v8::Value> messageAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.XPathException.message._get");
    XPathException* imp = V8XPathException::toNative(info.Holder());
    return v8String(imp->message());
  }

  static v8::Handle<v8::Value> toStringCallback(const v8::Arguments& args) {
    INC_STATS("DOM.XPathException.toString");
    XPathException* imp = V8XPathException::toNative(args.Holder());
    return v8String(imp->toString());
  }

} // namespace XPathExceptionInternal

static const BatchedAttribute XPathException_attrs[] = {
    {
        // Attribute 'code' (Type: 'readonly attribute' ExtAttr: '')
        "code",
        XPathExceptionInternal::codeAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'name' (Type: 'readonly attribute' ExtAttr: '')
        "name",
        XPathExceptionInternal::nameAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'message' (Type: 'readonly attribute' ExtAttr: '')
        "message",
        XPathExceptionInternal::messageAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedConstant XPathException_consts[] = {
  { "INVALID_EXPRESSION_ERR", static_cast<signed int>(51) },
  { "TYPE_ERR", static_cast<signed int>(52) },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8XPathExceptionTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "XPathException",
      v8::Persistent<v8::FunctionTemplate>(), V8XPathException::internalFieldCount,
      XPathException_attrs, sizeof(XPathException_attrs)/sizeof(*XPathException_attrs),
      NULL, 0);
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  proto->Set(v8::String::New("toString"), v8::FunctionTemplate::New(XPathExceptionInternal::toStringCallback, v8::Handle<v8::Value>(), default_signature), static_cast<v8::PropertyAttribute>(v8::DontDelete|v8::DontEnum));
  batchConfigureConstants(desc, proto, XPathException_consts, sizeof(XPathException_consts)/sizeof(*XPathException_consts));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8XPathException::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8XPathException_raw_cache_ = createRawTemplate();
  return V8XPathException_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8XPathException::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8XPathException_cache_ = ConfigureV8XPathExceptionTemplate(GetRawTemplate());
  return V8XPathException_cache_;
}

XPathException* V8XPathException::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<XPathException*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8XPathException::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8XPathException::wrap(XPathException* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::XPATHEXCEPTION, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<XPathException > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(XPathException* impl) {
  if (!impl)
    return v8::Null();
  return V8XPathException::wrap(impl);
}
} // namespace WebCore

#endif // ENABLE(XPATH)
