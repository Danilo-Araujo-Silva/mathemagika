package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PoolingLayer
 * 
 * Full name:        System`PoolingLayer
 * 
 *                   PoolingLayer[sz] represents a pooling net layer using kernels of size sz.
 *                   PoolingLayer[{w}] represents a layer performing one-dimensional pooling with kernels of size w.
 *                   PoolingLayer[{h, w}] represents a layer performing two-dimensional pooling with kernels of size h × w.
 *                   PoolingLayer[{h, w, d}] represents a layer performing three-dimensional pooling with kernels of size h × w × d.
 *                   PoolingLayer[kernel, stride] represents a layer that uses stride as the step size between kernel applications.
 * Usage:            PoolingLayer[kernel, opts] includes options for other pooling methods, padding and other parameters.
 * 
 *                   Function -> Max
 *                   Input -> Automatic
 *                   Interleaving -> False
 *                   Output -> Automatic
 * Options:          PaddingSize -> 0
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PoolingLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/PoolingLayer.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun poolingLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PoolingLayer", arguments.toMutableList(), options)
}
