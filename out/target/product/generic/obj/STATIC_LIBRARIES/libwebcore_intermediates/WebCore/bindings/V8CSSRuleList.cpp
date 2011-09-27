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

#include "V8CSSRule.h"
#include "V8CSSRuleList.h"
#include "V8Collection.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace CSSRuleListInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> lengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CSSRuleList.length._get");
    CSSRuleList* imp = V8CSSRuleList::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->length());
  }

  static v8::Handle<v8::Value> itemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CSSRuleList.item");
    CSSRuleList* imp = V8CSSRuleList::toNative(args.Holder());
    unsigned index = toInt32(args[0]);
    return toV8(imp->item(index));
  }

} // namespace CSSRuleListInternal

static const BatchedAttribute CSSRuleList_attrs[] = {
    {
        // Attribute 'length' (Type: 'readonly attribute' ExtAttr: '')
        "length",
        CSSRuleListInternal::lengthAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback CSSRuleList_callbacks[] = {
  {"item", CSSRuleListInternal::itemCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8CSSRuleListTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "CSSRuleList",
      v8::Persistent<v8::FunctionTemplate>(), V8CSSRuleList::internalFieldCount,
      CSSRuleList_attrs, sizeof(CSSRuleList_attrs)/sizeof(*CSSRuleList_attrs),
      CSSRuleList_callbacks, sizeof(CSSRuleList_callbacks)/sizeof(*CSSRuleList_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  setCollectionIndexedGetter<CSSRuleList, CSSRule>(desc, V8ClassIndex::CSSRULE);

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8CSSRuleList::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CSSRuleList_raw_cache_ = createRawTemplate();
  return V8CSSRuleList_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8CSSRuleList::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CSSRuleList_cache_ = ConfigureV8CSSRuleListTemplate(GetRawTemplate());
  return V8CSSRuleList_cache_;
}

CSSRuleList* V8CSSRuleList::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<CSSRuleList*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8CSSRuleList::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8CSSRuleList::wrap(CSSRuleList* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::CSSRULELIST, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<CSSRuleList > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(CSSRuleList* impl) {
  if (!impl)
    return v8::Null();
  return V8CSSRuleList::wrap(impl);
}
} // namespace WebCore
