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

#include "V8HTMLElement.h"
#include "V8HTMLParagraphElement.h"

namespace WebCore {
namespace HTMLParagraphElementInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> alignAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLParagraphElement.align._get");
    HTMLParagraphElement* imp = V8HTMLParagraphElement::toNative(info.Holder());
    return v8String(imp->align());
  }

  static void alignAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLParagraphElement.align._set");
    HTMLParagraphElement* imp = V8HTMLParagraphElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setAlign(v);
    return;
  }

} // namespace HTMLParagraphElementInternal

static const BatchedAttribute HTMLParagraphElement_attrs[] = {
    {
        // Attribute 'align' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "align",
        HTMLParagraphElementInternal::alignAttrGetter,
        HTMLParagraphElementInternal::alignAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8HTMLParagraphElementTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "HTMLParagraphElement",
      V8HTMLElement::GetTemplate(), V8HTMLParagraphElement::internalFieldCount,
      HTMLParagraphElement_attrs, sizeof(HTMLParagraphElement_attrs)/sizeof(*HTMLParagraphElement_attrs),
      NULL, 0);
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLParagraphElement::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLParagraphElement_raw_cache_ = createRawTemplate();
  return V8HTMLParagraphElement_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLParagraphElement::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLParagraphElement_cache_ = ConfigureV8HTMLParagraphElementTemplate(GetRawTemplate());
  return V8HTMLParagraphElement_cache_;
}

HTMLParagraphElement* V8HTMLParagraphElement::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<HTMLParagraphElement*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8HTMLParagraphElement::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8HTMLParagraphElement::wrap(HTMLParagraphElement* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  if (impl->document()) {
    proxy = V8Proxy::retrieve(impl->document()->frame());
    if (proxy && static_cast<Node*>(impl->document()) == static_cast<Node*>(impl))
      proxy->windowShell()->initContextIfNeeded();
  }

  wrapper = V8DOMWrapper::getWrapper(impl);
  if (!wrapper.IsEmpty())
    return wrapper;

  v8::Handle<v8::Context> context;
  if (proxy)
    context = proxy->context();

  // Enter the node's context and create the wrapper in that context.
  if (!context.IsEmpty())
    context->Enter();
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::HTMLPARAGRAPHELEMENT, impl);
  // Exit the node's context if it was entered.
  if (!context.IsEmpty())
    context->Exit();
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMNodeMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<HTMLParagraphElement > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(HTMLParagraphElement* impl) {
  if (!impl)
    return v8::Null();
  return V8HTMLParagraphElement::wrap(impl);
}
} // namespace WebCore