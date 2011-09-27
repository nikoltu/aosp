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

#include "AtomicString.h"
#include "V8Collection.h"
#include "V8MimeType.h"
#include "V8Plugin.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace PluginInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> nameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.Plugin.name._get");
    Plugin* imp = V8Plugin::toNative(info.Holder());
    return v8String(imp->name());
  }

  static v8::Handle<v8::Value> filenameAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.Plugin.filename._get");
    Plugin* imp = V8Plugin::toNative(info.Holder());
    return v8String(imp->filename());
  }

  static v8::Handle<v8::Value> descriptionAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.Plugin.description._get");
    Plugin* imp = V8Plugin::toNative(info.Holder());
    return v8String(imp->description());
  }

  static v8::Handle<v8::Value> lengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.Plugin.length._get");
    Plugin* imp = V8Plugin::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->length());
  }

  static v8::Handle<v8::Value> itemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.Plugin.item");
    Plugin* imp = V8Plugin::toNative(args.Holder());
    unsigned index = toInt32(args[0]);
    return toV8(imp->item(index));
  }

  static v8::Handle<v8::Value> namedItemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.Plugin.namedItem");
    Plugin* imp = V8Plugin::toNative(args.Holder());
    V8Parameter<> name = args[0];
    return toV8(imp->namedItem(name));
  }

} // namespace PluginInternal

static const BatchedAttribute Plugin_attrs[] = {
    {
        // Attribute 'name' (Type: 'readonly attribute' ExtAttr: '')
        "name",
        PluginInternal::nameAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'filename' (Type: 'readonly attribute' ExtAttr: '')
        "filename",
        PluginInternal::filenameAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'description' (Type: 'readonly attribute' ExtAttr: '')
        "description",
        PluginInternal::descriptionAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'length' (Type: 'readonly attribute' ExtAttr: '')
        "length",
        PluginInternal::lengthAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback Plugin_callbacks[] = {
  {"item", PluginInternal::itemCallback},
  {"namedItem", PluginInternal::namedItemCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8PluginTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "Plugin",
      v8::Persistent<v8::FunctionTemplate>(), V8Plugin::internalFieldCount,
      Plugin_attrs, sizeof(Plugin_attrs)/sizeof(*Plugin_attrs),
      Plugin_callbacks, sizeof(Plugin_callbacks)/sizeof(*Plugin_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  setCollectionIndexedGetter<Plugin, MimeType>(desc, V8ClassIndex::MIMETYPE);
  setCollectionNamedGetter<Plugin, MimeType>(desc, V8ClassIndex::MIMETYPE);

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8Plugin::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8Plugin_raw_cache_ = createRawTemplate();
  return V8Plugin_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8Plugin::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8Plugin_cache_ = ConfigureV8PluginTemplate(GetRawTemplate());
  return V8Plugin_cache_;
}

Plugin* V8Plugin::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<Plugin*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8Plugin::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8Plugin::wrap(Plugin* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::PLUGIN, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<Plugin > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(Plugin* impl) {
  if (!impl)
    return v8::Null();
  return V8Plugin::wrap(impl);
}
} // namespace WebCore
