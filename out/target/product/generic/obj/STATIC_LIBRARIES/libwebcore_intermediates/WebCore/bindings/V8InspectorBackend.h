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

#if ENABLE(INSPECTOR)


#ifndef V8InspectorBackend_H
#define V8InspectorBackend_H

#include <v8.h>
#include <wtf/HashMap.h>
#include "StringHash.h"
#include "V8Index.h"
#include "InspectorBackend.h"

namespace WebCore {

class V8InspectorBackend {

 public:
  static bool HasInstance(v8::Handle<v8::Value> value);
  static v8::Persistent<v8::FunctionTemplate> GetRawTemplate();
  static v8::Persistent<v8::FunctionTemplate> GetTemplate();
  static InspectorBackend* toNative(v8::Handle<v8::Object>);
  static v8::Handle<v8::Object> wrap(InspectorBackend*);
  static v8::Handle<v8::Value> storeLastActivePanelCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> saveFrontendSettingsCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> toggleNodeSearchCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> searchingForNodeCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> resourceTrackingEnabledCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> enableResourceTrackingCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> disableResourceTrackingCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> getResourceContentCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> startTimelineProfilerCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> stopTimelineProfilerCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> setInjectedScriptSourceCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> dispatchOnInjectedScriptCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> getChildNodesCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> setAttributeCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> removeAttributeCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> setTextNodeValueCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> getEventListenersForNodeCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> copyNodeCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> removeNodeCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> highlightDOMNodeCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> hideDOMNodeHighlightCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> getCookiesCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> deleteCookieCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> releaseWrapperObjectGroupCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> didEvaluateForTestInFrontendCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> getDatabaseTableNamesCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> getDOMStorageEntriesCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> setDOMStorageItemCallback(const v8::Arguments&);
  static v8::Handle<v8::Value> removeDOMStorageItemCallback(const v8::Arguments&);
  static const int internalFieldCount = v8DefaultWrapperInternalFieldCount + 0;
};

  v8::Handle<v8::Value> toV8(InspectorBackend*);
  v8::Handle<v8::Value> toV8(PassRefPtr<InspectorBackend >);
}

#endif // V8InspectorBackend_H
#endif // ENABLE(INSPECTOR)
