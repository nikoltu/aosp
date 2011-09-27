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


#if ENABLE(DATAGRID)

#include "ExceptionCode.h"
#include "V8Collection.h"
#include "V8DataGridColumn.h"
#include "V8DataGridColumnList.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace DataGridColumnListInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> lengthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.DataGridColumnList.length._get");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(info.Holder());
    return v8::Integer::NewFromUnsigned(imp->length());
  }

  static v8::Handle<v8::Value> sortColumnAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.DataGridColumnList.sortColumn._get");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(info.Holder());
    return toV8(imp->sortColumn());
  }

  static v8::Handle<v8::Value> primaryColumnAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.DataGridColumnList.primaryColumn._get");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(info.Holder());
    return toV8(imp->primaryColumn());
  }

  static v8::Handle<v8::Value> itemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.DataGridColumnList.item");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    int index = toInt32(args[0]);
    if (UNLIKELY(index < 0)) {
      ec = INDEX_SIZE_ERR;
      goto fail;
    }
    return toV8(imp->item(index));
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> addCallback(const v8::Arguments& args) {
    INC_STATS("DOM.DataGridColumnList.add");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(args.Holder());
    V8Parameter<> id = args[0];
    V8Parameter<> label = args[1];
    V8Parameter<> type = args[2];
    bool primary = args[3]->BooleanValue();
    int sortable = toInt32(args[4]);
    return toV8(imp->add(id, label, type, primary, sortable));
  }

  static v8::Handle<v8::Value> removeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.DataGridColumnList.remove");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(args.Holder());
    DataGridColumn* column = V8DataGridColumn::HasInstance(args[0]) ? V8DataGridColumn::toNative(v8::Handle<v8::Object>::Cast(args[0])) : 0;
    imp->remove(column);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> moveCallback(const v8::Arguments& args) {
    INC_STATS("DOM.DataGridColumnList.move");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(args.Holder());
    DataGridColumn* column = V8DataGridColumn::HasInstance(args[0]) ? V8DataGridColumn::toNative(v8::Handle<v8::Object>::Cast(args[0])) : 0;
    unsigned index = toInt32(args[1]);
    imp->move(column, index);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> clearCallback(const v8::Arguments& args) {
    INC_STATS("DOM.DataGridColumnList.clear");
    DataGridColumnList* imp = V8DataGridColumnList::toNative(args.Holder());
    imp->clear();
    return v8::Handle<v8::Value>();
  }

} // namespace DataGridColumnListInternal

static const BatchedAttribute DataGridColumnList_attrs[] = {
    {
        // Attribute 'length' (Type: 'readonly attribute' ExtAttr: '')
        "length",
        DataGridColumnListInternal::lengthAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'sortColumn' (Type: 'readonly attribute' ExtAttr: '')
        "sortColumn",
        DataGridColumnListInternal::sortColumnAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'primaryColumn' (Type: 'readonly attribute' ExtAttr: '')
        "primaryColumn",
        DataGridColumnListInternal::primaryColumnAttrGetter,
        0,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback DataGridColumnList_callbacks[] = {
  {"item", DataGridColumnListInternal::itemCallback},
  {"add", DataGridColumnListInternal::addCallback},
  {"clear", DataGridColumnListInternal::clearCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8DataGridColumnListTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "DataGridColumnList",
      v8::Persistent<v8::FunctionTemplate>(), V8DataGridColumnList::internalFieldCount,
      DataGridColumnList_attrs, sizeof(DataGridColumnList_attrs)/sizeof(*DataGridColumnList_attrs),
      DataGridColumnList_callbacks, sizeof(DataGridColumnList_callbacks)/sizeof(*DataGridColumnList_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  
  setCollectionIndexedGetter<DataGridColumnList, DataGridColumn>(desc, V8ClassIndex::DATAGRIDCOLUMN);
  desc->InstanceTemplate()->SetNamedPropertyHandler(V8DataGridColumnList::namedPropertyGetter, 0, 0, 0, 0);

  // Custom Signature 'remove'
  const int remove_argc = 1;
  v8::Handle<v8::FunctionTemplate> remove_argv[remove_argc] = { V8DataGridColumn::GetRawTemplate() };
  v8::Handle<v8::Signature> remove_signature = v8::Signature::New(desc, remove_argc, remove_argv);
  proto->Set(v8::String::New("remove"), v8::FunctionTemplate::New(DataGridColumnListInternal::removeCallback, v8::Handle<v8::Value>(), remove_signature));

  // Custom Signature 'move'
  const int move_argc = 2;
  v8::Handle<v8::FunctionTemplate> move_argv[move_argc] = { V8DataGridColumn::GetRawTemplate(), v8::Handle<v8::FunctionTemplate>() };
  v8::Handle<v8::Signature> move_signature = v8::Signature::New(desc, move_argc, move_argv);
  proto->Set(v8::String::New("move"), v8::FunctionTemplate::New(DataGridColumnListInternal::moveCallback, v8::Handle<v8::Value>(), move_signature));

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8DataGridColumnList::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8DataGridColumnList_raw_cache_ = createRawTemplate();
  return V8DataGridColumnList_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8DataGridColumnList::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8DataGridColumnList_cache_ = ConfigureV8DataGridColumnListTemplate(GetRawTemplate());
  return V8DataGridColumnList_cache_;
}

DataGridColumnList* V8DataGridColumnList::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<DataGridColumnList*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8DataGridColumnList::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8DataGridColumnList::wrap(DataGridColumnList* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::DATAGRIDCOLUMNLIST, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<DataGridColumnList > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(DataGridColumnList* impl) {
  if (!impl)
    return v8::Null();
  return V8DataGridColumnList::wrap(impl);
}
} // namespace WebCore

#endif // ENABLE(DATAGRID)