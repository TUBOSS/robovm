/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.modelio;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLScatteringFunction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLNamed/*</implements>*/ {

    /*<ptr>*/public static class MDLScatteringFunctionPtr extends Ptr<MDLScatteringFunction, MDLScatteringFunctionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLScatteringFunction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLScatteringFunction() {}
    protected MDLScatteringFunction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "baseColor")
    public native MDLMaterialProperty getBaseColor();
    @Property(selector = "emission")
    public native MDLMaterialProperty getEmission();
    @Property(selector = "specular")
    public native MDLMaterialProperty getSpecular();
    @Property(selector = "materialIndexOfRefraction")
    public native MDLMaterialProperty getMaterialIndexOfRefraction();
    @Property(selector = "interfaceIndexOfRefraction")
    public native MDLMaterialProperty getInterfaceIndexOfRefraction();
    @Property(selector = "normal")
    public native MDLMaterialProperty getNormal();
    @Property(selector = "ambientOcclusion")
    public native MDLMaterialProperty getAmbientOcclusion();
    @Property(selector = "ambientOcclusionScale")
    public native MDLMaterialProperty getAmbientOcclusionScale();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
