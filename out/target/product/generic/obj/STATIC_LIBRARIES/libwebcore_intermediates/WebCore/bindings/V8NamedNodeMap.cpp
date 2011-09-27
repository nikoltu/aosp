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
#include "V8Collection.h"
#include "V8NamedNodeMap.h"
#include "V8Node.h"

namespace WebCore {
namespace NamedNodeMapInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> lengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.NamedNodeMap.length._get");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->length());
  }

  static v8::Handle<v8::Value> getNamedItemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.NamedNodeMap.getNamedItem");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(args.Holder());
    V8Parameter<> name = args[0];
    return toV8(imp->getNamedItem(name));
  }

  static v8::Handle<v8::Value> setNamedItemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.NamedNodeMap.setNamedItem");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    Node* node = V8Node::HasInstance(args[0]) ? V8Node::toNative(v8::Handle<v8::Object>::Cast(args[0])) : 0;
    RefPtr<Node> result = imp->setNamedItem(node, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> removeNamedItemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.NamedNodeMap.removeNamedItem");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    V8Parameter<> name = args[0];
    RefPtr<Node> result = imp->removeNamedItem(name, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> itemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.NamedNodeMap.item");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(args.Holder());
    unsigned index = toInt32(args[0]);
    return toV8(imp->item(index));
  }

  static v8::Handle<v8::Value> getNamedItemNSCallback(const v8::Arguments& args) {
    INC_STATS("DOM.NamedNodeMap.getNamedItemNS");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(args.Holder());
    V8Parameter<WithNullCheck> namespaceURI = args[0];
    V8Parameter<> localName = args[1];
    return toV8(imp->getNamedItemNS(namespaceURI, localName));
  }

  static v8::Handle<v8::Value> setNamedItemNSCallback(const v8::Arguments& args) {
    INC_STATS("DOM.NamedNodeMap.setNamedItemNS");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    Node* node = V8Node::HasInstance(args[0]) ? V8Node::toNative(v8::Handle<v8::Object>::Cast(args[0])) : 0;
    RefPtr<Node> result = imp->setNamedItemNS(node, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> removeNamedItemNSCallback(const v8::Arguments& args) {
    INC_STATS("DOM.NamedNodeMap.removeNamedItemNS");
    NamedNodeMap* imp = V8NamedNodeMap::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    V8Parameter<WithNullCheck> namespaceURI = args[0];
    V8Parameter<> localName = args[1];
    RefPtr<Node> result = imp->removeNamedItemNS(namespaceURI, localName, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

} // namespace NamedNodeMapInternal

static const BatchedAttribute NamedNodeMap_attrs[] = {
    {
        // Attribute 'length' (Type: 'readonly attribute' ExtAttr: '')
        "length",
        NamedNodeMapInternal::lengthAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback NamedNodeMap_callbacks[] = {
  {"getNamedItem", NamedNodeMapInternal::getNamedItemCallback},
  {"removeNamedItem", NamedNodeMapInternal::removeNamedItemCallback},
  {"item", NamedNodeMapInternal::itemCallback},
  {"getNamedItemNS", NamedNodeMapInternal::getNamedItemNSCallback},
  {"removeNamedItemNS", NamedNodeMapInternal::removeNamedItemNSCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8NamedNodeMapTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "NamedNodeMap",
      v8::Persistent<v8::FunctionTemplate>(), V8NamedNodeMap::internalFieldCount,
      NamedNodeMap_attrs, sizeof(NamedNodeMap_attrs)/sizeof(*NamedNodeMap_attrs),
      NamedNodeMap_callbacks, sizeof(NamedNodeMap_callbacks)/sizeof(*NamedNodeMap_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  setCollectionIndexedGetter<NamedNodeMap, Node>(desc, V8ClassIndex::NODE);
  desc->InstanceTemplate()->SetNamedPropertyHandler(V8NamedNodeMap::namedPropertyGetter, 0, 0, 0, 0);

  // Custom Signature 'setNamedItem'
  const int setNamedItem_argc = 1;
  v8::Handle<v8::FunctionTemplate> setNamedItem_argv[setNamedItem_argc] = { V8Node::GetRawTemplate() };
  v8::Handle<v8::Signature> setNamedItem_signature = v8::Signature::New(desc, setNamedItem_argc, setNamedItem_argv);
  proto->Set(v8::String::New("setNamedItem"), v8::FunctionTemplate::New(NamedNodeMapInternal::setNamedItemCallback, v8::Handle<v8::Value>(), setNamedItem_signature));

  // Custom Signature 'setNamedItemNS'
  const int setNamedItemNS_argc = 1;
  v8::Handle<v8::FunctionTemplate> setNamedItemNS_argv[setNamedItemNS_argc] = { V8Node::GetRawTemplate() };
  v8::Handle<v8::Signature> setNamedItemNS_signature = v8::Signature::New(desc, setNamedItemNS_argc, setNamedItemNS_argv);
  proto->Set(v8::String::New("setNamedItemNS"), v8::FunctionTemplate::New(NamedNodeMapInternal::setNamedItemNSCallback, v8::Handle<v8::Value>(), setNamedItemNS_signature));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8NamedNodeMap::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8NamedNodeMap_raw_cache_ = createRawTemplate();
  return V8NamedNodeMap_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8NamedNodeMap::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8NamedNodeMap_cache_ = ConfigureV8NamedNodeMapTemplate(GetRawTemplate());
  return V8NamedNodeMap_cache_;
}

NamedNodeMap* V8NamedNodeMap::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<NamedNodeMap*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8NamedNodeMap::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8NamedNodeMap::wrap(NamedNodeMap* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::NAMEDNODEMAP, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<NamedNodeMap > impl) {
  return toV8(impl.get());
}
} // namespace WebCore