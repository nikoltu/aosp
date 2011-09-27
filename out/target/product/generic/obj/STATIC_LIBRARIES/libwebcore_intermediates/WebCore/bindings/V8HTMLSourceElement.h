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

#if ENABLE(VIDEO)


#ifndef V8HTMLSourceElement_H
#define V8HTMLSourceElement_H

#include <v8.h>
#include <wtf/HashMap.h>
#include "StringHash.h"
#include "V8Index.h"
#include "HTMLSourceElement.h"

namespace WebCore {

class V8HTMLSourceElement {

 public:
  static bool HasInstance(v8::Handle<v8::Value> value);
  static v8::Persistent<v8::FunctionTemplate> GetRawTemplate();
  static v8::Persistent<v8::FunctionTemplate> GetTemplate();
  static HTMLSourceElement* toNative(v8::Handle<v8::Object>);
  static v8::Handle<v8::Object> wrap(HTMLSourceElement*);
  static const int cacheIndex = v8DefaultWrapperInternalFieldCount + 0;
  static const int internalFieldCount = v8DefaultWrapperInternalFieldCount + 1;
};

  v8::Handle<v8::Value> toV8(HTMLSourceElement*);
  v8::Handle<v8::Value> toV8(PassRefPtr<HTMLSourceElement >);
}

#endif // V8HTMLSourceElement_H
#endif // ENABLE(VIDEO)

