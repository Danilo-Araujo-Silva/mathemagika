package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TouchscreenAutoZoom
 *
 * Full name:        System`TouchscreenAutoZoom
 *
 * Usage:            TouchscreenAutoZoom is an option for Manipulate and Graphics3D that determines whether the interface zooms to full-screen when it is activated by touching it on supported touch screen platforms.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TouchscreenAutoZoom
 * Documentation:    web: http://reference.wolfram.com/language/ref/TouchscreenAutoZoom.html
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
fun touchscreenAutoZoom(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TouchscreenAutoZoom", arguments.toMutableList(), options)
}
