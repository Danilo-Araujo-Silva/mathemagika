package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Mouseover
 *
 * Full name:        System`Mouseover
 *
 * Usage:            Mouseover[expr, over] represents an object that displays as over when the mouse pointer is over it, and as expr otherwise.
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> {}
 *                   FrameMargins -> 0
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   TransitionDirection -> Left
 *                   TransitionDuration -> 0.5
 * Options:          TransitionEffect -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Mouseover
 * Documentation:    web: http://reference.wolfram.com/language/ref/Mouseover.html
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
fun mouseover(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Mouseover", arguments.toMutableList(), options)
}
