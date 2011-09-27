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

#include "CanvasGradient.h"
#include "CanvasPattern.h"
#include "CanvasStyle.h"
#include "ExceptionCode.h"
#include "PlatformString.h"
#include "V8CanvasGradient.h"
#include "V8CanvasRenderingContext.h"
#include "V8CanvasRenderingContext2D.h"
#include "V8ImageData.h"
#include "V8TextMetrics.h"
#include "wtf/GetPtr.h"
#include "wtf/RefCounted.h"
#include "wtf/RefPtr.h"

namespace WebCore {
namespace CanvasRenderingContext2DInternal {

template <typename T> void V8_USE(T) { }

  static v8::Handle<v8::Value> globalAlphaAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.globalAlpha._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8::Number::New(imp->globalAlpha());
  }

  static void globalAlphaAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.globalAlpha._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    float v = static_cast<float>(value->NumberValue());
    imp->setGlobalAlpha(v);
    return;
  }

  static v8::Handle<v8::Value> globalCompositeOperationAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.globalCompositeOperation._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8String(imp->globalCompositeOperation());
  }

  static void globalCompositeOperationAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.globalCompositeOperation._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setGlobalCompositeOperation(v);
    return;
  }

  static v8::Handle<v8::Value> lineWidthAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.lineWidth._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8::Number::New(imp->lineWidth());
  }

  static void lineWidthAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.lineWidth._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    float v = static_cast<float>(value->NumberValue());
    imp->setLineWidth(v);
    return;
  }

  static v8::Handle<v8::Value> lineCapAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.lineCap._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8String(imp->lineCap());
  }

  static void lineCapAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.lineCap._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setLineCap(v);
    return;
  }

  static v8::Handle<v8::Value> lineJoinAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.lineJoin._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8String(imp->lineJoin());
  }

  static void lineJoinAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.lineJoin._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setLineJoin(v);
    return;
  }

  static v8::Handle<v8::Value> miterLimitAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.miterLimit._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8::Number::New(imp->miterLimit());
  }

  static void miterLimitAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.miterLimit._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    float v = static_cast<float>(value->NumberValue());
    imp->setMiterLimit(v);
    return;
  }

  static v8::Handle<v8::Value> shadowOffsetXAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowOffsetX._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8::Number::New(imp->shadowOffsetX());
  }

  static void shadowOffsetXAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowOffsetX._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    float v = static_cast<float>(value->NumberValue());
    imp->setShadowOffsetX(v);
    return;
  }

  static v8::Handle<v8::Value> shadowOffsetYAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowOffsetY._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8::Number::New(imp->shadowOffsetY());
  }

  static void shadowOffsetYAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowOffsetY._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    float v = static_cast<float>(value->NumberValue());
    imp->setShadowOffsetY(v);
    return;
  }

  static v8::Handle<v8::Value> shadowBlurAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowBlur._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8::Number::New(imp->shadowBlur());
  }

  static void shadowBlurAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowBlur._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    float v = static_cast<float>(value->NumberValue());
    imp->setShadowBlur(v);
    return;
  }

  static v8::Handle<v8::Value> shadowColorAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowColor._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8String(imp->shadowColor());
  }

  static void shadowColorAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.shadowColor._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    V8Parameter<WithNullCheck> v = value;
    imp->setShadowColor(v);
    return;
  }

  static v8::Handle<v8::Value> fontAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.font._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8String(imp->font());
  }

  static void fontAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.font._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    V8Parameter<> v = value;
    imp->setFont(v);
    return;
  }

  static v8::Handle<v8::Value> textAlignAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.textAlign._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8String(imp->textAlign());
  }

  static void textAlignAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.textAlign._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    V8Parameter<> v = value;
    imp->setTextAlign(v);
    return;
  }

  static v8::Handle<v8::Value> textBaselineAttrGetter(v8::Local<v8::String> name, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.textBaseline._get");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    return v8String(imp->textBaseline());
  }

  static void textBaselineAttrSetter(v8::Local<v8::String> name, v8::Local<v8::Value> value, const v8::AccessorInfo& info) {
    INC_STATS("DOM.CanvasRenderingContext2D.textBaseline._set");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(info.Holder());
    V8Parameter<> v = value;
    imp->setTextBaseline(v);
    return;
  }

  static v8::Handle<v8::Value> saveCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.save");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->save();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> restoreCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.restore");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->restore();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> scaleCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.scale");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float sx = static_cast<float>(args[0]->NumberValue());
    float sy = static_cast<float>(args[1]->NumberValue());
    imp->scale(sx, sy);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> rotateCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.rotate");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float angle = static_cast<float>(args[0]->NumberValue());
    imp->rotate(angle);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> translateCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.translate");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float tx = static_cast<float>(args[0]->NumberValue());
    float ty = static_cast<float>(args[1]->NumberValue());
    imp->translate(tx, ty);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> transformCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.transform");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float m11 = static_cast<float>(args[0]->NumberValue());
    float m12 = static_cast<float>(args[1]->NumberValue());
    float m21 = static_cast<float>(args[2]->NumberValue());
    float m22 = static_cast<float>(args[3]->NumberValue());
    float dx = static_cast<float>(args[4]->NumberValue());
    float dy = static_cast<float>(args[5]->NumberValue());
    imp->transform(m11, m12, m21, m22, dx, dy);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setTransformCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.setTransform");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float m11 = static_cast<float>(args[0]->NumberValue());
    float m12 = static_cast<float>(args[1]->NumberValue());
    float m21 = static_cast<float>(args[2]->NumberValue());
    float m22 = static_cast<float>(args[3]->NumberValue());
    float dx = static_cast<float>(args[4]->NumberValue());
    float dy = static_cast<float>(args[5]->NumberValue());
    imp->setTransform(m11, m12, m21, m22, dx, dy);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> createLinearGradientCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.createLinearGradient");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    float x0 = static_cast<float>(args[0]->NumberValue());
    float y0 = static_cast<float>(args[1]->NumberValue());
    float x1 = static_cast<float>(args[2]->NumberValue());
    float y1 = static_cast<float>(args[3]->NumberValue());
    RefPtr<CanvasGradient> result = imp->createLinearGradient(x0, y0, x1, y1, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> createRadialGradientCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.createRadialGradient");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    float x0 = static_cast<float>(args[0]->NumberValue());
    float y0 = static_cast<float>(args[1]->NumberValue());
    float r0 = static_cast<float>(args[2]->NumberValue());
    float x1 = static_cast<float>(args[3]->NumberValue());
    float y1 = static_cast<float>(args[4]->NumberValue());
    float r1 = static_cast<float>(args[5]->NumberValue());
    RefPtr<CanvasGradient> result = imp->createRadialGradient(x0, y0, r0, x1, y1, r1, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> clearRectCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.clearRect");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float x = static_cast<float>(args[0]->NumberValue());
    float y = static_cast<float>(args[1]->NumberValue());
    float width = static_cast<float>(args[2]->NumberValue());
    float height = static_cast<float>(args[3]->NumberValue());
    imp->clearRect(x, y, width, height);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> fillRectCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.fillRect");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float x = static_cast<float>(args[0]->NumberValue());
    float y = static_cast<float>(args[1]->NumberValue());
    float width = static_cast<float>(args[2]->NumberValue());
    float height = static_cast<float>(args[3]->NumberValue());
    imp->fillRect(x, y, width, height);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> beginPathCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.beginPath");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->beginPath();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> closePathCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.closePath");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->closePath();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> moveToCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.moveTo");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float x = static_cast<float>(args[0]->NumberValue());
    float y = static_cast<float>(args[1]->NumberValue());
    imp->moveTo(x, y);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> lineToCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.lineTo");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float x = static_cast<float>(args[0]->NumberValue());
    float y = static_cast<float>(args[1]->NumberValue());
    imp->lineTo(x, y);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> quadraticCurveToCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.quadraticCurveTo");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float cpx = static_cast<float>(args[0]->NumberValue());
    float cpy = static_cast<float>(args[1]->NumberValue());
    float x = static_cast<float>(args[2]->NumberValue());
    float y = static_cast<float>(args[3]->NumberValue());
    imp->quadraticCurveTo(cpx, cpy, x, y);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> bezierCurveToCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.bezierCurveTo");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float cp1x = static_cast<float>(args[0]->NumberValue());
    float cp1y = static_cast<float>(args[1]->NumberValue());
    float cp2x = static_cast<float>(args[2]->NumberValue());
    float cp2y = static_cast<float>(args[3]->NumberValue());
    float x = static_cast<float>(args[4]->NumberValue());
    float y = static_cast<float>(args[5]->NumberValue());
    imp->bezierCurveTo(cp1x, cp1y, cp2x, cp2y, x, y);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> arcToCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.arcTo");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    float x1 = static_cast<float>(args[0]->NumberValue());
    float y1 = static_cast<float>(args[1]->NumberValue());
    float x2 = static_cast<float>(args[2]->NumberValue());
    float y2 = static_cast<float>(args[3]->NumberValue());
    float radius = static_cast<float>(args[4]->NumberValue());
    imp->arcTo(x1, y1, x2, y2, radius, ec);
    if (UNLIKELY(ec)) goto fail;
    return v8::Handle<v8::Value>();
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> rectCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.rect");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float x = static_cast<float>(args[0]->NumberValue());
    float y = static_cast<float>(args[1]->NumberValue());
    float width = static_cast<float>(args[2]->NumberValue());
    float height = static_cast<float>(args[3]->NumberValue());
    imp->rect(x, y, width, height);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> arcCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.arc");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    float x = static_cast<float>(args[0]->NumberValue());
    float y = static_cast<float>(args[1]->NumberValue());
    float radius = static_cast<float>(args[2]->NumberValue());
    float startAngle = static_cast<float>(args[3]->NumberValue());
    float endAngle = static_cast<float>(args[4]->NumberValue());
    bool anticlockwise = args[5]->BooleanValue();
    imp->arc(x, y, radius, startAngle, endAngle, anticlockwise, ec);
    if (UNLIKELY(ec)) goto fail;
    return v8::Handle<v8::Value>();
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> fillCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.fill");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->fill();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> strokeCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.stroke");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->stroke();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> clipCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.clip");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->clip();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> isPointInPathCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.isPointInPath");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float x = static_cast<float>(args[0]->NumberValue());
    float y = static_cast<float>(args[1]->NumberValue());
    return v8Boolean(imp->isPointInPath(x, y));
  }

  static v8::Handle<v8::Value> measureTextCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.measureText");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    V8Parameter<> text = args[0];
    return toV8(imp->measureText(text));
  }

  static v8::Handle<v8::Value> setAlphaCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.setAlpha");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float alpha = static_cast<float>(args[0]->NumberValue());
    imp->setAlpha(alpha);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setCompositeOperationCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.setCompositeOperation");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    V8Parameter<> compositeOperation = args[0];
    imp->setCompositeOperation(compositeOperation);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setLineWidthCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.setLineWidth");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float width = static_cast<float>(args[0]->NumberValue());
    imp->setLineWidth(width);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setLineCapCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.setLineCap");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    V8Parameter<> cap = args[0];
    imp->setLineCap(cap);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setLineJoinCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.setLineJoin");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    V8Parameter<> join = args[0];
    imp->setLineJoin(join);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> setMiterLimitCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.setMiterLimit");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    float limit = static_cast<float>(args[0]->NumberValue());
    imp->setMiterLimit(limit);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> clearShadowCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.clearShadow");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    imp->clearShadow();
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> createImageDataCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.createImageData");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    float sw = static_cast<float>(args[0]->NumberValue());
    float sh = static_cast<float>(args[1]->NumberValue());
    RefPtr<ImageData> result = imp->createImageData(sw, sh, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

  static v8::Handle<v8::Value> getImageDataCallback(const v8::Arguments& args) {
    INC_STATS("DOM.CanvasRenderingContext2D.getImageData");
    CanvasRenderingContext2D* imp = V8CanvasRenderingContext2D::toNative(args.Holder());
    ExceptionCode ec = 0;
    {
    float sx = static_cast<float>(args[0]->NumberValue());
    float sy = static_cast<float>(args[1]->NumberValue());
    float sw = static_cast<float>(args[2]->NumberValue());
    float sh = static_cast<float>(args[3]->NumberValue());
    RefPtr<ImageData> result = imp->getImageData(sx, sy, sw, sh, ec);
    if (UNLIKELY(ec)) goto fail;
    return toV8(result.release());
    }
  fail:
    V8Proxy::setDOMException(ec);
    return v8::Handle<v8::Value>();
  }

} // namespace CanvasRenderingContext2DInternal

