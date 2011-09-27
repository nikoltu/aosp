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

#include "V8HTMLCollection.h"
#include "V8HTMLElement.h"
#include "V8HTMLMapElement.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace HTMLMapElementInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> areasAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLMapElement.areas._get");
    HTMLMapElement* imp = V8HTMLMapElement::toNative(info.Holder());
    return toV8(imp->areas());
  }

  static v8::Handle<v8::Value> nameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLMapElement.name._get");
    HTMLMapElement* imp = V8HTMLMapElement::toNative(info.Holder());
    return v8String(imp->name());
  }

  static void nameAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.HTMLMapElement.name._set");
    HTMLMapElement* imp = V8HTMLMapElement::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setName(v);
    return;
  }

} // namespace HTMLMapElementInternal

static const BatchedAttribute HTMLMapElement_attrs[] = {
    {
        // Attribute 'areas' (Type: 'readonly attribute' ExtAttr: '')
        "areas",
        HTMLMapElementInternal::areasAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'name' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "name",
        HTMLMapElementInternal::nameAttrGetter,
        HTMLMapElementInternal::nameAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8HTMLMapElementTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "HTMLMapElement",
      V8HTMLElement::GetTemplate(), V8HTMLMapElement::internalFieldCount,
      HTMLMapElement_attrs, sizeof(HTMLMapElement_attrs)/sizeof(*HTMLMapElement_attrs),
      NULL, 0);
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLMapElement::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLMapElement_raw_cache_ = createRawTemplate();
  return V8HTMLMapElement_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8HTMLMapElement::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8HTMLMapElement_cache_ = ConfigureV8HTMLMapElementTemplate(GetRawTemplate());
  return V8HTMLMapElement_cache_;
}

HTMLMapElement* V8HTMLMapElement::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<HTMLMapElement*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8HTMLMapElement::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8HTMLMapElement::wrap(HTMLMapElement* impl) {
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
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::HTMLMAPELEMENT, impl);
  // Exit the node's context if it was entered.
  if (!context.IsEmpty())
    context->Exit();
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMNodeMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<HTMLMapElement > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(HTMLMapElement* impl) {
  if (!impl)
    return v8::Null();
  return V8HTMLMapElement::wrap(impl);
}
} // namespace WebCore