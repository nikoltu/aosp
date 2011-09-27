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


#if ENABLE(INSPECTOR)

#include "V8InspectorBackend.h"

namespace WebCore {
namespace InspectorBackendInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> storeLastActivePanelCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.storeLastActivePanel");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    V8Parameter<> panelName = args[0];
    imp->storeLastActivePanel(panelName);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> saveFrontendSettingsCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.saveFrontendSettings");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    V8Parameter<> settings = args[0];
    imp->saveFrontendSettings(settings);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> toggleNodeSearchCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.toggleNodeSearch");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    imp->toggleNodeSearch();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> searchingForNodeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.searchingForNode");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    return v8Boolean(imp->searchingForNode());
  }

  static v8::Handle<v8::Value> resourceTrackingEnabledCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.resourceTrackingEnabled");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    return v8Boolean(imp->resourceTrackingEnabled());
  }

  static v8::Handle<v8::Value> enableResourceTrackingCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.enableResourceTracking");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    bool always = args[0]->BooleanValue();
    imp->enableResourceTracking(always);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> disableResourceTrackingCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.disableResourceTracking");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    bool always = args[0]->BooleanValue();
    imp->disableResourceTracking(always);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> getResourceContentCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.getResourceContent");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    unsigned identifier = toInt32(args[1]);
    imp->getResourceContent(callId, identifier);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> startTimelineProfilerCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.startTimelineProfiler");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    imp->startTimelineProfiler();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> stopTimelineProfilerCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.stopTimelineProfiler");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    imp->stopTimelineProfiler();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setInjectedScriptSourceCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.setInjectedScriptSource");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    V8Parameter<> scriptSource = args[0];
    imp->setInjectedScriptSource(scriptSource);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> dispatchOnInjectedScriptCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.dispatchOnInjectedScript");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int injectedScriptId = toInt32(args[1]);
    V8Parameter<> methodName = args[2];
    V8Parameter<> arguments = args[3];
    bool async = args[4]->BooleanValue();
    imp->dispatchOnInjectedScript(callId, injectedScriptId, methodName, arguments, async);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> getChildNodesCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.getChildNodes");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int nodeId = toInt32(args[1]);
    imp->getChildNodes(callId, nodeId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setAttributeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.setAttribute");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int elementId = toInt32(args[1]);
    V8Parameter<> name = args[2];
    V8Parameter<> value = args[3];
    imp->setAttribute(callId, elementId, name, value);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> removeAttributeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.removeAttribute");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int elementId = toInt32(args[1]);
    V8Parameter<> name = args[2];
    imp->removeAttribute(callId, elementId, name);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setTextNodeValueCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.setTextNodeValue");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int nodeId = toInt32(args[1]);
    V8Parameter<> value = args[2];
    imp->setTextNodeValue(callId, nodeId, value);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> getEventListenersForNodeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.getEventListenersForNode");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int nodeId = toInt32(args[1]);
    imp->getEventListenersForNode(callId, nodeId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> copyNodeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.copyNode");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int nodeId = toInt32(args[0]);
    imp->copyNode(nodeId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> removeNodeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.removeNode");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int nodeId = toInt32(args[1]);
    imp->removeNode(callId, nodeId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> highlightDOMNodeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.highlightDOMNode");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int nodeId = toInt32(args[0]);
    imp->highlightDOMNode(nodeId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> hideDOMNodeHighlightCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.hideDOMNodeHighlight");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    imp->hideDOMNodeHighlight();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> getCookiesCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.getCookies");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    imp->getCookies(callId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> deleteCookieCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.deleteCookie");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    V8Parameter<> cookieName = args[0];
    V8Parameter<> domain = args[1];
    imp->deleteCookie(cookieName, domain);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> releaseWrapperObjectGroupCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.releaseWrapperObjectGroup");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int injectedScriptId = toInt32(args[0]);
    V8Parameter<> objectGroup = args[1];
    imp->releaseWrapperObjectGroup(injectedScriptId, objectGroup);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> didEvaluateForTestInFrontendCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.didEvaluateForTestInFrontend");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    V8Parameter<> jsonResult = args[1];
    imp->didEvaluateForTestInFrontend(callId, jsonResult);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> getDatabaseTableNamesCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.getDatabaseTableNames");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int databaseId = toInt32(args[1]);
    imp->getDatabaseTableNames(callId, databaseId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> getDOMStorageEntriesCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.getDOMStorageEntries");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int storageId = toInt32(args[1]);
    imp->getDOMStorageEntries(callId, storageId);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setDOMStorageItemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.setDOMStorageItem");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int storageId = toInt32(args[1]);
    V8Parameter<> key = args[2];
    V8Parameter<> value = args[3];
    imp->setDOMStorageItem(callId, storageId, key, value);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> removeDOMStorageItemCallback(const v8::Arguments& args) {
    INC_STATS("DOM.InspectorBackend.removeDOMStorageItem");
    InspectorBackend* imp = V8InspectorBackend::toNative(args.Holder());
    int callId = toInt32(args[0]);
    int storageId = toInt32(args[1]);
    V8Parameter<> key = args[2];
    imp->removeDOMStorageItem(callId, storageId, key);
    return v8::Handle<v8::Value>();
  }

} // namespace InspectorBackendInternal

static const BatchedCallback InspectorBackend_callbacks[] = {
  {"storeLastActivePanel", InspectorBackendInternal::storeLastActivePanelCallback},
  {"saveFrontendSettings", InspectorBackendInternal::saveFrontendSettingsCallback},
  {"toggleNodeSearch", InspectorBackendInternal::toggleNodeSearchCallback},
  {"searchingForNode", InspectorBackendInternal::searchingForNodeCallback},
  {"resourceTrackingEnabled", InspectorBackendInternal::resourceTrackingEnabledCallback},
  {"enableResourceTracking", InspectorBackendInternal::enableResourceTrackingCallback},
  {"disableResourceTracking", InspectorBackendInternal::disableResourceTrackingCallback},
  {"getResourceContent", InspectorBackendInternal::getResourceContentCallback},
  {"startTimelineProfiler", InspectorBackendInternal::startTimelineProfilerCallback},
  {"stopTimelineProfiler", InspectorBackendInternal::stopTimelineProfilerCallback},
  {"setInjectedScriptSource", InspectorBackendInternal::setInjectedScriptSourceCallback},
  {"dispatchOnInjectedScript", InspectorBackendInternal::dispatchOnInjectedScriptCallback},
  {"getChildNodes", InspectorBackendInternal::getChildNodesCallback},
  {"setAttribute", InspectorBackendInternal::setAttributeCallback},
  {"removeAttribute", InspectorBackendInternal::removeAttributeCallback},
  {"setTextNodeValue", InspectorBackendInternal::setTextNodeValueCallback},
  {"getEventListenersForNode", InspectorBackendInternal::getEventListenersForNodeCallback},
  {"copyNode", InspectorBackendInternal::copyNodeCallback},
  {"removeNode", InspectorBackendInternal::removeNodeCallback},
  {"highlightDOMNode", InspectorBackendInternal::highlightDOMNodeCallback},
  {"hideDOMNodeHighlight", InspectorBackendInternal::hideDOMNodeHighlightCallback},
  {"getCookies", InspectorBackendInternal::getCookiesCallback},
  {"deleteCookie", InspectorBackendInternal::deleteCookieCallback},
  {"releaseWrapperObjectGroup", InspectorBackendInternal::releaseWrapperObjectGroupCallback},
  {"didEvaluateForTestInFrontend", InspectorBackendInternal::didEvaluateForTestInFrontendCallback},
  {"getDatabaseTableNames", InspectorBackendInternal::getDatabaseTableNamesCallback},
  {"getDOMStorageEntries", InspectorBackendInternal::getDOMStorageEntriesCallback},
  {"setDOMStorageItem", InspectorBackendInternal::setDOMStorageItemCallback},
  {"removeDOMStorageItem", InspectorBackendInternal::removeDOMStorageItemCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8InspectorBackendTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "InspectorBackend",
      v8::Persistent<v8::FunctionTemplate>(), V8InspectorBackend::internalFieldCount,
      NULL, 0,
      InspectorBackend_callbacks, sizeof(InspectorBackend_callbacks)/sizeof(*InspectorBackend_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8InspectorBackend::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8InspectorBackend_raw_cache_ = createRawTemplate();
  return V8InspectorBackend_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8InspectorBackend::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8InspectorBackend_cache_ = ConfigureV8InspectorBackendTemplate(GetRawTemplate());
  return V8InspectorBackend_cache_;
}

InspectorBackend* V8InspectorBackend::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<InspectorBackend*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8InspectorBackend::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8InspectorBackend::wrap(InspectorBackend* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::INSPECTORBACKEND, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<InspectorBackend > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(InspectorBackend* impl) {
  if (!impl)
    return v8::Null();
  return V8InspectorBackend::wrap(impl);
}
} // namespace WebCore

#endif // ENABLE(INSPECTOR)
