package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpatialTransformationLayer
 *
 * Full name:        System`SpatialTransformationLayer
 *
 *                   SpatialTransformationLayer[{h, w}] represents a net layer that applies an affine transformation to an input of size c × h  × w  and returns an output of size c × h × w.
 * Usage:                                                                                                                                     0    0
 *
 *                   Input -> Automatic
 *                   Output -> Automatic
 * Options:          Parameters -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpatialTransformationLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpatialTransformationLayer.html
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
fun spatialTransformationLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpatialTransformationLayer", arguments.toMutableList(), options)
}