static const BatchedAttribute CanvasRenderingContext2D_attrs[] = {
    {
        // Attribute 'globalAlpha' (Type: 'attribute' ExtAttr: '')
        "globalAlpha",
        CanvasRenderingContext2DInternal::globalAlphaAttrGetter,
        CanvasRenderingContext2DInternal::globalAlphaAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'globalCompositeOperation' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "globalCompositeOperation",
        CanvasRenderingContext2DInternal::globalCompositeOperationAttrGetter,
        CanvasRenderingContext2DInternal::globalCompositeOperationAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'lineWidth' (Type: 'attribute' ExtAttr: '')
        "lineWidth",
        CanvasRenderingContext2DInternal::lineWidthAttrGetter,
        CanvasRenderingContext2DInternal::lineWidthAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'lineCap' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "lineCap",
        CanvasRenderingContext2DInternal::lineCapAttrGetter,
        CanvasRenderingContext2DInternal::lineCapAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'lineJoin' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "lineJoin",
        CanvasRenderingContext2DInternal::lineJoinAttrGetter,
        CanvasRenderingContext2DInternal::lineJoinAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'miterLimit' (Type: 'attribute' ExtAttr: '')
        "miterLimit",
        CanvasRenderingContext2DInternal::miterLimitAttrGetter,
        CanvasRenderingContext2DInternal::miterLimitAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'shadowOffsetX' (Type: 'attribute' ExtAttr: '')
        "shadowOffsetX",
        CanvasRenderingContext2DInternal::shadowOffsetXAttrGetter,
        CanvasRenderingContext2DInternal::shadowOffsetXAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'shadowOffsetY' (Type: 'attribute' ExtAttr: '')
        "shadowOffsetY",
        CanvasRenderingContext2DInternal::shadowOffsetYAttrGetter,
        CanvasRenderingContext2DInternal::shadowOffsetYAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'shadowBlur' (Type: 'attribute' ExtAttr: '')
        "shadowBlur",
        CanvasRenderingContext2DInternal::shadowBlurAttrGetter,
        CanvasRenderingContext2DInternal::shadowBlurAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'shadowColor' (Type: 'attribute' ExtAttr: 'ConvertNullToNullString')
        "shadowColor",
        CanvasRenderingContext2DInternal::shadowColorAttrGetter,
        CanvasRenderingContext2DInternal::shadowColorAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'font' (Type: 'attribute' ExtAttr: '')
        "font",
        CanvasRenderingContext2DInternal::fontAttrGetter,
        CanvasRenderingContext2DInternal::fontAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'textAlign' (Type: 'attribute' ExtAttr: '')
        "textAlign",
        CanvasRenderingContext2DInternal::textAlignAttrGetter,
        CanvasRenderingContext2DInternal::textAlignAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'textBaseline' (Type: 'attribute' ExtAttr: '')
        "textBaseline",
        CanvasRenderingContext2DInternal::textBaselineAttrGetter,
        CanvasRenderingContext2DInternal::textBaselineAttrSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'strokeStyle' (Type: 'attribute' ExtAttr: 'Custom')
        "strokeStyle",
        V8CanvasRenderingContext2D::strokeStyleAccessorGetter,
        V8CanvasRenderingContext2D::strokeStyleAccessorSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
    {
        // Attribute 'fillStyle' (Type: 'attribute' ExtAttr: 'Custom')
        "fillStyle",
        V8CanvasRenderingContext2D::fillStyleAccessorGetter,
        V8CanvasRenderingContext2D::fillStyleAccessorSetter,
        V8ClassIndex::INVALID_CLASS_INDEX /* no data */,
        static_cast<v8::AccessControl>(v8::DEFAULT),
        static_cast<v8::PropertyAttribute>(v8::None),
        0 /* on instance */
    },
};
static const BatchedCallback CanvasRenderingContext2D_callbacks[] = {
  {"save", CanvasRenderingContext2DInternal::saveCallback},
  {"restore", CanvasRenderingContext2DInternal::restoreCallback},
  {"scale", CanvasRenderingContext2DInternal::scaleCallback},
  {"rotate", CanvasRenderingContext2DInternal::rotateCallback},
  {"translate", CanvasRenderingContext2DInternal::translateCallback},
  {"transform", CanvasRenderingContext2DInternal::transformCallback},
  {"setTransform", CanvasRenderingContext2DInternal::setTransformCallback},
  {"createLinearGradient", CanvasRenderingContext2DInternal::createLinearGradientCallback},
  {"createRadialGradient", CanvasRenderingContext2DInternal::createRadialGradientCallback},
  {"clearRect", CanvasRenderingContext2DInternal::clearRectCallback},
  {"fillRect", CanvasRenderingContext2DInternal::fillRectCallback},
  {"beginPath", CanvasRenderingContext2DInternal::beginPathCallback},
  {"closePath", CanvasRenderingContext2DInternal::closePathCallback},
  {"moveTo", CanvasRenderingContext2DInternal::moveToCallback},
  {"lineTo", CanvasRenderingContext2DInternal::lineToCallback},
  {"quadraticCurveTo", CanvasRenderingContext2DInternal::quadraticCurveToCallback},
  {"bezierCurveTo", CanvasRenderingContext2DInternal::bezierCurveToCallback},
  {"arcTo", CanvasRenderingContext2DInternal::arcToCallback},
  {"rect", CanvasRenderingContext2DInternal::rectCallback},
  {"arc", CanvasRenderingContext2DInternal::arcCallback},
  {"fill", CanvasRenderingContext2DInternal::fillCallback},
  {"stroke", CanvasRenderingContext2DInternal::strokeCallback},
  {"clip", CanvasRenderingContext2DInternal::clipCallback},
  {"isPointInPath", CanvasRenderingContext2DInternal::isPointInPathCallback},
  {"fillText", V8CanvasRenderingContext2D::fillTextCallback},
  {"strokeText", V8CanvasRenderingContext2D::strokeTextCallback},
  {"measureText", CanvasRenderingContext2DInternal::measureTextCallback},
  {"setAlpha", CanvasRenderingContext2DInternal::setAlphaCallback},
  {"setCompositeOperation", CanvasRenderingContext2DInternal::setCompositeOperationCallback},
  {"setLineWidth", CanvasRenderingContext2DInternal::setLineWidthCallback},
  {"setLineCap", CanvasRenderingContext2DInternal::setLineCapCallback},
  {"setLineJoin", CanvasRenderingContext2DInternal::setLineJoinCallback},
  {"setMiterLimit", CanvasRenderingContext2DInternal::setMiterLimitCallback},
  {"clearShadow", CanvasRenderingContext2DInternal::clearShadowCallback},
  {"setStrokeColor", V8CanvasRenderingContext2D::setStrokeColorCallback},
  {"setFillColor", V8CanvasRenderingContext2D::setFillColorCallback},
  {"strokeRect", V8CanvasRenderingContext2D::strokeRectCallback},
  {"drawImage", V8CanvasRenderingContext2D::drawImageCallback},
  {"drawImageFromRect", V8CanvasRenderingContext2D::drawImageFromRectCallback},
  {"setShadow", V8CanvasRenderingContext2D::setShadowCallback},
  {"createPattern", V8CanvasRenderingContext2D::createPatternCallback},
  {"createImageData", CanvasRenderingContext2DInternal::createImageDataCallback},
  {"getImageData", CanvasRenderingContext2DInternal::getImageDataCallback},
  {"putImageData", V8CanvasRenderingContext2D::putImageDataCallback},
};
static v8::Persistent<v8::FunctionTemplate> ConfigureV8CanvasRenderingContext2DTemplate(v8::Persistent<v8::FunctionTemplate> desc) {
  v8::Local<v8::Signature> default_signature = configureTemplate(desc, "CanvasRenderingContext2D",
      V8CanvasRenderingContext::GetTemplate(), V8CanvasRenderingContext2D::internalFieldCount,
      CanvasRenderingContext2D_attrs, sizeof(CanvasRenderingContext2D_attrs)/sizeof(*CanvasRenderingContext2D_attrs),
      CanvasRenderingContext2D_callbacks, sizeof(CanvasRenderingContext2D_callbacks)/sizeof(*CanvasRenderingContext2D_callbacks));
  v8::Local<v8::ObjectTemplate> instance = desc->InstanceTemplate();
  v8::Local<v8::ObjectTemplate> proto = desc->PrototypeTemplate();
  

  // Custom toString template
  desc->Set(getToStringName(), getToStringTemplate());
  return desc;
}

v8::Persistent<v8::FunctionTemplate> V8CanvasRenderingContext2D::GetRawTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CanvasRenderingContext2D_raw_cache_ = createRawTemplate();
  return V8CanvasRenderingContext2D_raw_cache_;
}

