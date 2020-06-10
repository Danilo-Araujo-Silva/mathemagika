package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ContrastiveLossLayer
 * 
 * Full name:        System`ContrastiveLossLayer
 * 
 *                   ContrastiveLossLayer[] represents a loss layer that computes a loss based on a distance metric and a target that specifies whether the distance should be minimized or maximized.
 * Usage:            ContrastiveLossLayer[margin] specifies a distance above which the loss is zero for True targets.
 * 
 *                   Input -> Automatic
 *                   Loss -> Automatic
 * Options:          Target -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ContrastiveLossLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContrastiveLossLayer.html
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
fun contrastiveLossLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContrastiveLossLayer", arguments.toMutableList(), options)
}