v8::Persistent<v8::FunctionTemplate> V8CanvasRenderingContext2D::GetTemplate() {
  static v8::Persistent<v8::FunctionTemplate> V8CanvasRenderingContext2D_cache_ = ConfigureV8CanvasRenderingContext2DTemplate(GetRawTemplate());
  return V8CanvasRenderingContext2D_cache_;
}

CanvasRenderingContext2D* V8CanvasRenderingContext2D::toNative(v8::Handle<v8::Object> object) {
  return reinterpret_cast<CanvasRenderingContext2D*>(object->GetPointerFromInternalField(v8DOMWrapperObjectIndex));
}

bool V8CanvasRenderingContext2D::HasInstance(v8::Handle<v8::Value> value) {
  return GetRawTemplate()->HasInstance(value);
}


v8::Handle<v8::Object> V8CanvasRenderingContext2D::wrap(CanvasRenderingContext2D* impl) {
  v8::Handle<v8::Object> wrapper;
  V8Proxy* proxy = 0;
  wrapper = getDOMObjectMap().get(impl);
  if (!wrapper.IsEmpty())
    return wrapper;
  wrapper = V8DOMWrapper::instantiateV8Object(proxy, V8ClassIndex::CANVASRENDERINGCONTEXT2D, impl);
  if (wrapper.IsEmpty())
    return wrapper;

  impl->ref();
  getDOMObjectMap().set(impl, v8::Persistent<v8::Object>::New(wrapper));
  return wrapper;
}

v8::Handle<v8::Value> toV8(PassRefPtr<CanvasRenderingContext2D > impl) {
  return toV8(impl.get());
}

v8::Handle<v8::Value> toV8(CanvasRenderingContext2D* impl) {
  if (!impl)
    return v8::Null();
  return V8CanvasRenderingContext2D::wrap(impl);
}
} // namespace WebCore